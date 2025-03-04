import java.util.Scanner;

class Student {
    private int idNumber;
    private String firstName;
    private String lastName;
    private String course;
    private int yearLevel;


    public Student(int idNumber, String firstName, String lastName, String course, int yearLevel) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.yearLevel = yearLevel;
    }


    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }

    public int getYearLevel() {
        return yearLevel;
    }

 
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    
    public void displayStudent() {
        System.out.println("ID: " + idNumber + ", Name: " + firstName + " " + lastName +
                ", Course: " + course + ", Year Level: " + yearLevel);
    }
}

