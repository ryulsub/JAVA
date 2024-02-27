package ex20240227;

import java.util.ArrayList;

public class Quiz3 {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Java");
		names.add("Python");
		names.add("C++");
		names.add("JavaScript");
		names.add("Ruby");
		
		names.remove("C++");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
