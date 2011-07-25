package org.ictclas4j.bean;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * </pre>
 * 
 * ԭ��
 * 
 * ��νԭ��,���ǰ��շִʵ���С��λ���зָ�.������Ҫ�ִʵ�ÿһ�����ֶ���һ��ԭ��,
 * ���⿪ʼ��Ǻͽ�������Ȼһ��һ���ַ�,��Ҳ��Ϊ��ԭ��,����:ʼ##ʼ,�����޷��ٽ��� �з���.
 * 
 * ����:Դ�ַ�Ϊ"ʼ##ʼ��˵��ȷʵ����",����ԭ�ӷָ���Ϊ: ʼ##ʼ �� ˵ �� ȷ ʵ �� ��
 * 
 * </pre>
 * 
 * @author sinboy
 * 
 */
public class Atom {
	private String word;

	private int pos;

	private int len;

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
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
