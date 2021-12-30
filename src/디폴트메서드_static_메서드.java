
public class 디폴트메서드_static_메서드 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2();
		MyInterface.staticMethod(); //static Method 호출 classname.staticMethod()
		MyInterface2.staticMethod(); //static Method 호출 classname.staticMethod()

	}

}

class Child3 extends Parent3 implements MyInterface,MyInterface2{
	public void method1() { //오버라이딩
		System.out.println("method1() in MyInterface2"); // 이름이 겹치는 default Method의 오버라이딩
	}
}

class Parent3{
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}

interface MyInterface{
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	} 
	
	static void staticMethod() {
		System.out.println("staticMethod() int MyInterface2");
	}
}
