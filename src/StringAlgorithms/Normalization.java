package StringAlgorithms;

public class Normalization {

    //Creating a new normalized string. Not like in validation process.
    public static String normalizeString(String s) {

        //Converting everything to lower case.
        String lowercased = s.toLowerCase();

        //Removing the whitespace without modifying the original string.
        String trimmed = lowercased.trim();

        //Remove the char that we dont want to consider.
        String normalized = trimmed.replace(",", "");

        //One line version.
        //return s.toLowerCase().trim().replace(",","");

        return normalized;
    }


    public static void main(String[] args) {

        System.out.println(normalizeString("                    Hello There, BUDDY!!      "));

    }
}
