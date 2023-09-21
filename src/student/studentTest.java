package student;
class Student {

    public int rollno;
    public String name;
    public String course;
    public int m1, m2, m3;

    public double total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 70) {
            return 'A';
        } else
            return 'B';
    }

    public String toString() {
        return "Roll NO:" + rollno + "\n" + "Name:" + name + "\n" + "Course:" + course + "\n";


    }
}


public class studentTest {
    public static void main(String[] args) {

        Student s = new Student();
        s.rollno = 1;
        s.name = "ahmad";
        s.course = "Information technology";
      s.m1= 70;
        s.m2 = 80;
        s.m3 = 65;
        System.out.println("Total :" +s.total());
        System.out.println("Average : " + s.average());

        System.out.println("Detailsc:\n "+ s
        );
    }
}
