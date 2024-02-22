package ex2_break;

public class Ex2_break {
	public static void main(String[] args) {

		int n = 1;

		while (true) {

			System.out.println(n);
			n++;

			if (n >= 5) {
				break;
			}

		} // while

		System.out.println("-----------------------------------");

		int i = 2;
		while (true) {

			switch( i ) {
			case 0 :
				System.out.println("나는0");
				break;//반복문 내의 switch가 가진 break는
				//반복문을 빠져나가는 것이 아니라, switch문을 빠져나가는 용도
				
			case 1 :
				System.out.println("나는1");
				break;
				
			case 2 :
				System.out.println("나는2");
				break;
			}//switch
			
		} // while

	}// main
}
