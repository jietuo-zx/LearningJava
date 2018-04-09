/**  

* <p>Title: Test9.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 9, 2018  

* @version 1.0  

*/
package com.zhangx.java.controlexecutionflow.practice;

/**
 * 一个斐波那契数列是由数字1.1.2.3.5.8.13.21.34等等组成的，其中每一个数字（从第三个数字开始）都是前两个数字的和。
 * 创建一个方法，接受一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字。
 * 
 * @author zhangx
 *
 */
public class Test9 {

	private static void printFibonacci(int num) {
		StringBuffer sBuffer = new StringBuffer();
		int a = 1;
		int b = 1;
		if (num >= 3) {
			int i = 2;
			sBuffer.append(a + "," + b);
			while (i < num) {
				if (i % 2 == 0) {
					a = a + b;
					sBuffer.append("," + a);
				} else {
					b = a + b;
					sBuffer.append("," + b);
				}
				i++;
			}
		} else {
			switch (num) {
			case 1:
				sBuffer.append("1");
				break;
			case 2:
				sBuffer.append("1,1");
				break;
			}
		}
		System.out.println(sBuffer.toString());
	}

	public static void main(String[] args) {
		printFibonacci(7);
	}
	
	
}
