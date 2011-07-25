package org.ictclas4j.bean;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * ���нڵ�
 * @author sinboy
 *
 */
public class QueueNode {
	private int parent;//���ڵ��λ��

	private int index;//�ִ�·���ı��,���ڼ����ִ�·��

	private double weight;//Ȩ��

	public QueueNode() {

	}

	public QueueNode(int parent, int index, double weight) {
		this.parent = parent;
		this.index = index;
		this.weight = weight;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {

		return ReflectionToStringBuilder.toString(this);

	}
}
