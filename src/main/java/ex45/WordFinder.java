package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.io.*;
import java.util.*;

/* Main Function

Get output file name

call function to rewrite the text and have output
filename as parameter

*/

/* Rewrite Function

Read input file

Use while loop to read in lines

Use replace function to replace all useages of
"utilize" with "use"

then output each lines

end while loop

*/

public class WordFinder {

    public static void rewrite(String filename) throws IOException {

        Scanner scan = new Scanner(new File("exercise45_input.txt"));

        FileWriter output = new FileWriter(""+filename+"");

        while(scan.hasNext()){

            String currentline = scan.nextLine();

            currentline = currentline.replaceAll("utilize", "use");

            output.write(currentline);

            output.write("\n");

        }

        scan.close();
        output.close();

    }

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Output File Name: ");
        String filename = scan.next();

        rewrite(filename);

        scan.close();

    }
}
