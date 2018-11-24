package HackerRank.JavaProficiency;

import java.math.BigDecimal;
import java.util.*;

class JavaBigDecimal{
    public static void main(String []args){

        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        String []s=new String[n+2];

        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }

        sc.close();

        //bubble sort
        //udtyn for sorting till there's no more to sort
        boolean udtyn = true;
        while(udtyn) {
            udtyn = false;
            //Write your code here
            for (int i = 0; i < n - 1; i++) {
                //BigDecimal
                BigDecimal a = new BigDecimal(s[i]);
                BigDecimal b = new BigDecimal(s[i + 1]);


                if (a.compareTo(b) < 0) {
                    //b <-> a
                    String temp = s[i];
                    s[i] = s[i + 1];
                    s[i+1] = temp;
                    udtyn = true;
                }
            }
        }


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}