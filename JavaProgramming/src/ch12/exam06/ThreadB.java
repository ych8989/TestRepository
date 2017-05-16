package ch12.exam06;

public class ThreadB extends Thread {
	//Field
	private boolean stop = false; //�����带 �����ϱ� ���� ����
	private boolean work = true; //������ �۾��� �纸�� ����
	//Constructor
	//Method
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ��....");
			} else {
				yield();
			}
		}
		System.out.println("ThreadB �۾� ����");
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	public void setWork(boolean work) {
		this.work = work;
	}
}
