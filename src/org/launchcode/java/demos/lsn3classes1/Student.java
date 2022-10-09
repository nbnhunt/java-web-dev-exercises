package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // fields should always be private unless you absolutely want them to not be
    // even though that means you have to create getters and setters
    // which are annoying
    // getters and setters come after Constructor(s), which come after fields(variables)

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    // overloaded constructor must have different number of arguments
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    // instance methods belong to each object created from this class, and use the data of each created object
    // for this "method"? is this a constructor since it's named Student? I added a new field(variable) above
    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

}