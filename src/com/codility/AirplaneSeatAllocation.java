package com.codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * you are processing the seat reservations the plane has
 * N rows of seats from 1 to N there are 10 seats in each
 * nrow from letter a to K with omited . The list of the
 * seats is given as a String S of length M containing seat
 * numbers separated by singles spaces such as "1A 3C 2B" the
 * reserved seats can be in any order in the list. The task is
 * to allocate seats for as many as four person families as possible.
 * A four person family ocupies 4 seats in one row that are next to each other,
 * members can be separted by the aisle, if they are separted by the aisle its required
 * for 2 members two seat on each side, write a function that returns the maximum number
 * of four person families that can be seated in the remaining unreserved seats.
 * If its given N=2 and S ="1A 2F 1C" the function will return 2
 */

public class AirplaneSeatAllocation {
    public static void main(String[] args) {
        System.out.println(solution(22, "1A 3C 2B 20G 5A"));
    }

    static int solution(int N, String S) {

        if(S.isEmpty()) return 2;
        //Making sure that there will be no duplicates, and spliting the string to have each individual reserved seats.
        Set<String> reserved = new HashSet<>(Arrays.asList(S.split(" ")));
        int families = 0;

        //I assumed that the pattern will be exactly like in the picture so in this case we don't need A adn K seat
        // since it is at the end and the rulles says that that if is the aisle that there should be 2 persons on each side.
        //All other seats i stored in boolean value for further use.
        for (int row = 1; row <= N; row++) {
            boolean b = reserved.contains(row + "B");
            boolean c = reserved.contains(row + "C");
            boolean d = reserved.contains(row + "D");
            boolean e = reserved.contains(row + "E");
            boolean f = reserved.contains(row + "F");
            boolean g = reserved.contains(row + "G");
            boolean h = reserved.contains(row + "H");
            boolean j = reserved.contains(row + "J");


            //The only seats that will work will be BCDE, DEFG, FGHJ.
            if(!b && !c && !d && !e && !f && !g && !h && !j)
                families +=2;
            else if (!b && !c && !d && !e)
                families++;
            else if (!d && !e && !f && !g)
                families++;
            else if (!f && !g && !h && !j)
                families++;

        }

        return families;
    }
}
