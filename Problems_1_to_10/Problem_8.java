package Problems_1_to_10;

public class Problem_8 {
    public static void main(String[] args) {

        //static methods and variables can be accessed in another class without creating objects

        // calling static method
        // without instantiating Student class
        Student.setCollege("University of Madras");
        Student.setDepartment("Nuclear Physics");

        Student s1 = new Student("Rajeswari");
        Student s2 = new Student("Thamarai Priya");

        s1.getStudentInfo();
        s2.getStudentInfo();

    }
}

class Student {
    String name;
    int rollNo;

    // static variable
    //When a variable is declared as static,
    // then a single copy of the variable is created and shared among all objects at the class level

    //here we are using collegeName and department as static variables
    // because these variables are not going to change for students of the same department and same college
    static String collegeName,department;

    // static counter to set roll no
    static int counter = 0;

    public Student(String name) {
        this.name = name;
        this.rollNo = setRollNo();
    }

    // getting unique rollNo through static variable(counter)
    static int setRollNo() {
        counter++;
        return counter;
    }

    // static method
    static void setCollege(String name) {
        collegeName = name;
    }
    static void setDepartment(String depName) {
        department = depName;
    }

    void getStudentInfo() {
        System.out.println("rollNo : " + this.rollNo);
        System.out.println("name : " + this.name);

        // accessing static variable
        System.out.println("department : "+ department);
        System.out.println("collegeName : " + collegeName);
        System.out.println();
    }
}