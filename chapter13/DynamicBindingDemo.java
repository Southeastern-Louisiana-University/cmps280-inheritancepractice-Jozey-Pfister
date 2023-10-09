package chapter13.chapter13;    //creating classes that override through a heirarchy

public class DynamicBindingDemo {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println("Object.toString() " + object.toString());
        Person person = new Person();
        System.out.println("Person.toString() " + person.toString());
        Student student = new Student();
        System.out.println("Student.toString() " + student.toString());
        GradStudent gradStudent = new GradStudent();
        System.out.println("GradStudent.toString " + gradStudent.toString());

        Object object1 = new GradStudent();
        Object object2 = new Student();

        methodDBD(object);
        methodDBD(student);

        if(object2 instanceof GradStudent) {
            System.out.println("GradStudent identified");
        }
        else {
            System.out.println("not gs");
        }

    }
    public static void methodDBD(Object object) {
        System.out.println((object.toString()));
    }
}

class Person extends Object{
    public String toString() {
        return "\tPerson\n";
    }
}
class Student extends Person{
    public String toString() {
        return "\tStudent\n";
    }
}
class GradStudent extends Student{
    public String toString() {
        return "\tGradStudent\n";
    }
}
