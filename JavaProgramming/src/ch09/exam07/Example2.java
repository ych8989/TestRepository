package ch09.exam07;

public class Example2 {
	public static void main(String[] args) {
		//���� Ŭ������ �����ϰ� ��ü ����
		/*
		class CImpl implements A.C {
			@Override
			public void cMethod() {
				System.out.println("CImpl-cMethod()");
			}
		}
		A.C c = new CImpl();
		c.cMethod();
		*/
		
		A.C c = new A.C() {
			@Override
			public void cMethod() {
				System.out.println("CImpl-cMethod()");
			}
		};
		c.cMethod();
	}
}
