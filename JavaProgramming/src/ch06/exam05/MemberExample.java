package ch06.exam05;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args)  {
		Member[] members = new Member[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("------------------------------------");
			System.out.println("1. ȸ������ | 5. ����");
			System.out.println("------------------------------------");
			System.out.print("����: ");
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				String name = scanner.nextLine();
				int age = Integer.parseInt(scanner.nextLine());
				Member member = new Member(name, age);
				for(int i=0; i<members.length; i++) {
					if(members[i] == null) {
						members[i] = member;
						break;
					}
				}
			} else if(strNum.equals("5")) {
				System.exit(0);
			}
		}
	}
}
