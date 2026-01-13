package fr.uvsq.coo.solid.ocp;

import static java.lang.Math.PI;

import java.awt.geom.Point2D;

// tag::circle[]
public class Circle extends Shape {
  private final Point2D center;
  private final double radius;
  
  public Circle(Point2D center, double radius) {
    this.center = center;
    this.radius = radius;
  }
  
  @Override
  public double computeArea() {
    return PI * radius * radius;
  }
}
// end::circle[]
