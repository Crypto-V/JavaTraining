package com.codewars;

import java.util.ArrayList;
import java.util.List;


/**
 * Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.
 * <p>
 * Rules for a smiling face:
 * <p>
 * Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
 * A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
 * Every smiling face must have a smiling mouth that should be marked with either ) or D
 * No additional characters are allowed except for those mentioned.
 * <p>
 * Valid smiley face examples: :) :D ;-D :~)
 * Invalid smiley faces: ;( :> :} :]
 */

public class SmileyFace {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)");
        a.add(":)");
        a.add("x-]");
        a.add(":ox");
        a.add(";-(");
        a.add(";-)");
        a.add(";~(");
        a.add(":~D");
        System.out.println(countSmileys(a));
    }

//Short Version
    public static int countSmileys(List<String> arr) {
        String validSmileRegExp = "[:;][-~]?[)D]";
        int smiles = 0;
        for (String smile : arr) {
            if (smile.matches(validSmileRegExp)) {
                smiles += 1;
            }
        }
        return smiles;
    }


//Long Version
//    public static int countSmileys(List<String> arr) {
//        String validSmileyFaces =  ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";
//        int counter = 0;
//
//        for (int i =0; i < arr.size(); i++){
//
//            if (validSmileyFaces.contains(arr.get(i))){
//                counter++;
//            }
//        }
//        return counter;
//    }
}
