package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Uday Gudipudi
 */

import java.util.*;
import java.io.*;

/* Main Function

Prompt for site name

Prompt for author

Prompt question for java folder

Prompt question for css folder

create path for folders to make sure it endsup in the
right directory

call function to make folders

*/

/* Create Folders function

call each folder function

return strings for each function

print out the creations

check if user wants either java and/or css files

if yes call those functions

if not do nothing

*/

/* Create website function

make a folder that contains the path and sitename

create the file for the folder

create the directory to have the folders in

return website name

*/

/* Create html function

make a folder that contains the path and sitename and
html

create the file for the folder with the sitename and
author in between the respective tags

output it to the file

return html name

*/

/* Create java function

make a folder that contains the path and sitename and
java

create the file for the folder

create the directory to have the folders in

return java name

*/

/* Create css function

make a folder that contains the path and sitename and
css

create the file for the folder

create the directory to have the folders in

return css name

*/

public class WebsiteGenerator {

    public static String website(String sitename, String path) {

        String folder = path + sitename;
        String websitename = "./website/" + sitename;

        File file = new File(folder);

        file.mkdirs();

        return websitename;

    }

    public static String html(String sitename, String author, String path) throws IOException {

        String folder = path + sitename + "/index.html";
        String htmlname = "./website/" + sitename + "/index.html";

        String htmlfolder = "/title/ " + sitename + " /title/ \n /meta/ " + author + " /meta/";

        File outputfile = new File(folder);

        BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(outputfile));
        bufferedwriter.write(htmlfolder);
        bufferedwriter.close();

        return htmlname;

    }

    public static String java(String sitename, String path) {

        String folder = path + sitename + "/js/";
        String javaname = "./website/" + sitename + "/js/";

        File file = new File(folder);

        file.mkdirs();

        return javaname;

    }

    public static String css(String sitename, String path) {

        String folder = path + sitename + "/css/";
        String cssname = "./website/" + sitename + "/css/";

        File file = new File(folder);

        file.mkdirs();

        return cssname;

    }

    public static void createfolders(String sitename, String author, String path, String javaans, String cssans) throws IOException {

        String finishedwebsite = website(sitename, path);
        String finishedhtml = html(sitename, author, path);

        System.out.printf("Created %s %n", finishedwebsite);
        System.out.printf("Created %s %n", finishedhtml);

        if (javaans.equals("y") || javaans.equals("Y")) {

            String finishedjava = java(sitename, path);
            System.out.printf("Created %s %n", finishedjava);

        }

        if (cssans.equals("y") || cssans.equals("Y")) {

            String finishedcss = css(sitename, path);
            System.out.printf("Created %s %n", finishedcss);

        }

    }

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Site name: ");
        String sitename = scan.next();

        System.out.println("Author: ");
        String author = scan.next();

        System.out.println("Do you want a folder for JavaScript? ");
        String folderans = scan.next();

        System.out.println("Do you want a folder for CSS? ");
        String cssans = scan.next();

        String path = "src/main/java/ex43/";

        createfolders(sitename, author, path, folderans, cssans);

        scan.close();

    }
}
