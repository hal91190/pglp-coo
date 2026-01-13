package fr.uvsq.coo.solid.ocp;

import java.awt.geom.Point2D;

// tag::square[]
public class Square extends Shape {
  private final Point2D topLeft;
  private final double side;
  
  public Square(Point2D topLeft, double side) {
    this.topLeft = topLeft;
    this.side = side;
  }
  
  @Override
  public double computeArea() {
    return side * side;
  }
}
// end::square[]
