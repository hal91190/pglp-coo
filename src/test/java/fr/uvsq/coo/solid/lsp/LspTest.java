package fr.uvsq.coo.solid.lsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LspTest {
  @Test
  public void testRectangle() {
    // tag::test-rectangle[]
    Rectangle rect = new Rectangle();
    rect.setHeight(3);
    rect.setWidth(4);
    assertEquals(12, rect.getHeight() * rect.getWidth(), "Area should be 12");
    // end::test-rectangle[]
  }

  @Test
  public void testLspViolation() {
    // tag::test-lsp-violation[]
    Rectangle rect = new SquareWrong();
    rect.setHeight(3);
    rect.setWidth(4);
    assertEquals(12, rect.getHeight() * rect.getWidth(), "Area should be 12");
    // end::test-lsp-violation[]
  }
}
