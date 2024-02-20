package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		
		char ch = 'D';
		String res = "";
		
		switch( ch ) {//비교값
		case 'A'://조건값
			res = "90 ~ 100";
			break;
			
		case 'B':
			res = "80 ~ 89";
			break;
			
		case 'C':
			res = "70 ~ 79";
			break;
			
		case 'D': 
			res = "60 ~ 69";
			break;
		
		case 'F': 
			res = "59점 이하";
			break;
		
		default:
			System.out.println("성적을 올바르세 입력하세요");
			break;
			
		}//switch
		
		System.out.println(res);
		
	}//main
}
