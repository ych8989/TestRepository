package ch09.exam03;

public class A {
	//Field
	//Constructor
	A() {
		int localVariable = 2;
		//���� Ŭ����
		class D {
			//Field
			//Constructor
			//Method
			void dMethod() {
				int result = localVariable + 8;
			}
		}
	}
	//Method
	void aMethod() {
		//���� Ŭ����
		class E {
			//Field
			//Constructor
			//Method
			void eMethod() {
			}
		}		
	}
}