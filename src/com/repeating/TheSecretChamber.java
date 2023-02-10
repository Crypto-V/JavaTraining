package com.repeating;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class TheSecretChamber {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        int m = Integer.parseInt(String.valueOf(line.charAt(0)));
        int n = Integer.parseInt(String.valueOf(line.charAt(1)));

        // Initialize a 2-dimensional graph to store the relationships between letters
        int[][] graph = new int[26][26];

        // Read the next m lines which contain the translations of letters
        for (int i = 0; i < m; i++) {
            String[] ab = in.readLine().split(" ");
            int a = ab[0].charAt(0) - 'a';
            int b = ab[1].charAt(0) - 'a';
            // Store the relationship in the graph
            graph[a][b] = 1;
        }

        // Use Floyd-Warshall algorithm to transitively close the graph
        for (int k = 0; k < 26; k++) {
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < 26; j++) {
                    // Update the relationship between letters
                    graph[i][j] |= graph[i][k] & graph[k][j];
                }
            }
        }

        // Read the next n lines which contain the word pairs to check
        for (int i = 0; i < n; i++) {
            String[] words = in.readLine().split(" ");
            String word1 = words[0];
            String word2 = words[1];
            // Check if the two words have the same length
            if (word1.length() != word2.length()) {
                System.out.println("no");
                continue;
            }
            boolean flag = true;
            // Check if the two words match
            for (int j = 0; j < word1.length(); j++) {
                int a = word1.charAt(j) - 'a';
                int b = word2.charAt(j) - 'a';
                // If two letters are not related, the two words are not matching
                if (graph[a][b] == 0) {
                    flag = false;
                    break;
                }
            }
            // Print the result
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
