package com.equipo.saludo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  public void testSaludo() {
    assertEquals("¡Hola, DevOps!", App.saludar("DevOps"));
  }
}
