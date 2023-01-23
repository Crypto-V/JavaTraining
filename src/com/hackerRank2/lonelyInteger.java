package com.hackerRank2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class lonelyInteger {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(){
            @Override
            public boolean add(Integer integer) {
                return super.add(integer);
            }
        };

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(3);
        ints.add(2);
        ints.add(1);
        System.out.println(lonelyinteger(ints));

    }

    public static int lonelyinteger(List<Integer> a) {
        int result = 0;
        for(int i:a)
        {
            if(a.indexOf(i)==a.lastIndexOf(i))
            {
                result = i;
                break;
            }
        }
        return result;
    }
}

//        int number = 0;
//
//        for (int n: a) {
//            number ^= n;
//        }
//        return number;
