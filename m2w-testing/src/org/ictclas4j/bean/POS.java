package org.ictclas4j.bean;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * ���Ա��
 * 
 * @author sinboy
 * @since 2007.5.22
 * 
 */
public class POS {
	private int tag;// ���Ա�ǣ��磺nr����8λ�����Եĵ�һ���ַ��8λ���ʵĵڶ����ַ�

	private double freq;// �ô��Գ��ֵ�Ƶ��
	
	private int prev;//ǰһ���ʵ�N�������к͸ô�����ƥ�����һ�����±�λ�ã�
	
	private boolean isBest;
	
	public  POS(){
		
	}
	
	public POS(int pos,double value){
		this.tag=pos;
		this.freq=value;
	}
	
	public int getTag() {
		return tag;
	}

	public void setTag(int pos) {
		this.tag = pos;
	}

	public double getFreq() {
		return freq;
	}

	public void setFreq(double value) {
		this.freq = value;
	}
  

	public int getPrev() {
		return prev;
	}

	public void setPrev(int prevPos) {
		this.prev = prevPos;
	}

	public boolean isBest() {
		return isBest;
	}

	public void setBest(boolean isBest) {
		this.isBest = isBest;
	}

	public String toString() {

		return ReflectionToStringBuilder.toString(this);

	}
}
