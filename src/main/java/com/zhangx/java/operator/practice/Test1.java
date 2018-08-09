package com.zhangx.java.operator.practice;

/**
 * 测试操作符的运算
 * 
 * @author zhangx
 *
 */
public class Test1 {

	public static void main(String[] args) {
		char x = 'z';
		char y = 'c';
		System.out.println(x > y);
		System.out.println((char) (x & y));
		System.out.println((char)(x << 1));
		System.out.println((char)(x >> 1));
		System.out.println((char)(x % y));
	}
	
	
}
