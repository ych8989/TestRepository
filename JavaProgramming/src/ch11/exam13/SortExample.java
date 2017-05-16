package ch11.exam13;

import java.util.Arrays;
import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {
		String[] names = { "ȫ�浿", "��μ�", "�ڵ���" };
		System.out.println(Arrays.toString(names));
		
		//�ø��������� ����
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//������������ ����
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println(Arrays.toString(names));
		
		Member[] members = {
				new Member("ȫ�浿", 20),
				new Member("��μ�", 15),
				new Member("�ڵ���", 25)
		};
		System.out.println(Arrays.toString(members));
		
		//�ø��������� ����
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		
		//������������ ����
		Arrays.sort(members, Collections.reverseOrder());
		System.out.println(Arrays.toString(members));
	}
}





