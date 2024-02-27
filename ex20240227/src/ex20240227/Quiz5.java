package ex20240227;

import java.util.ArrayList;

public class Quiz5 {
	public static void main(String[] args) {

		/*
		 * 다음은 ArrayList를 사용하여 문자열을 저장하는 프로그램입니다. ArrayList에 "apple", "banana",
		 * "orange", "grape", "watermelon"을 추가하고, "banana"가 포함되어 있는지 확인하는 코드를 작성하세요.
		 */

		ArrayList<String> names = new ArrayList<>();

		names.add("apple");
		names.add("banana");
		names.add("orange");
		names.add("grape");
		names.add("watermelon");

		if (names.contains("banana")) {
			System.out.println("banana is in the list");
		} else {
			System.out.println("banana is not in the list");
		}

	}
}
