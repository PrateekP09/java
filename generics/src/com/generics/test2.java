package com.generics;

class Generic<T>{
	private T obj;
	Generic(T obj){
		this.obj =obj;
	}
	public T getObj() {
		return this.obj;
	}
}
public class test2 {

	public static void main(String[] args) {
		Generic<Integer> intObj = new Generic<>(10);
		Generic<Float> FloatObj = new Generic<>(10.56f);
		Generic<Double> DoubleObj = new Generic<>(10.8);
		Generic<String> StringObj = new Generic<>("hello");
		System.out.println(intObj.getObj());
		System.out.println(FloatObj.getObj());
		System.out.println(DoubleObj.getObj());
		System.out.println(StringObj.getObj());
	}

}
