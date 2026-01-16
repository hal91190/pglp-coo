package fr.uvsq.coo.builder;

import java.awt.Color;
import java.awt.geom.Point2D;

// tag::streetmap-class[]
public class StreetMap {
  private final Point2D origin;
  private final Point2D destination;

  private final Color waterColor;
  private final Color landColor;
  private final Color highTrafficColor;
  private final Color mediumTrafficColor;
  private final Color lowTrafficColor;

  // tag::streetmap-builder[]
  public static class Builder {
    // Required parameters
    private final Point2D origin;
    private final Point2D destination;

    // Optional parameters - initialize with default values
    private Color waterColor         = Color.BLUE;
    private Color landColor          = new Color(30, 30, 30);
    private Color highTrafficColor   = Color.RED;
    private Color mediumTrafficColor = Color.YELLOW;
    private Color lowTrafficColor    = Color.GREEN;

    public Builder(Point2D origin, Point2D destination) {
      this.origin      = origin;
      this.destination = destination;
    }

    public Builder waterColor(Color color) {
      waterColor = color;
      return this;
    }

    // idem pour landColor, highTrafficColor, mediumTrafficColor
    // et lowTrafficColor

    public StreetMap build() {
      return new StreetMap(this);
    }
  }
  // end::streetmap-builder[]

  private StreetMap(Builder builder) {
    // Required parameters
    origin      = builder.origin;
    destination = builder.destination;

    // Optional parameters
    waterColor         = builder.waterColor;
    landColor          = builder.landColor;
    highTrafficColor   = builder.highTrafficColor;
    mediumTrafficColor = builder.mediumTrafficColor;
    lowTrafficColor    = builder.lowTrafficColor;
  }

  Color getLandColor() {
    return landColor;
  }
}
// end::streetmap-class[]
