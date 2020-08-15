package HackerRank.Days30;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class DictionariesAndMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Map<String, Integer> phonebook = new HashMap<>();

        for(int i = 0; i < n; i++){

            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name, phone);
            // Making phonebook 완료
        }

        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phonebook.containsKey(s)){

                System.out.println(s + "=" + phonebook.get(s));

            } else {

                System.out.println("Not found");
            }

        }

        in.close();



    }
}

