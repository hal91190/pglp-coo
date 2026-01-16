package fr.uvsq.coo.singleton;

// tag::main-as-an-enum[]
public enum MainAsAnEnum {
  INSTANCE;

  public void run(String[] args) {
    // ...
  }

  public static void main(String[] args) {
    INSTANCE.run(args);
  }
}
// end::main-as-an-enum[]
