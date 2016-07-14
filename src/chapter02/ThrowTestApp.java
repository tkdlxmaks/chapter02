package chapter02;

import java.io.IOException;

public class ThrowTestApp {

	public static void main(String[] args) {

		ThrowTest throwTest = new ThrowTest();
		try {
			test();
		} catch (IOException | MyException e1) {
			e1.printStackTrace();
		}
		try {
			throwTest.suspiciousMethod(); // 예외던지는중인데 Handling이 필요하다
		} catch (IOException | MyException e) {
			e.printStackTrace();
		}
	}

	public static void test() throws IOException, MyException {
		ThrowTest tt = new ThrowTest();
		tt.suspiciousMethod(); // try/catch귀찮을때 나는 여기서 Exception을 회피
	}

}
