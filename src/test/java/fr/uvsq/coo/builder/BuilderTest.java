package fr.uvsq.coo.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.awt.Color;
import java.awt.geom.Point2D;

public class BuilderTest {
  @Test
  public void testStreetMapBuilder() {
    Point2D origin = new Point2D.Double(0, 0);
    Point2D destination = new Point2D.Double(10, 10);

    // tag::streetmap-test[]
    StreetMap map = new StreetMap
      .Builder(origin, destination)
      .waterColor(Color.BLUE)
      .build();

      assertEquals(Color.GRAY, map.getLandColor());
      //...
    // end::streetmap-test[]
  }
}
