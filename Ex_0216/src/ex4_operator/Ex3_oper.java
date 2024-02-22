package ex4_operator;

public class Ex3_oper {
	public static void main(String[] args) {
		
		// 증감연산자 " 1씩 증가시키거나 1씩 감소시키는 연산자
		// 선행증감과 후행증감의 차이점만 구별하자!!
		int a = 10;
		System.out.println("a : " + ++a);
		
		int b = 10;
		System.out.println("b : " + b++);
		System.out.println(b);
		
		++b;
		--b;
		b++;
		--b;
		b--;
		b++;
		--b;
		++b; 
		System.out.println(b++); //11
		
		System.out.println( (b += 2) );
		
		//1만 증감시키고 싶다면
		//1)++b
		//2) b+=1
		//1번의 방법이 더 효율적일 수 있다
		
		System.out.println("------------------");
		
		//삼항(조건)연산자 : 조건식을 주고 그 조건이 참일때와 거짓일때에 대해
		//원하는 결과값을 얻어낼 수 있도록 해 주는 연산자
		int a1 = 10;
		int b1 = 15;
		int res3 = ++a1 >= (b-=5) ? 1 : 0;
		System.out.println("res3 : " + res3);
		
		char res4 = (a1 += 4) - b-- >= 5 ? 'A' : 'B';
		System.out.println(res4);
		
		System.out.println("---------------------------");
		
		a = 10;
		b = 12;
		char res5 = ++a >= b || 2 + (b-5) <= b && 13 - b >= 0 && (a+=b) - (a%b) > 12 ? 'O':'X';
		System.out.println(res5); //X	    				 				
		
	}//main
}
