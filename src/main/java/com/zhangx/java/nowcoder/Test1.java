/**  

* <p>Title: Test1.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年5月24日  

* @version 1.0  

*/
package com.zhangx.java.nowcoder;

/**
 * 2015盏灯，一开始全部熄灭，序号分别是1-2015，先把1的倍数序号的灯的开关全部按一次，
 * 然后把2的倍数的灯的开关全部按一次，然后把3的倍数的开关按一次， 以此类推，最后把2015的倍数灯的开关按一次。问最后亮着的灯有多少盏？
 * 
 * @author zhangx
 *
 */
public class Test1 {

	private static boolean[] booleans = new boolean[2015];

	public static void main(String[] args) {
		for (int i = 1; i <= 2015; i++) {
			changeBoolean(i);
		}

		int count = 0;
		for (int i = 0; i < booleans.length; i++) {
			if (booleans[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

	/**
	 * @param i
	 */
	private static void changeBoolean(int i) {
		for (int j = 0; j < booleans.length; j++) {
			if (((j + 1) % i) == 0) {
				booleans[j] = !booleans[j];
			}
		}
	}
}
