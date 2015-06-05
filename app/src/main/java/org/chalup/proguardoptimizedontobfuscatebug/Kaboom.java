package org.chalup.proguardoptimizedontobfuscatebug;

public class Kaboom {
  public void boom(int i) {
    if (i % 2 == 0) {
      new One(i).toString("boom");
    } else {
      boom(i);
    }
  }

  public static class One {
    public final int i;

    public One(int i) {
      this.i = i;
    }

    public String toString(String s) {
      return Other.forString(s).toString(this);
    }
  }

  public static class Other {
    private final String s;

    private Other(String s) {
      this.s = s;
    }

    public static Other forString(String s) {
      return new Other(s);
    }

    public String toString(One one) {
      return s.substring(one.i);
    }
  }
}
