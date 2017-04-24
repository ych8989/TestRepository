package ch18.exam21;

import java.io.Serializable;

public class Member implements Serializable {

    //Field    
    private String name;
    private int age;
    static String nation = "한국";

    //Constructor
    public Member(String name, int age) {
        this.name = name;
        this.age = age;

    }
//Method

    public String getName() {
        return name;
    }

    public void setName(String mname) {
        this.name = mname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    boolean nation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
