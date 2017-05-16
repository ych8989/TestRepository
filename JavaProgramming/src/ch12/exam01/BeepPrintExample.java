package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		//�Ҹ��� ���� �ڵ�
		/*
		BeepTask beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		*/
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					System.out.println(Thread.currentThread().getName());
					try {
						Thread.sleep(500);
					} catch(InterruptedException e) {
					}
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
