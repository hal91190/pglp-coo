package fr.uvsq.coo.solid.ocp;

import java.awt.geom.Point2D;

// tag::square-wrong[]
public class SquareWrong extends ShapeWrong {
  Point2D topLeft;
  final double side;

  public SquareWrong(Point2D topLeft, double side) {
    super(BadIdeaShapeType.SQUARE);
    this.topLeft = topLeft;
    this.side = side;
  }
}
// end::square-wrong[]
