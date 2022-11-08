package com.generation.pokemon;

/**
 * Clase Pokemon tipo Planta
 */

public class PkmPlanta extends AbstractPokemon{

  public PkmPlanta(String nombre, String especie, int vida) {
    super(nombre, especie, vida, "Planta");
  }

  @Override
  public void ataca(IPokemon pokemon) {
    pokemon.atacadoPorPlanta(this);
  }

  @Override
  public void atacadoPorFuego(PkmFuego pkm) {
    this.atacadoPor(pkm.getAtaque()*2);
  }

  @Override
  public boolean equals(Object pkm) {
    if(pkm instanceof PkmPlanta) {
      return ((PkmPlanta)pkm).getNombre().equals(this.getNombre()) &&
              ((PkmPlanta)pkm).getEspecie().equals(this.getEspecie()) &&
              ((PkmPlanta)pkm).getVida() == (this.getVida());
    }
    return false;
  }
}
