package com.generation.pokemon;

/**
 * Interfaz Pokemon
 */

public interface IPokemon {

  /**
   * Método ataca, "pokemon" recibe daño realizado por
   * el Pokemon que llama a esta función
   * @param pokemon
   */
  void ataca(IPokemon pokemon);

  /**
   * Método Pokemon atacadoPorFuego, modifica la vida de un Pokemon
   * de acuerdo al daño hecho por un Pokemon tipo Fuego
   * @param pkm
   */
  void atacadoPorFuego (PkmFuego pkm);
  /**
   * Método atacadoPorAgua, modifica la vida de un Pokemon
   * de acuerdo al daño hecho por un Pokemon tipo Agua
   * @param pkm
   */
  void atacadoPorAgua (PkmAgua pkm);

  /**
   * Método atacadoPorPlanta, modifica la vida de un Pokemon
   * de acuerdo al daño hecho por un Pokemon tipo Planta
   * @param pkm
   */
  void atacadoPorPlanta (PkmPlanta pkm);
}
