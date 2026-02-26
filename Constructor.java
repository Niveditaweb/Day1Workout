class Student{
    Student(){
        System.out.println("this a constructor of student class");
    }
    Student(double x){
        System.out.println(x);
    }
    Student(int a,int b){
        System.out.println(a+" "+b);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(1.2);
        Student s3=new Student(10,23);
    }
}
