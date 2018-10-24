package HeadFirst.ch16;

import java.util.*;

public class TestTreeSet {
    public static void main(String[] args){
        new TestTreeSet().go();
    }

    public void go(){
        Book b1 = new Book("how cats work");
        Book b2 = new Book("remix ");
        Book b3 = new Book("fnding emo");
        Book b4 = new Book("A");
        Book b5 = new Book("C");

        treeCompare tC = new treeCompare();
        TreeSet<Book> tree = new TreeSet<Book>(tC);

        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b4);
        tree.add(b5);

        System.out.println(tree);
    }

    public class treeCompare implements Comparator<Book>{
        @Override
        public int compare(Book o1, Book o2) {
            return (o1.title.compareTo(o2.title));
        }

    }

}

class Book implements Comparable<Book>{
    String title;

    public Book(String t){
        title = t;
    }

    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }

    public String toString() {
        return title;
    }
}