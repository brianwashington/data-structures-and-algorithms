package dp;

/**
 * Created by bino on 11/22/17.
 */
public class RodCutting {

  public int cutRod(int[] p, int n) {
    if(n == 0) {
      return 0;
    }

    int q = Integer.MIN_VALUE;

    for(int i=0; i<n; i++) {
      q = Math.max(q, p[i] + cutRod(p, n-(i+1)));
    }

    return q;
  }
}
