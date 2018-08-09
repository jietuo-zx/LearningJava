/**  

* <p>Title: IMyArrayList.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年7月17日  

* @version 1.0  

*/
package com.zhangx.java.datastructure;

/**
 * @author zhangx
 *
 */
public interface IMyArrayList {

	Boolean add(Object o);

	Boolean add(Object o, int index);

	Object get(int index);

	int size();

	Object remove(int index);

	Boolean remove(Object o);

	void clear();

	String toString();

}