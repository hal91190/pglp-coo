package fr.uvsq.coo.singleton;

// tag::main-as-a-class[]
public class MainAsaClass {
  private static MainAsaClass INSTANCE; // L'instance unique

  private MainAsaClass() { // Constructeur privé
    // ...
  }

  public static MainAsaClass getInstance() {
    if (INSTANCE == null) { // Crée l'instance au premier appel
      INSTANCE = new MainAsaClass();
    }
    return INSTANCE;
  }

  public void run(String[] args) {
    // ...
  }

  public static void main(String[] args) {
    getInstance().run(args);
  }
}
// end::main-as-a-class[]
