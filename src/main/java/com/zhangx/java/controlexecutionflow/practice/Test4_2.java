package com.zhangx.java.controlexecutionflow.practice;

/**
 * 写一个程序，使用两个嵌套的for循环和取余操作符（%） 来探测和打印素数 （只能被自身和1整除，而不能被其他数字整除的整数）
 * 
 * @author zhangx
 *
 */
public class Test4_2 {

	public static void main(String[] args) {
		int max = 100;
		if (args.length != 0)
			max = Integer.parseInt(args[0]);
		boolean[] sieve = new boolean[max + 1];
		int limit = (int) Math.floor(Math.sqrt(max));
		System.out.println(1 + " ");
		if (max > 1)
			System.out.println(2 + " ");
		for (int i = 3; i <= limit; i += 2)
			if (!sieve[i])
				for (int j = 2 * i; j <= max; j += i)
					sieve[j] = true;

		for (int i = 3; i < max; i += 2) {
			if (!sieve[i])
				System.out.println(i + " ");
		}

	}

}
