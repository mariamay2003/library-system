/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package101;

public class Student extends Person {
    
    private String major;

    public Student() {
    }

    public Student(int id, String name, String address, BirthDate bd, String major) {
        super(id, name, address, bd);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
}
