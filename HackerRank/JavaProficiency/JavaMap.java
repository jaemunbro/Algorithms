package HackerRank.JavaProficiency;
/**
 * Practice / Java / Data Structures / Java Map
 * 19.01.12
 *
 */

import java.util.*;
import java.io.*;

// class Solution{
public class JavaMap {



    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> phonebook = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();

            phonebook.put(name, phone);
        }

        while(in.hasNext())
        {
            String s=in.nextLine();

            try{
                int temp = phonebook.get(s);
                System.out.printf("%s=%s\n",s,temp);
            }catch(NullPointerException e){
                System.out.println("Not found");
            }

        }

    }
}