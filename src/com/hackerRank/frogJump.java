package com.hackerRank;

public class frogJump {
    private static int checkDistance(int start, int[] blocks) {
        //The following values will control the amount of jumps can be performed in each direction.
        int left = start;
        int right = start;
        //Boolean values to check allowed movement
        boolean goLeft = true;
        boolean goRight = true;
        while (goLeft || goRight) {
            //Checking and adjusting the values of boolean variable based on possible movements.
            //If the right block is greater that the current block, and we are not at the end of the blocks than we can move right.
            //else the movement to the right will be restricted.
            if (right < (blocks.length - 1) && (blocks[right + 1] >= blocks[right])) right++;
            else goRight = false;

            // Checking the left side of the array values(blocks).
            if (left > 0 && (blocks[left - 1] >= blocks[left])) left--;
            else goLeft = false;
        }
        return right - left + 1;
    }

    public int solution(int[] blocks) {
        //skipping the condition where is only one block.
        if (blocks.length == 1) {
            return 1;
        }

        int max = 0;
        for (int i = 0; i < blocks.length; i++) {
            int distance = checkDistance(i, blocks);
            max = Math.max(distance, max);
            if (max == blocks.length) {
                break;
            }
        }
        return max;
    }
}
