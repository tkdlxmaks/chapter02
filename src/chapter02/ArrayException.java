package chapter02;

public class ArrayException {

	public static void main(String[] args) {

		try {
			/* 선언 */
			int[] intArray = new int[5];
			intArray[0] = 0;

			/* 할당 및 출력 */
			for (int i = 0; i < 5; i++) {
				intArray[i + 1] = i + 1 + intArray[i];
				System.out.println("intArray[" + i + "]" + " = " + intArray[i]);
			}

		} catch (Exception e) {
			// 비어놓는게 가장 좋지 않다.!!!!!!!!!!!!!!!!!! - 거의 개무시급
			/* 에러 추적 - 어디서 에러가 나왔는지 알 수 있다. */
			e.printStackTrace();
			/* 1. logging (파일, DB) */
			System.out.println("error " + e);
			/* 2. 자원정리 */
			/* 3. 사용자에게 메시지 */
			System.out.println("죄송합니다. 비정상적 상황으로 인한 게임 종료합니다.");
			/* 4. 정상 종료 */
			return;
		}
	}
}
