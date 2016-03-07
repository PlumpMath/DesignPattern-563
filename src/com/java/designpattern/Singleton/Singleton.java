package com.java.designpattern.Singleton;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton(){
		//˽�л����췽��
	}
	
	//��д�õ���ʵ���Ĺ���������
	public synchronized static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public void print(){
		System.out.println("hello world");
	}
}
