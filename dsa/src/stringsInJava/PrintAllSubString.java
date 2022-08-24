package stringsInJava;

public class PrintAllSubString {
	
	public static void PrintAllSubString(String str) {
		for(int len = 1; len<=str.length(); len++) {
			for(int start = 0;start<=str.length()-len;start++) {
				// if we know start and len
				int end = start + len - 1;
				System.out.println(str.substring(start,end+1));
			}
		}
	}

	public static void main(String[] args) {
		String str = "pqrs";
		PrintAllSubString(str);
	}

}