package ch11.exam09;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		String search = "";
		if(!search.equals("")) {
			int location = subject.indexOf("");
			System.out.println(location);
		}
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
	}
}

