package HackerRank.JavaProficiency;
/**
 * Practice / Java / Data Structures / Java Sort
 * 19.01.29
 *
 */

import java.util.*;

class Student02{
    private int id;
    private String fname;
    private double cgpa;

    public Student02(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
//public class Solution
public class JavaSort{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student02> studentList = new ArrayList<Student02>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student02 st = new Student02(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        GpaSort gs = new GpaSort();
        Collections.sort(studentList, gs);

        for(Student02 st: studentList){
            System.out.println(st.getFname());
        }
    }
}

class GpaSort implements Comparator<Student02>{
    @Override
    public int compare(Student02 s1, Student02 s2) {

        if(s1.getCgpa() < s2.getCgpa()){
            return 1;
        }else if(s1.getCgpa() > s2.getCgpa()){
            return -1;
        }else{
            if(s1.getFname() != s2.getFname()){
                return s1.getFname().compareTo(s2.getFname());
            }else{
                return s1.getId() - s2.getId();
            }
        }
    }

}


