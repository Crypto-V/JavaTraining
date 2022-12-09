package com.hackerRank;

import java.util.Arrays;

public class rolledDice {

    public static void main(String[] args) {
        int[] array = solution(new int[]{3, 2, 4, 3}, 2, 4);
        System.out.println(Arrays.toString(array));
    }

    public static int[] solution(int[] A, int F, int M) {
        int totalSize = A.length + F;
        int givenTotal = Arrays.stream(A).sum();
        // mean = (sum of given values + x) / (size given array+ required guesses).
        //Extracting the x from the equation will result in the following.
        int x = M * totalSize;
        int required = x - givenTotal;

        int[] result = new int[F];
        //Variable canBe will check if the solution is possible without passing the number 6.
        int canBe = required / F;
        int reminder = required % F;
        if (required <= 0 || required < F) return new int[]{};
        //Checking if the value 6 will satisfy the requirement.
        if (canBe == 6 && reminder == 0) {
            for (int i = 0; i < result.length; i++) {
                result[i] = canBe;
            }
        } else if (canBe > 6) return new int[]{};
        else {
            int index = 0;
            while (index < F) {
                result[index] += 1;
                index++;
            }
        }
        return result;
    }
}
