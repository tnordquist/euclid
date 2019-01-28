package edu.cnm.deepdive;

public class GCD {

  public static long gcd(long a, long b) {

    a = Math.abs(a);
    b = Math.abs(b);

    if (a == 0) {
      if (b == 0) {
        throw new ArithmeticException("GCD(0,0) is undefined.");
      }

      return b; // if we get here we know b is not equal to zero.
    }

    if (b == 0) {
      return a;
    }

    while (b != 0 && a != 0) {
      if (a > b) {
        a %= b;
      } else {
        b %= a;
      }

      if (a != 0) {
        return a;
      } else {
        return b;
      }
    }
    return a;
  }
}
