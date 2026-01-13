package fr.uvsq.coo.solid.ocp;

import java.awt.geom.Point2D;

// tag::circle-wrong[]
public class CircleWrong extends ShapeWrong {
  Point2D center;
  double radius;

  public CircleWrong(Point2D center, double radius) {
    super(BadIdeaShapeType.CIRCLE);
    this.center = center;
    this.radius = radius;
  }
}
// end::circle-wrong[]
