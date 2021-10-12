package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.util.*;
import java.io.*;

/* Main Function

Print leading statements for table

call function to read file

*/

/* Reformat Function

Read file

Use while loop to read each person till there is no more lines

Use the split function to split the line into three seperate parts and
print that person

End while loop

*/

public class ParsingDataFile {

    public static void reformat() throws IOException {

        File file = new File("exercise42_input.txt");

        Scanner scan = new Scanner(file);

        while (scan.hasNext()) {

            String person = scan.nextLine();

            String[] currentperson = person.split(",");

            System.out.printf("%s      %s      %s %n", currentperson[0], currentperson[1], currentperson[2]);

        }

        scan.close();
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Last      First     Salary ");
        System.out.println("-------------------------- ");

        reformat();

    }
}
