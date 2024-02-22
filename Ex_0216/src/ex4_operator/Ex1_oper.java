package ex4_operator;

public class Ex1_oper {
	public static void main(String[] args) {
		
		/*
		 * 1)최고연산자 : . , ()
		 * 2)증감연산자 : ++ , --
		 * 3)산술연산자 : + , - , * , / , %
		 * 4)시프트연산자 : >> , <<
		 * 5)비교연산자 : > , < , >= , <= , == , !=
		 * 6)비트연산자 : & , | , ^
		 * 7)논리연산자 : && , || , !
		 * 8)삼항(조건) 연산자 : ? , :
		 * 9)대입연산자 : = , *=, /= , += , -=
		 */
		
		//산술연산자 : 4칙연산과 나머지 연산자 가지고 있다
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 + n2;
		System.out.println("n3 : " + n3);
		
		n3 = n1 / n2; //나누기 연산자 : 몫
		System.out.println("n3 : " + n3);
		
		n3 = n1 % n2; //나머지 연산자 : 나머지
		System.out.println("n3 : " + n3);
		
		System.out.println("--------------------------------");
		
		//대입연산자 : 특정값을 변수에 전달하기 위해 사용하는 연산자
		int i1 = 20;
		int i2 = 8;
		
		i1 += i2; //i1 = i1 + i2
		System.out.println("+=연산 : " + i1);
		
		i1 /= 3; //i1 = i1 / 3;
		System.out.println("/=연산 : " + i1);
		
		i1 %= i2; //i1 = i1 % 8;
		System.out.println("%=연산 : " + i1);
	}//main
}
