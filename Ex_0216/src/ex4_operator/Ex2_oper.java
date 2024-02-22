package ex4_operator;

public class Ex2_oper {
	public static void main(String[] args) {
	
		//비교연산자
		//변수의 값을 비교하여 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;
		System.out.println("< :" + res);
		
		res = n1 >= n2;
		System.out.println("> : " + res);
		
		//두 변수나 값이 같다면 true : ==
		res = n1 == n2;
		System.out.println("== : " + res);
		
		//두 변수나 값이 다르다면 true : !=
		res = n1 != n2;
		System.out.println(" != : " + res);
		
		System.out.println("----------------------------");
		
		//논리연산자 : 비교연산자를 통한 연산이 두 개 이상 연결되어야 할 때
		int age = 30;
		int limit = 35;
		
		//&&(and) 연산자 : 앞의 연산이 거짓이면 뒤의 연산을 수행하지 않는다
		//true && true : true
		//true && false : false
		//false && true : false
		//false && false : false
		boolean res2 = limit - age > 5 && (age+=2) >= 30;
		System.out.println("&&연산 : " + res2);
		System.out.println(age);
		
		
		// ||(or) 연산자
		// true || true : true
		// true || false : true
		// false || true : true
		// false || false : false
		n1 = 10;
		n2 = 20;
		res2 = (n1 += 10) >= 20 || n2 - 10 == 11;
		System.out.println("||연산 : " + res2);
		
		//!(not)연산자 : 참은 거짓으로 거짓은 참으로 변경한다
		System.out.println("not : " + !res2);
		System.out.println( res2 );
		
	}//main
}
