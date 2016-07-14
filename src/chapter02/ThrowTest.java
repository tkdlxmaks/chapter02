package chapter02;

import java.io.IOException;

public class ThrowTest {

	public void suspiciousMethod() throws IOException, MyException {
		System.out.println("예외 발생전");

		if (true) {
			// throw new MyException();
			throw new MyException("여기에 미시지를 주면 변경된다.");
		}

		/* 컴파일러가 똑똑해 */
		System.out.println("머지"); // 에러인 이유 - 코드가 이쪽으로 진행되지 않기때문에
	}
}
