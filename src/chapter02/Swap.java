package chapter02;

public class Swap {

	public static void main(String[] args) {
		// 지역 변수 - 클래스와 연관이 아닌 메소드와 연관
		int a = 10;
		int b = 20;

		int c = add(a, b);
		System.out.println(c);
		System.out.println(a + " , " + b);
		swap(a, b);
		// 메소드 내부는 바뀌지만 외부는 안바뀌는 이유 :
		// 7 : a = 10
		// 8 : b = 20
		// 36 : i = 10
		// 36 : j = 20
		// 37 : temp = 10
		// 41 : sysout 출력시 i,j,temp가 사라짐
		// Stack에 남은 녀석들 a와 b
		// 안바뀌는 방법 - 객체로 해줘서 객체로 넘겨줌.
		
		Value v1 = new Value();
		v1.setVal(10);

		Value v2 = new Value();
		v2.setVal(20);

		System.out.println("변경 전");
		System.out.println(v1.getVal() + " , " + v2.getVal());
		swap(v1, v2);
		System.out.println("Swap **");
		System.out.println(v1.getVal() + " , " + v2.getVal());
		// 왜 그런지 Stack으로 확인
		// ***************heap************************
		// 23 : v1 = 0 (객체 생성)
		// 24 : v1 = 10;
		// 26 : v2 = 0 (객체 생성)
		// 27 : v2 = 20;
		// ***************Stack***********************
		// 24 : v1 = 1000 (주소값)
		// 27 : v2 = 2000 (주소값)
		// 24 : v1 = 1000 (주소값) // 그대로 유지
		// 27 : v2 = 2000 (주소값)
		
		
		/***
		 * **********Stack****************** a=10 b=20 c i=10; j=20; result =
		 * 30; ********************************* 메소드 종료시 다 Stack 형식으로 빠져나온다. 그렇지
		 * 않는 경우 메모리 초과
		 * 
		 * Call By는 '함수를 호출한다.'를 의미 Call By Value - 값으로 호출 Java에서는 Pointer.
		 * Java는 Call By Reference , Call By Value
		 */
	}

	public static int add(int i, int j) {
		int result = i + j;
		return result;
	}

	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
		System.out.println(i + " , " + j); // 왜 안에서는 바뀌는데 바깥은 바뀌지 않는것인가?
	}

	public static void swap(Value val1, Value val2) {
		// 오오미 ..
		int temp = val1.getVal();
		int v1 = val2.getVal();
		val1.setVal(val2.getVal());
		val2.setVal(temp);
	}
}
