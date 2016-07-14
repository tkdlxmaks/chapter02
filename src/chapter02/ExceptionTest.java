package chapter02;

public class ExceptionTest {

	/**
	 * 주석 처리 ctrl + shift + j
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 예외처리

		/* 선언 */
		int a = 0;
		double d = 0;

		// try-catch문은 가독성이 많이 떨어진다. 개발자가 좋아하진 않다, 지역변수도 빼줘야한다.
		try {

			d = 10 / a;

		} catch (ArithmeticException e) {

			/* 예외처리 (예외가 발생하면 실행되는 코드) */
			// System.err.println("에러코드 :" + e);
			// System.out.println("에러코드 :" + e);

			/* 1. logging (파일, DB) */
			System.out.println("error " + e);
			/* 2. 자원정리 */
			/* 3. 사용자에게 메시지 */
			System.out.println("죄송합니다. 비정상적 상황으로 인한 게임 종료합니다.");
			/* 4. 정상 종료 */
			return;
		} finally {
			System.out.println( " 자원 정리 !!!");
		}

		/* 출력 - by zero */
		System.out.println(d);
	}

}
