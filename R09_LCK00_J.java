public class R09_LCK00_J {
    public class SomeObject {
  private final Object lock = new Object(); // private final lock object

  public void changeValue() {
    synchronized (lock) { // Locks on the private Object
      // ...
    }
  }
}
}
