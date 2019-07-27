package br.com.liandro.javaoperators;

public class StudyVideo6 {
	
	public static void main(String[] args) {
		int i = 1;
		
		if(i > 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Non-positive");
		}
		
		String output = i > 0 ? "Positive" : "Non-positive";
		System.out.println(output);
	}

}
