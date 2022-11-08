package com.generation.pokemon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractPokemonTest {
  private String nombre1 = "1";
  private String nombre2 = "2";
  private String nombre3 = "3";
  private int vida = 30;
  private String especie1 = "e1";
  private String especie2 = "e2";
  private String especie3 = "e3";
  private PkmPlanta pkmPlanta;
  private PkmFuego pkmFuego;
  private PkmAgua pkmAgua;
  private PkmFuego pkmMuerto;

  @BeforeEach
  void setUp() {
    pkmAgua = new PkmAgua(nombre1, especie1, vida);
    pkmFuego = new PkmFuego(nombre2, especie2, vida);
    pkmPlanta = new PkmPlanta(nombre3, especie3, vida);
    pkmMuerto = new PkmFuego("ejPkmMuerto", "fuego", 0);
  }

  @Test
  void testConstructor() {
    var expected = new PkmFuego(nombre2, especie2, vida);
    assertEquals(expected, pkmFuego);
  }

  @Test
  void testAtacadoPor() {
    var expected = new PkmFuego(nombre2, especie2, 0);
    var expected1 = new PkmAgua(nombre1, especie1, 0);
    var expected2 = new PkmPlanta(nombre3, especie3, 1);
    pkmFuego.atacadoPor(vida);
    pkmAgua.atacadoPor(vida+1);
    pkmPlanta.atacadoPor(29);
    assertEquals(expected, pkmFuego);
    assertEquals(expected2, pkmPlanta);
    assertEquals(expected1, pkmAgua);
  }

  @Test
  void fueraDeCombateTest() {
    assertFalse(pkmAgua.fueraDeCombate());
    assertTrue(pkmMuerto.fueraDeCombate());
  }

  @Test
  void testGetNombre() {
    assertEquals(nombre1, pkmAgua.getNombre());
  }

  @Test
  void testGetVida() {
    assertEquals(vida, pkmPlanta.getVida());
    assertNotEquals(vida, pkmMuerto.getVida());

  }

  @Test
  void testSetVida() {
    var expected = new PkmFuego(nombre2, especie2, vida-5);
    pkmFuego.setVida(vida-5);
    assertEquals(expected, pkmFuego);
  }

  @Test
  void testGetAtaque() {
    assertEquals(5, pkmMuerto.getAtaque());
  }

  @Test
  void testGetEspecie() {
    assertEquals(especie1, pkmAgua.getEspecie());
    assertEquals(especie2, pkmFuego.getEspecie());
    assertEquals(especie3, pkmPlanta.getEspecie());
  }
}