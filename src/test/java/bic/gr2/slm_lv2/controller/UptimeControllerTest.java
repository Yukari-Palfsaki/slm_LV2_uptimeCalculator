package bic.gr2.slm_lv2.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UptimeControllerTest {

  @Test
  void calculateProgram() {
    // A - Arrange (vorbereiten, d.h. eine Instanz der Klasse anlegen
    var controller = new UptimeController();
    // A - Act (Test ausfuehren, d.h. die Methode mit Testdaten ausfuehren)
    var result = controller.calculateProgram(0.0);
    // A - Assert (Vergleiichen, ob das Ergebnis  entspricht)
    assertEquals(0.0, result);
  }


  @Test
  void calculateMinuteProgram() {
    assertEquals(0, 0);
  }
}