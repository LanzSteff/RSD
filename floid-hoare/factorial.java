public static final int factorial (int n) {
	// n >= 0 (assumed)
	int r = 1;
	int t = n;
	// r == 1 && t == n
	// n! == n * (n-1)!
	while (t>0) {
		r = r*t;
		t = t−1;
	}
	return r ;
}
