package string;

public class str_practice {	//문자를 포기하면 끝장임. 여기저기서 쓰거든
//기본기를 익혀야 하기 때문에 이번 문제에서는 아래의 것들 적용하지 말 것.
//	compareTo(알면 좋은데 인터페이스 같은 곳 빼면 쓸 일이 적다)
//	concat(플러스 연산자를 쓰지 이건 안씀)
//	intern(안씀, 몰라도 됨)
//	replaceAll(강력하기 때문에 이번만 제외)
//	replaceFirst(원래 없던 것임. 이번만 제외)
	public static void main(String[] args) {
		
	String h = new String("hello");
	System.out.println(h);
	
	char[] c = {'H', 'e', 'l', 'l', 'o'};
	String s = new String(c);
	System.out.println(s);
	
	StringBuffer sb = new StringBuffer("Hello");
	String ss = new String(sb);
	System.out.println(ss);
	
	char cc = ss.charAt(2);
	System.out.println(cc);
	
	System.out.println("aaa".compareTo("aaa"));
	System.out.println("aaa".compareTo("bbb"));
	System.out.println("bbb".compareTo("aaa"));

	
	String sss = "Hello";
	System.out.println(sss.length());
	
	String s1 = "Hello";
	System.out.println(s1.indexOf('e', 2));
	String s2 = s.replace('H', 'Y');
	String s3 = s2.concat("w");
	System.out.println(s2);
	System.out.println(s3);
	
	String s4 = s2.replace("ll", "LL");	//두글자는 차르 안됨
	System.out.println(s4);
	
	String s5 = s2.replaceAll("ll", "rr");
	System.out.println(s5);
	
	System.out.println(s2.toUpperCase());
	System.out.println(s5.toLowerCase());
	System.out.println(s3.toString());
	
	String s6 = " Hello World ";
	System.out.println(s6.trim());
	
	String s7 = String.valueOf(10F);
	System.out.println(s7);
	
	String s8 = new String("abc");
	String s9 = new String("abc");
	boolean b1 = (s8 == s9);
	boolean b2 = s8.equals(s9);
	boolean b3 = (s1.intern() == s2.intern());
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	
	int idx1 = s9.indexOf("b");
	System.out.println(idx1);
	
	}
}
