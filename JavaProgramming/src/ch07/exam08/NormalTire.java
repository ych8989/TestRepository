package ch07.exam08;

public class NormalTire extends Tire {
	//Field
	//Constructor
	NormalTire() {
		super();
		System.out.println("NormalTire ��ü ����");
	}
	//Method
	@Override
	void roll() {
		System.out.println("�Ϲ� Ÿ�̾ �������ϴ�.");
	}
}
