package ch09.exam04;

public class A {
	//Field
	int field;
	//Constructor
	//Method
	//��ø ��� Ŭ����
	class B {
		//Field
		int field;
		//Constructor
		//Method
		void method() {
			field = 10;
			this.field = 10;
			A.this.field = 10;
		}
	}
}
