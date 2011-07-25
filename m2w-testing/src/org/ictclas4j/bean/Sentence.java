package org.ictclas4j.bean;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Sentence {
	private String content;

	// �Ƿ���Ҫ���зִ�.�س����кͿո��ǲ���Ҫ��
	private boolean isSeg;

	public Sentence(){
		
	}
	public Sentence(String content){
		this.content=content;
	}
	public Sentence(String content,boolean isSeg){
		this.content=content;
		this.isSeg=isSeg;
	}
 
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isSeg() {
		return isSeg;
	}

	public void setSeg(boolean isSeg) {
		this.isSeg = isSeg;
	}
	public String toString() {

		return ReflectionToStringBuilder.toString(this);

	}
}
