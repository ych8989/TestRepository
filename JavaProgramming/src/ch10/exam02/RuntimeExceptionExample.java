package ch10.exam02;

import java.util.Scanner;

public class RuntimeExceptionExample {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("���������� ����ǵ��� ��");
		}
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�Է�: ");
			String strNum = scanner.nextLine();
			try {
				int num = Integer.parseInt(strNum);
			} catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���~");
			}
		}
	}
}





