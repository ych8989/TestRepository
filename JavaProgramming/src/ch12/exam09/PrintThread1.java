package ch12.exam09;

public class PrintThread1 extends Thread {
	//Field
	private boolean stop;
	//Constructor
	//Method
	public void run() {
		while(!stop) {
			System.out.println("���� ��...");
			System.out.println("���� ��...");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
