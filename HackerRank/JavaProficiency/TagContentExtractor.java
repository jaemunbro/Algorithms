package HackerRank.JavaProficiency;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.

 Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:

 The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.

 Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.

 Tags can consist of any printable characters.
 */

public class TagContentExtractor{
    public static void main(String[] args){

        /*
        String pattern = "<(\\w+)>([^<]\\w+)</(\\1)>";
        String test = "<test><t><E>thisisright</E></t></test>";
        //String test = "<test><yes>thisisright</yes></test>";
        if(test.matches(pattern)){
            System.out.println(test.replaceAll(pattern, "$2"));
        }else{
            System.out.println("None");
        }

        System.out.println(test.matches(pattern));
        System.out.println(test.replaceAll(pattern, "$2"));

        System.out.println("Solution from Discuss---- ");


        Pattern p = Pattern.compile("<(\\w+)>([^<]\\w+)</(\\1)>");
        Matcher m = p.matcher(test);
        boolean matchFound = false;

        while (m.find()) {
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));

            matchFound = true;
        }
        if ( ! matchFound) {
            System.out.println("None");
        }
        */



        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            // Sample : <test><yes>thisisright</yes></test>
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);

            boolean matchFound = false;

            while(m.find()){
                System.out.println(m.group(2));
                matchFound = true;
            }

            if(!matchFound){
                System.out.println("None");
            }

            testCases--;
        }

        in.close();


    }
}



