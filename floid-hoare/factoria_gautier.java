
public static final int factorial (int n) {
  // n >= 0 (assumed)
  int r = 1;
  int t = n;
  // r == 1 && t == n && t >= 0
  // r == n! / t! (loop invariant)
  while (t > 0) 
  // r == n! / t! (loop invariant)
  {
    // r * t == (n! / t!) * t
    // r * t == (n! / (t - 1)! * t) * t (by definition of factorial)
    // r * t == n! / (t - 1)! (reduction of fractions)
    r = r * t;
    // r == n! / (t - 1)!  (by assignment Hoare rule)
    t = t − 1; 
    // r == n! / t! (loop invariant)
  }
  // t == 0 
  // r == n! / t!  (loop invariant)
  // 0! == 1 (by definition)
  // r == n! (desired)
  return r ;
}


