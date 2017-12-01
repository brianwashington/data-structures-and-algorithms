package dp;

/**
 * Created by bino on 11/24/17.
 */
public class ExtendedBottomUpRodCutting {
  private int[] r;
  private int[] s;

  public ExtendedBottomUpRodCutting(int n) {
    this.r = new int[n+1];
    this.s = new int[n+1];
    this.r[0] = 0;
  }

  public int cutRod(int[] p, int n) {
    for(int j=1; j<=n; j++) {
      int q = Integer.MIN_VALUE;

      for(int i=1; i<=j; i++) {
        if(q < p[i] + this.r[j-i]) {
          q = p[i] + this.r[j-i];
          this.s[j] = i;
        }
      }
      this.r[j] = q;
    }
    return this.r[n];
  }

  public void print(int[] p, int n) {
    while(n > 0) {
      System.out.print(this.s[n] + " ");
      n = n - this.s[n];
    }
    System.out.println();
  }
}
