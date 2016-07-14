package chapter02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Echo {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			String str = br.readLine(); // 여기서 에러 나올 수 있는 부분
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
			// 1. 키보드라인 뽑아져있을 수 있다.

		}
	}

}
