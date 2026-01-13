package fr.uvsq.coo.solid.ocp;

// tag::shape-wrong[]
public abstract class ShapeWrong {
  public final BadIdeaShapeType type; //<1>

  public ShapeWrong(BadIdeaShapeType type) {
    this.type = type;
  }
}
// end::shape-wrong[]
