/**  

* <p>Title: Test10.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date Apr 9, 2018  

* @version 1.0  

*/
package com.zhangx.java.controlexecutionflow.practice;

/**
 * <pre>
 * 	吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，而这对数字各包含乘积的一半位数的数字，
 * 	其中从最初的数字中选取的数字可以任意排序。以两个0结尾的数字是不予许的，例如，下列数字都是“吸血鬼”数字： 
 * 	1260 = 21*60 
 * 	1827 = 21*87 
 * 	2187 = 27*81
 * 	
 * 写一个程序，找出4位数的所有吸血鬼数字
 * </pre>
 * 
 * @author zhangx
 *
 */
public class Test10 {

	public static void main(String[] args) {
		int[] start = new int[4];
		int[] dest = new int[4];
		for (int i = 10; i < 100; i++) {
			for (int j = i; j < 100; j++) {
				if (((i * j) % 9) != ((i + j) % 9))
					continue;
				start[0] = i / 10;
				start[1] = i % 10;
				start[2] = j / 10;
				start[3] = j % 10;
				int sum = i * j;
				dest[0] = sum / 1000;
				dest[1] = sum % 1000 / 100;
				dest[2] = sum % 1000 % 100 / 10;
				dest[3] = sum % 1000 % 100 % 10;

				int count = 0;

				for (int x = 0; x < 4; x++) {
					for (int y = 0; y < 4; y++) {
						if (start[x] == dest[y]) {
							count++;
							start[x] = -1;
							dest[y] = -2;
						}
					}
				}
				if (count == 4) {
					System.out.println(i + "*" + j + "= " + sum);
				}
			}
		}
	}

}
