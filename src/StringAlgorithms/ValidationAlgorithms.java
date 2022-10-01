package StringAlgorithms;

public class ValidationAlgorithms {
//    With this algorithm you can validate if the given input has certain parameters or attributes.
//   Example:  Check if string have all upper or lower case letter.
//    Normally the output is boolean

        // This algorithm will check if all letter are uppercase.?
    public static boolean isUppercase(String s) {
        // returns true if all uppercase and false if not.
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowercase(String s){
        // Another way is to use noneMatch:
        // s.chars().noneMatch(Character::isUpperCase);
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String[] args) {

        System.out.println(isUppercase("hello"));
        System.out.println(isUppercase("HELLO"));

        System.out.println(isLowercase("Hello"));
        System.out.println(isLowercase("heLLo"));




    }

}

