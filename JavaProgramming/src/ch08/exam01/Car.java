package ch08.exam01;

public class Car implements Manual {
	private int speed;
	
	@Override
	public void turnOn() {
		System.out.println("�ڵ����� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("�ڵ����� ���ϴ�.");
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("�ӵ��� " + speed + "�� �����մϴ�.");
		if(speed < Manual.MIN_SPEED) {
			this.speed = Manual.MIN_SPEED;
		} else if(speed > Manual.MAX_SPEED) {
			this.speed = Manual.MAX_SPEED;
		} else {
			this.speed = speed;
		}
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public void run() {
		System.out.println("�ڵ����� " + speed + " �ӵ��� �޸��ϴ�.");
	}

}
