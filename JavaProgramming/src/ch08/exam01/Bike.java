package ch08.exam01;

public class Bike implements Manual {
	//Field
	private int speed;
	//Consturctor
	//Method
	@Override
	public void turnOn() {
		System.out.println("���� �����Ÿ� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("���� �����Ÿ� ���ϴ�.");
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("�ӵ��� " + speed + "�� �����մϴ�.");
		this.speed = speed;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void run() {
		System.out.println("���� �����Ű� " + speed + " �ӵ��� �޸��ϴ�.");
	}
}
