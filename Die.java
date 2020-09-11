class Die {
  private int value;

  public Die roll() {
    value = (int)(Math.random() * 6 + 1);
    return this;
  }

  public int read() {
    return value;
  }
}
