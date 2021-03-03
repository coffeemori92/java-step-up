package stringProcessing;

public class Main {
	public static void main(String[] args) {
		String s1 = "Java Step Up";
		String s2 = "Java";
		String s3 = "java";
		if(s2.equals(s3)) {
			System.out.println("s2와s3는 같다.");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2와s3는 대소문자를 구별하지 않으면 같다.");
		}
		System.out.println("s1의 길이는 " + s1.length() + "이다.");
		if(s1.isEmpty()) {
			System.out.println("s1은 빈 문자열 이다.");
		}
		String s4 = "Java and JavaScript";
		if(s4.contains("Java")) System.out.println("문자열 s4는 Java를 포함하고 있습니다.");
		if(s4.endsWith("Java")) System.out.println("문자열 s4는 Java가 끝에 있습니다.");
		System.out.println("문자열 s4에서 처음 Java가 등장하는 위치는 " + s4.indexOf("Java"));
		System.out.println("문자열 s4에서 마지막에 Java가 등장하는 위치는 " + s4.lastIndexOf("Java"));

		String s5 = "Java Programming";
		System.out.println(s5.substring(3));
		System.out.println(s5.substring(3, 8));

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 1000; i++) sb.append("Java");
		System.out.println(sb.toString());

		String s6 = "abc,def:ghi";
		String[] words = s6.split("[,:]");
		for(String w : words) System.out.println(w);

		String w = s6.replaceAll("[beh]", "X");
		System.out.println(w);

		System.out.printf("제품번호 %s-%02d", "SJV", 3);
	}
	public static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
