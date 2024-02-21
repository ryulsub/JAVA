package ex3_work;

public class Ex1_switch_work {
	public static void main(String[] args) {
		
		//10 - 3 = 7
		
		int su1 = 10;
		int su2 = 3;
		String op = "-";
		
		
		switch( op ) { // + - * /
		
//		case "-" :
//			System.out.println("su1 - su2 :" + (su1 - su2) );
//			break;
//		
//		case "+" :
//			System.out.println("su1 + su2 :" + (su1 + su2) );
//			break;
//			
//		case "*" :
//			System.out.println("su1 * su2 :" + (su1 * su2) );
//			break;
		
		
		
		//풀어준것
		case "+":
			System.out.printf("%d + %d = %d", su1, su2, su1+su2);
			break;
		
		case "-":
			System.out.printf("%d - %d = %d", su1, su2, su1-su2);
			break;
			
		case "*":
			System.out.printf("%d * %d = %d", su1, su2, su1*su2);
			break;	
		
		case "/":
			System.out.printf("%d / %d = %d", su1, su2, su1/su2);
			break;	
			
			
			
			
			
	}//main
  }
}
