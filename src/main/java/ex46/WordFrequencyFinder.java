package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.io.*;
import java.util.*;

/* Main Function

Read file

Create arraylist

read in words and place them into word arraylist

call function to count words

*/

/* Wordcount Function

Create an arraylist for wordorder

Create an arraylist for number of times each word is in
the file

Use the unique string function to check for all unique
words

Add the words and number of occurences to each
respective arraylist

print the order in reverse to get most to least

*/

public class WordFrequencyFinder {

    public static void wordcount(ArrayList<String> words, ArrayList<String> wordorder){

        ArrayList<Integer> freq = new ArrayList<Integer>();

        Set<String> unique = new HashSet<String>(words);

        for (String key : unique) {

            wordorder.add(key);
            freq.add(Collections.frequency(words, key));

        }

        int length = wordorder.size();
        int j = length;

        for (int i = 0; i < length; i++){

            System.out.printf("%s: ", wordorder.get(j-1));

            for(int z = 0; z < freq.get(j-1); z++){

                System.out.printf("*");

            }
            System.out.println("\n");
            j--;

        }

    }

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("exercise46_input.txt"));
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> wordorder = new ArrayList<String>();

        while (scan.hasNext()){

            words.add(scan.next());

        }

        wordcount(words, wordorder);

        scan.close();

    }
}
