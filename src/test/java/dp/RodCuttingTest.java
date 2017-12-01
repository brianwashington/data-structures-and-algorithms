package dp;

import org.junit.Test;

/**
 * Created by bino on 11/22/17.
 */
public class RodCuttingTest {

  @Test
  public void cutTest() {
    RodCutting rc = new RodCutting();
    int[] p = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30,
            1, 5, 8, 9, 10, 17, 17, 20, 24, 30,
            1, 5, 8, 9, 10, 17, 17, 20, 24, 30,
            1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

    //int val = rc.cutRod(p, 30);
    MemoizedRodCutting mrc = new MemoizedRodCutting();

    int val = mrc.cutRod(p, 3);
    System.out.println(val);
  }

  @Test
  public void bottomUpTest() {
    int[] p = { 0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30,
            1, 5, 8, 9, 10, 17, 17, 20, 24, 30,
            1, 5, 8, 9, 10, 17, 17, 20, 24, 30,
            1, 5, 8, 9, 10, 17, 17, 20, 24, 30};

    BottomUpRodCutting burc = new BottomUpRodCutting();
    int val = burc.cutRod(p, 9);
    System.out.println(val);
  }

  @Test
  public void extendedBottomUpTest() {
    int[] p = { 0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30,
            1, 5, 8, 9, 10, 17, 17, 20, 24, 30,
            1, 5, 8, 9, 10, 17, 17, 20, 24, 30,
            1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
    int n = 9;

    ExtendedBottomUpRodCutting eburc = new ExtendedBottomUpRodCutting(n);
    int val = eburc.cutRod(p, n);
    eburc.print(p, n);
    System.out.println(val);
  }
}
