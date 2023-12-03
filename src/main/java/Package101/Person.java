/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package101;

public class Person {
    private int id;
    private String name;
    private String address;
    private BirthDate bd;
    
    public Person() {
    }

    public Person(int id, String name, String address, BirthDate bd) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bd = bd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BirthDate getBd() {
        return bd;
    }

    public void setBd(BirthDate bd) {
        this.bd = bd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
