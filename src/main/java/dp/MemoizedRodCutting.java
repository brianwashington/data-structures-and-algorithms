package dp;

/**
 * Created by bino on 11/22/17.
 */
public class MemoizedRodCutting {

  public int cutRod(int[] p, int n) {
    int[] r = new int[n+1];

    for(int i=0; i<=n; i++) {
      r[i] = Integer.MIN_VALUE;
    }

    return cutRodAux(p, n, r);
  }

  public int cutRodAux(int[] p, int n, int[] r) {
    if(r[n] >= 0) {
      return r[n];
    }

    int q;

    if(n == 0) {
      q = 0;
    } else {
      q = Integer.MIN_VALUE;

      for(int i=0; i<n; i++) {
        q = Math.max(q, p[i] + cutRodAux(p, n-(i+1), r));
      }
    }

    r[n] = q;
    return q;
  }
}
