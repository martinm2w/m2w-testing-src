package org.ictclas4j.bean;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Ԥ�����Ĵ���.
 * @author sinboy
 *
 */
public class Preword {
	//��
	private String word;
	
	//ȥ����һ���ֺ�ʣ��Ĳ���
	private String res;
	
	//���ڴʵ���г��ֵ�λ�ã����ʵ���������λ����ж�Ӧ��ƫ��λ��.���磺������0
	private int index;
	
	 
	public int getIndex() {
		return index;
	}
	public void setIndex(int pos) {
		this.index = pos;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	 
	public String toString() {

		return ReflectionToStringBuilder.toString(this);

	}
	
}
