package ch06.exam01;

public class Car {
	//Field
	String company = "�����ڵ���";
	int speed;
	String color;
	boolean airback;
	
	//Constructor
	Car() {
		System.out.println("Car ��ü ����");
	}
	
	//Method
	void run() {
		System.out.println("���� " + speed + "km/h �� �޸��ϴ�.");
	}
}
