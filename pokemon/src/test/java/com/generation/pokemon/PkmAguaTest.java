package com.generation.pokemon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PkmAguaTest {
  private String nombre1 = "1";
  private String nombre2 = "2";
  private String nombre3 = "3";
  private int vida = 30;
  private String especie1= "e1";
  private String especie2= "e2";
  private String especie3= "e3";
  private PkmPlanta pkmPlanta;
  private PkmFuego pkmFuego;
  private PkmAgua pkmAgua;

  @BeforeEach
  void setUp() {
    pkmAgua = new PkmAgua(nombre1, especie1, vida);
    pkmFuego = new PkmFuego(nombre2, especie2, vida);
    pkmPlanta = new PkmPlanta(nombre3, especie3, vida);
  }

  @Test
  void testConstructor() {
    var expected = new PkmAgua(nombre1, especie1, vida);
    assertEquals(expected, pkmAgua);
    var unexpected = new PkmAgua(nombre2, especie1, vida);
    assertNotEquals(unexpected, pkmAgua);
  }

  @Test
  void atacadoPorPlanta() {
    var expected = new PkmAgua(nombre1, especie1, vida-10);
    pkmAgua.atacadoPorPlanta(pkmPlanta);
    assertEquals(expected, pkmAgua);
  }

  @Test
  void atacarTest() {
    var tipoAgua = new PkmAgua("ejemplo", "agua", vida);
    var expected1 = new PkmAgua(nombre1, especie1, vida-5);
    var expected2 = new PkmFuego(nombre2, especie2, vida-10);
    var expected3 = new PkmPlanta(nombre3, especie3, vida-5);
    tipoAgua.ataca(pkmFuego);
    tipoAgua.ataca(pkmPlanta);
    tipoAgua.ataca(pkmAgua);
    assertEquals(expected1, pkmAgua);
    assertEquals(expected2, pkmFuego);
    assertEquals(expected3, pkmPlanta);
  }
}