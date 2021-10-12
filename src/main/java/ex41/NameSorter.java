package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.io.*;
import java.util.*;

/* Main Function -
Read from file

Initialize arraylist for list of names

Add list of names using a while loop

call function to sort names alphabeticaly

call function to print names
*/

/* Sorting Function -

Use built - in sorting function

*/

/* Print Names Funtion -

Open file writer for output

Use for loop to output names in alphabetical order

close file writer

 */

class NameSorter {

    public static void sortnames (ArrayList<String> names) {

        Collections.sort(names);

    }

    public static void printnames (ArrayList<String> names) throws IOException {

        FileWriter output = new FileWriter("exercise41_output.txt");

        int numnames = names.size();

        output.write("Total of "+numnames+" names \n");
        output.write("-----------------\n");

        for (int i=0; i<names.size(); i++){

            output.write(names.get(i));
            output.write("\n");

        }

        output.close();

    }

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new File("exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<String>();

        while (scan.hasNext()){

            names.add(scan.nextLine());

        }

        scan.close();

        sortnames(names);
        printnames(names);

    }
}
