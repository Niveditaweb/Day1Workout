class Student{
int id;
String name;
void display(){
    System.out.println(id+"  "+name);
}
}
public class Class {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=101;
        s1.name="TCE";
        s1.display();
        Student s2=new Student();
        s2.id=102;
        s2.name="XYZ";
        s2.display();
    }

    
}
