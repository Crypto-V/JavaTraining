package com.codewars;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class SameArrays {


    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        int[] aSquared = Arrays.stream(a).map(x -> x * x).toArray();
        Arrays.sort(aSquared);
        Arrays.sort(b);
        return Arrays.equals(aSquared, b);
    }


    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertTrue(SameArrays.comp(a, b));
    }
}
