package com.zhangx.java.controlexecutionflow.practice;

/**
 * 写一个程序，使用两个嵌套的for循环和取余操作符（%） 来探测和打印素数 （只能被自身和1整除，而不能被其他数字整除的整数）
 * 
 * @author zhangx
 *
 */
public class Test4 {

	private static void printPrimeNumber() {
		for (int i = 2; i < 300; i++) {
			boolean a = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					a = false;
				}
			}
			if (a) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		printPrimeNumber();
	}
}
