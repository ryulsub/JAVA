package ex20240227;

import java.util.ArrayList;

public class Quiz1 {
	
	public static void main(String[] args) {
		 /*동적 배열 Arraylist 생성
		  * 
		  * 
		  * 다음은 Arraylist를 사용하여 학생 이름을 저장하는 프로그램입니다. 다음 프로그램을 완성하여 다음단어를 Arraylist에 추가하고,
		  *  모든 학생이름을 출력하는 코드를작성하세요.
		  * 
		  * 결과: Alice
		  * 	Bob
		  * 	Charlie
		  * 
		  * 
		  */
		
			ArrayList<String> names = new ArrayList<>();
						
			names.add("Alice");
			names.add("Bob");
			names.add("Charlie");
			
			for (String name : names) { // for - each 구문
				System.out.println(name);
				
				
			}
			
			for (int i = 0; i < 3; i++) { // 일반 for문
				System.out.println(names.get(i));
			}
			
		}
	
	}

