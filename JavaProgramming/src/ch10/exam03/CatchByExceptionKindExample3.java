package ch10.exam03;

public class CatchByExceptionKindExample3 {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length());
			
			int[] scores = { 90, 85 };
			for(int i=0; i<3; i++) { 
				System.out.println(scores[i]);
			}
			
			String strNum = "a";
			int num = Integer.parseInt(strNum);
		} catch(NumberFormatException e) {
			//�ڵ�1
			System.out.println("���� ó�� �ڵ�1");
		} catch(Exception e) {
			//�ڵ�2
			System.out.println("���� ó�� �ڵ�2");
		}
	}
}
