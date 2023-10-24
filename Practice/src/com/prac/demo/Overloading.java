package com.prac.demo;
/**
 * 1.Class contain more than one method of same name but different type, order, number of arguments
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class Overloading {

	public static void main(String[] args) {
		Overloading over=new Overloading();
		over.msg(0);
	}
	
	public Integer msg(Integer i)
	{
		System.out.println("Integer");
		return 0;
	}
	public int msg(int i)
	{
		System.out.println("int");
		return 0;
	}
	public long msg(long i)
	{
		System.out.println("long");
		return 0;
	}
	public short msg(short i)
	{
		System.out.println("short");
		return 0;
	}
	public byte msg(byte i)
	{
		System.out.println("byte");
		return 0;
	}
	
	public float msg(float i)
	{
		System.out.println("byte");
		return 0;
	}

}
