package testdome;

import java.util.*;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> nameset = new HashSet();

        for(int i=0 ; i < names1.length ; i++) {
            nameset.add(names1[i]);
        }
        for(int i=0 ; i < names2.length ; i++) {
            nameset.add(names2[i]);
        }

        List<String> namelist = new ArrayList(nameset);
        String arr[] = new String[nameset.size()];
        int i = 0;
        for (String n : namelist){
            arr[i] = n;
            i++;
        }

        return arr;

    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}