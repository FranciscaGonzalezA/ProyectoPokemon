package com.generation.pokemon;

/**
 * Clase Pokemon tipo Agua
 */

public class PkmAgua extends AbstractPokemon {

  public PkmAgua(String nombre, String especie, int vida) {
    super(nombre, especie, vida, "Agua");
  }

  @Override
  public void ataca(IPokemon pokemon) {
    pokemon.atacadoPorAgua(this);
  }

  @Override
  public void atacadoPorPlanta(PkmPlanta pkm) {
    this.atacadoPor(pkm.getAtaque()*2);
  }

  @Override
  public boolean equals(Object pkm) {
    if(pkm instanceof PkmAgua) {
      return ((PkmAgua)pkm).getNombre().equals(this.getNombre()) &&
              ((PkmAgua)pkm).getEspecie().equals(this.getEspecie()) &&
              ((PkmAgua)pkm).getVida() == (this.getVida());
    }
    return false;
  }
}
