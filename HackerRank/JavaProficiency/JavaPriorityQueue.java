package HackerRank.JavaProficiency;


import java.util.*;

/*
 * Create the Student and Priorities classes here.
 */

class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }

    public int compareTo(Student s)
    {
        if(cgpa == s.cgpa)
        {
            if(name.compareTo(s.name) == 0)
            {
                if(id == s.id)
                    return 0;
                else if (id > s.id)
                    return 1;
                else
                    return -1;
            }
            else
                return name.compareTo(s.name);
        }
        else if(cgpa > s.cgpa)
            return -1;
        else
            return 1;
    }
}


class Priorities {

    /**
     *The Priorities class should implement the method List<Student> getStudents(List<String> events)
     *to process all the given events and return all the students yet to be served in the priority order.
     */
    // 이벤트를 일단 다 받아와서. students에 정제 해서 넣네.
    public List<Student> getStudents(List<String> events){

        // Creates a PriorityQueue with the specified initial capacity that orders its elements according to the specified comparator.
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        int n = events.size();

        for(int i = 0 ; i < n ; i++) {
            String input = events.get(i).split("\\s")[0];

            switch(input){
                case "ENTER" :
                    int id = Integer.parseInt(events.get(i).split("\\s")[3]);
                    String name = events.get(i).split("\\s")[1];
                    double cgpa = Double.parseDouble(events.get(i).split("\\s")[2]);

                    Student st = new Student(id, name, cgpa);
                    pq.add(st);
                    break;
                case "SERVED" :
                    pq.poll();
                    break;
            }
        }

        List<Student> list = new ArrayList<Student>();

        int na = pq.size();
        while(na-- > 0) {
            list.add(pq.poll());
        }

        return list;
    }
}

//public class Solution {
public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        // Enter와 served를 모두 events array에 add.
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}