package HeadFirst;

import java.util.*;

public class SortMountains {

    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    class NameCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());
           // return one.Name.compareTo(two.Name);
        }
    }

    class HeightCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two) {
            return (two.getHeight() - one.getHeight()); // sort DESC
        }
    }

    public static void main(String [] args){
        new SortMountains().go();
    }

    public void go(){
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14333));
        mtn.add(new Mountain("Everest", 14256));
        mtn.add(new Mountain("Hanra", 13251));

        System.out.println("as entered:\n" + mtn);
        System.out.println("as entered 2:\n" + Arrays.toString(mtn.toArray()));

        // Sort by Name

        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("by name:\n" + mtn);

        // Sort by Height
        HeightCompare hc =  new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("by height:\n" + mtn);

    }

    class Mountain {
        String Name;
        Integer Height;

        Mountain(String N, Integer H){
            Name = N;
            Height = H;
        }

        public Integer getHeight() {
            return Height;
        }

        public String getName() {
            return Name;
        }

        // to print linked list
        @Override
        public String toString(){
            return Name + " " + Height;
        }
    }

}
