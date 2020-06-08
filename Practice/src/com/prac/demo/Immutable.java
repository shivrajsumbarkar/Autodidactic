package com.prac.demo;
/**
 * Advantages:: 
 * CLass cannot inherit/extends by subclasss
 * It should used in collection/map
 * It is thread safe so we ca used it in multi-threading context 
 *  
 * @author sumbarkar
 *
 */
public final class Immutable {
	private final int id;
	private final String name;
	
	public Immutable(int id, String name)
	{
		this.id=id;
		this.name=name;
	}

	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}

}
