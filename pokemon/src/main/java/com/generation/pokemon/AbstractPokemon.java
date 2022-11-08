package com.generation.pokemon;

/**
 * Clase AbstractPokemon
 * La clase abstracta AbstractPokemon, implementa la Interfaz
 * IPokemon y agrupa los métodos comunes para todo tipo de Pokemon
 * (Fuego, Agua, Planta, etc.)
 */

public abstract class AbstractPokemon implements IPokemon{
  private final String nombre;
  private final String especie;
  private int vida;
  private final String tipo;
  private final int ataque = 5;

  /**
   * Constructor de la clase AbstractPokemon
   *
   * @param nombre
   * @param especie
   * @param vida
   * @param tipo
   */
  public AbstractPokemon(String nombre, String especie, int vida, String tipo) {
    this.nombre = nombre;
    this.especie = especie;
    this.vida = vida;
    this.tipo = tipo;
  }

  public abstract void ataca(IPokemon pokemon);

  /**
   * Método atacadoPor, reduce la vida del Pokemon que invoca la función
   * de acuerdo al daño entregado entregado al parámetro dam
   * @param dam
   */
  void atacadoPor(int dam){
    if(dam >= this.getVida()){
      this.setVida(0);
    } else {
      this.setVida(this.getVida() - dam);
    }
  }

  @Override
  public void atacadoPorFuego(PkmFuego pkmFuego){
    this.atacadoPor(pkmFuego.getAtaque());
  }

  @Override
  public void atacadoPorAgua (PkmAgua pkm) {
    this.atacadoPor(pkm.getAtaque());
  }

  @Override
  public void atacadoPorPlanta (PkmPlanta pkm){
    this.atacadoPor(pkm.getAtaque());
  }

  /**
   * El método fueraDeCombate indica false si el Pokemon puede seguir
   * combatiendo (vida > 0) o true si ha quedado fuera de combate (vida<=0)
   * @return
   */
  public boolean fueraDeCombate() {
    return this.getVida() <= 0;
  }

  /**
   * Retorna el nombre del Pokemon
   * @return
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Retorna la vida del Pokemon
   * @return
   */
  public int getVida() {
    return vida;
  }

  /**
   * Da nuevo valor al parámetro vida del Pokemon
   * @param nuevaVida
   */
  void setVida(int nuevaVida) {
    this.vida = nuevaVida;
  }

  /**
   * Retorna valor del ataque del Pokemon
   * @return
   */
  public int getAtaque() {
    return ataque;
  }

  /**
   * Retorna especie del Pokemon
   * @return
   */
  public String getEspecie() {
    return especie;
  }


  /**
   * Retorna el tipo del Pokemon
   * @return
   */
  public String getTipo() {
    return tipo;
  }
}
