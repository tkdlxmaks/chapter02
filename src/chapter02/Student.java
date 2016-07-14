package chapter02;

public class Student extends Person {

	public void showInfo() {
		System.out.println(age);// 접근지정자 : default 같은 패키지이기에 접근이 가능하다.
		// System.out.println(name);// 부모의 private 접근지정자는 접근 불가능.
		System.out.println(height);// 부모의 public 접근 가능
		System.out.println(weight);// 부모의 private 접근지정자는 접근 불가능. 
		
		// 자식만 접근하게끔 하고 싶다. - protected 사용.
		
	}
}
