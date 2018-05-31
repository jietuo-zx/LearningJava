/**  

* <p>Title: CountBigNum.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年5月25日  

* @version 1.0  

*/
package com.zhangx.java.algorithm;

import java.util.Arrays;

/**
 * 大数据计算
 * 
 * @author zhangx
 *
 */
public class CountBigNum {

	public static void main(String[] args) {
		int bigNum = 12345;
		int num = 34;

		String bigNumStr = String.valueOf(bigNum);
		char[] charArray = bigNumStr.toCharArray();
		int[] bigNumArray = new int[charArray.length * 2 + 1];
		int j = 0;
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.println(charArray[i]);
			bigNumArray[bigNumArray.length - 1 - j] = Integer.parseInt(charArray[i] + "");
			j++;
		}
		for (int i = 0; i < bigNumArray.length; i++) {
			bigNumArray[i] = bigNumArray[i] * num;
		}

		for (int i = bigNumArray.length - 1; i >= 0; i--) {
			if (bigNumArray[i] / 10 > 0) {
				bigNumArray[i - 1] = bigNumArray[i - 1] + bigNumArray[i] / 10;
				bigNumArray[i] = bigNumArray[i] % 10;
			}
		}

		System.out.println(Arrays.toString(bigNumArray));
		// 去掉前面的0
		// step1: 反转一次
		int result = removeZero(bigNumArray);
		System.out.println(result);

	}

	/**
	 * @param bigNumArray
	 * @return
	 */
	private static int removeZero(int[] bigNumArray) {
		StringBuilder sBuilder = new StringBuilder();
		boolean flag = false;
		for (int i = 0; i < bigNumArray.length; i++) {
			if (flag) {
				sBuilder.append(bigNumArray[i]);
				continue;
			}
			if (bigNumArray[i] > 0) {
				sBuilder.append(bigNumArray[i]);
				flag = true;
			}

			// if (bigNumArray[i] == 0 && !flag) {
			// // 什么都不做
			// } else if (bigNumArray[i] > 0) {
			// sBuilder.append(bigNumArray[i]);
			// flag = true;
			// } else if (flag) {
			// sBuilder.append(bigNumArray[i]);
			// }
		}
		return Integer.parseInt(sBuilder.toString());
	}

}
