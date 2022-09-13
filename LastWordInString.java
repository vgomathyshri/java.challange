package week1.day2;

public class LastWordInString {

	public static void main(String[] args) {
		String text ="Hello World Welcome to testleaf";
		
		String[] split = text.split(" ");
		
		String str = split[split.length-1];
		
		System.out.println(str.length());
		
	}

}
