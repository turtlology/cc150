package Chapter10.Q1SortedMerge;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	Map<String,String> map = new HashMap<String,String>();
	
	public static void main(String args[]) {
		String str = new String("aaa");
		//String str1 = new String("abb");
		str = str.replaceFirst("a","c");
		char[] a = {'a','b','c'};
		str = String.valueOf(a);
		str.replace('a', 'd');
		System.out.println(a[0]);
		String str1 = new String(a);
		System.out.println(str1);
		StringBuilder sb = new StringBuilder();
		sb.append("here");
		sb.toString();
	}
	
}	
