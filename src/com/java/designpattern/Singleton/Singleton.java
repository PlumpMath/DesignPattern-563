package com.java.designpattern.Singleton;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton(){
		//私有化构造方法
	}
	
	//编写得到该实例的工厂方法、
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
