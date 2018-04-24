package com.zhangx.java.dailyexercise;

public class Test2 {
	
	
	public static void main(String[] args) {
		String s2[] = new String[] {"hehe"};
		String s3[] = new String[1];
		s3[0] = s2[0];
		System.out.println(s3[0]);
		s2[0] = "111";
		System.out.println(s2[0]);
		System.out.println(s3[0]);
		
		Integer i = 0;
		changeValue(i);
		System.out.println(i);
	 }

	private static void changeValue(Integer i) {
		i = null;
	}
	

}
