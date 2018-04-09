package com.zhangx.java.controlexecutionflow.practice;

import java.util.Random;

/**
 * 写一个程序，产生25个int类型的随机数。对于每一个随机值， 使用if-else语句来将其分类为大于、小于，或等于紧随它而随机生成的值
 * 
 * @author zhangx
 *
 */
public class Test2 {

	static Random random = new Random();

	public static void compare() {
		int a = random.nextInt();
		int b = random.nextInt();
		System.out.println("a = " + a + ",b = " + b);
		if (a == b) {
			System.out.println("a == b");
		} else if (a > b) {
			System.out.println("a > b");
		} else if (a < b) {
			System.out.println("a < b");
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 25; i++) {
			compare();
		}
	}
}
