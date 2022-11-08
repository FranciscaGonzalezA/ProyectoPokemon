package com.generation.pokemon;

/**
 * Clase Pokemon tipo Fuego
 */

public class PkmFuego extends AbstractPokemon {

  public PkmFuego(String nombre, String especie, int vida) {
    super(nombre, especie, vida, "Fuego");
  }

  @Override
  public void ataca(IPokemon pokemon) {
    pokemon.atacadoPorFuego(this);
  }

  @Override
  public void atacadoPorAgua(PkmAgua pkm) {
    this.atacadoPor(pkm.getAtaque()*2);
  }

  @Override
  public boolean equals(Object pkm) {
    if(pkm instanceof PkmFuego) {
      return ((PkmFuego)pkm).getNombre().equals(this.getNombre()) &&
              ((PkmFuego)pkm).getEspecie().equals(this.getEspecie()) &&
              ((PkmFuego)pkm).getVida() == (this.getVida());
    }
    return false;
  }
}
