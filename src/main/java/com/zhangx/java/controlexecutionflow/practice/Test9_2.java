/**  

* <p>Title: Test9_2.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 9, 2018  

* @version 1.0  

*/
package com.zhangx.java.controlexecutionflow.practice;

import java.util.Scanner;

/**
 * 一个斐波那契数列是由数字1.1.2.3.5.8.13.21.34等等组成的，其中每一个数字（从第三个数字开始）都是前两个数字的和。
 * 创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。
 * 
 * @author zhangx
 *
 */
public class Test9_2 {

	public static int finb(int n) {
		if (n <= 2) {
			return 1;
		}
		return finb(n - 1) + finb(n - 2);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入你想打印的斐波那契数列个数：");
		int nextInt = scanner.nextInt();
		for (int i = 0; i < nextInt; i++) {
			System.out.print(finb(i) + " ");
		}
	}
}
