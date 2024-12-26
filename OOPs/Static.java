class Student{
    String name;
    static String school;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.school);
    }
}
public class Static {
    public static void main(String args[]){
        Student.school = "DYP";
        Student s1 = new Student();
        s1.name = "tony";
        s1.printInfo();
    }
}
