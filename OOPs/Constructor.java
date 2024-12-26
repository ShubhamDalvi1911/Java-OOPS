class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println("this.name");
        System.out.println("this.age");
    }
    // Non-paramized constructor
    Student(){
        System.out.println("Non-parameterized constructor called");
    }
    // paramized constructor
    Student(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("parameterized constructor called");
    }
    // copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
        System.out.println("copy constructor called");
        System.out.println(this.name);
        System.out.println(this.age);

    }
}


public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Sahil";
        s1.age = 20;
        Student s2 = new Student(s1);
    }
}
