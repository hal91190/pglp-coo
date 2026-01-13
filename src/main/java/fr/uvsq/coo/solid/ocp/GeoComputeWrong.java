package fr.uvsq.coo.solid.ocp;

public class GeoComputeWrong {
  // tag::compute-area-wrong[]
  public static double computeAreaWrong(ShapeWrong s) {
    double result = 0;
    switch (s.type) {
      case CIRCLE:
        var c = (CircleWrong) s;
        result = c.radius * c.radius * Math.PI;
        break;
      case SQUARE:
        var sq = (SquareWrong) s;
        result = sq.side * sq.side;
        break;
      default:
        assert false : s.type;
    }
    return result;
  }
  // end::compute-area-wrong[]
}
