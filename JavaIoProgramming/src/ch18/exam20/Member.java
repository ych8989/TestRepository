package ch18.exam20;

import java.io.Serializable;

public class Member implements Serializable {

    //Field    
    private String name;
    private int age;

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

}
