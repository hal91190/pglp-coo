package fr.uvsq.coo.solid.ocp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class GeoComputeTest {
  private static final double EPSILON = 1E-8;

  @Test
  public void testComputeAreaWrong() {
    ShapeWrong circle = new CircleWrong(new Point2D.Double(0, 0), 2);
    assertEquals(Math.PI * 4, GeoComputeWrong.computeAreaWrong(circle), EPSILON);

    ShapeWrong square = new SquareWrong(new Point2D.Double(0, 0), 3);
    assertEquals(9.0, GeoComputeWrong.computeAreaWrong(square), EPSILON);
  }

  @Test
  public void testComputeArea() {
    // tag::compute-area[]
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(new Point2D.Double(1.0, 1.0), 1.0));
    shapes.add(new Square(new Point2D.Double(3.0, 4.0), 2.0));

    double total = shapes.stream()
        .mapToDouble(Shape::computeArea)
        .sum();
    // end::compute-area[]
    assertEquals((Math.PI * 1.0) + (2.0 * 2.0), total, EPSILON);
  }
}
