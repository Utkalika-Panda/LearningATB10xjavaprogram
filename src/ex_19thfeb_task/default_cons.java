package ex_19thfeb_task;

public class default_cons {
    public static void main(String[] args) {
        Student student_information = new Student();

    }
}

class Student{
    String name;
    double mobile_number;

    public Student() {}

    public Student(String name) {
        this.name = name;
    }


    void Display(){
        System.out.println("print Student name & phone Number");
    }
}
