package ch18.exam22;

import java.io.Serializable;

public class Member implements Serializable{
    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    private String job;
    
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setMname(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
