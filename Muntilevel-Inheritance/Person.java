class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Student inherits Person
class Student extends Person {
    String studentID;

    Student(String name, int age, String id) {
        super(name, age);
        studentID = id;
    }

    void displayStudent() {
        System.out.println("Student ID: " + studentID);
    }
}

// Postgraduate inherits Student
class Postgraduate extends Student {
    String researchTopic;

    Postgraduate(String name, int age, String id, String topic) {
        super(name, age, id);
        researchTopic = topic;
    }

    void displayPostgraduate() {
        System.out.println("Research: " + researchTopic);
    }
}

