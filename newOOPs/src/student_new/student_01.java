package student_new;



class Student{
    public String name ;
    public int rollNo ;
    public String course;
    public int m1,m2,m3;

    public int total(){
        return m1+m2+m3 ;
    }

    public float avg(){
        return (float)total()/3;
    }
    public char grade(){
        if (avg()>=60)
            return 'A';
        else
            return 'B';


    }
    public String details(){
        return " Roll number :"+rollNo+"\n"+"Name :"+name+"\n"+"Course :"+course+"\n";
    }
}

public class student_01 {
    public static void main(String[] args){
Student s = new Student();
s.name = "ahmad";
s.rollNo = 1;
s.course = "IT";
s.m1 = 70;
s.m2 = 80;
s.m3 = 75;

        System.out.println("total numbers:"+s.total());
        System.out.println("average :"+s.avg());
        System.out.println("grade : "+s.grade());
        System.out.println("detail :\n "+s.details());

    }
}
