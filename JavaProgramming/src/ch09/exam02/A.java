package ch09.exam02;

public class A {
	//Field
	int aField;
	//Constructor
	A() {
		//���� Ŭ����
		class D {
			//Field
			//Constructor
			//Method
			void dMethod() {
				aField = 10;
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
				aField = 10;
			}
		}		
	}
	
	//��ø ��� Ŭ����
	class B {
		//Field
		//Constructor
		//Method
		void bMethod() {
			aField = 10;
		}
	}
	static class C {
		//Field
		//Constructor
		//Method
		void cMethod() {
			//aField = 10; (x)
		}
	}
}
