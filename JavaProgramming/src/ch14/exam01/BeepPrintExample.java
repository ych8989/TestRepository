package ch14.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		//�Ҹ��� ���� �ڵ�
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) {
				}
			}
		});
		thread.start();
		
		//����Ʈ�� �ϴ� �ڵ�
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
			}			
		}		
	}
}
