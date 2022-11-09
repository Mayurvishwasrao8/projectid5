package MayurPractice;

public class Student {
    String name;
    int age;
    public void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);

    }
    Student(String name,int age){
        this.name=name;
        this.age = age;

    }
}
class MainApp3{
    public static void main(String[] args) {
        Student s1= new Student("Gauri",21);
        s1.display();

    }
}