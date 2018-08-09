/**  

* <p>Title: MyArrayList.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* @author zhangx  

* @date 2018年7月12日  

* @version 1.0  

*/
package com.zhangx.java.datastructure;

import java.awt.font.ImageGraphicAttribute;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author zhangx
 *
 */
public class MyArrayList implements IMyArrayList {

	/** 集合长度 */
	private int size;

	private Object[] objects = new Object[0];

	public MyArrayList() {
	}

	@Override
	public Boolean add(Object o) {
		ensureCapacity(size + 1);
		objects[size] = o;
		size++;
		return true;
	}

	@Override
	public Boolean add(Object o, int index) {
		if (index < 0 || index >= size) {
			return false;
		}
		ensureCapacity(size + 1);
		System.arraycopy(objects, index, objects, index + 1, size - index);
		objects[index] = o;
		size++;
		return true;
	}

	private void ensureCapacity(int i) {
		if (i > 0 && i > size) {
			Object[] temp = new Object[i];
			System.arraycopy(objects, 0, temp, 0, size);
			objects = temp;
		} else {
			throw new RuntimeException("扩容失败");
		}
	}

	@Override
	public Object get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return objects[index];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Object remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		Object object = objects[index];
		System.arraycopy(objects, index + 1, objects, index, size - index - 1);
		size--;
		objects[--size] = null; // GC回收
		return object;
	}

	@Override
	@SuppressWarnings("unused")
	public Boolean remove(Object o) {
		if (size <= 0) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = 0; i < size; i++) {
			if (Objects.equals(o, objects[i])) {
				System.arraycopy(objects, i + 1, objects, i, size - i - 1);
				objects[size - 1] = null;
				size--;
				break;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	@SuppressWarnings("unused")
	public void clear() {
		if (objects != null && size > 0) {
			for (int i = 0; i < size; i++) {
				objects[i] = null;
			}
			size = 0;
		}
	}

	public Boolean contains(Object o) {
		if (objects != null && size > 0) {
			for (int i = 0; i < size; i++) {
				if (Objects.equals(objects[i], o)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return Arrays.toString(objects);
	}

	public MyArrayListIterator iterator() {
		return new MyArrayListIterator(0);
	}

	public class MyArrayListIterator {

		private int index;

		public MyArrayListIterator(int index) {
			this.index = index;
		}

		public boolean hasNext() {
			return index != size;
		}

		public Object next() {
			if (index < 0 || index >= size()) {
				throw new IndexOutOfBoundsException();
			}
			return get(index++);
		}
	}

}
