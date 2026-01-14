package fr.uvsq.coo.solid.lsp;

// tag::square-wrong[]
public class SquareWrong extends Rectangle {
  private void setSide(int side) {
    super.setWidth(side);
    super.setHeight(side);
  }

  @Override
  public void setWidth(int width) {
    setSide(width);
  }

  @Override
  public void setHeight(int height) {
    setSide(height);
  }
}
// end::square-wrong[]
