package com.prac.demo;
/**
 * Advantages:: 
 * Class cannot inherit/extends by subclasss
 * It should used in collection/map
 * It is thread safe so we can used it in multi-threading context 
 *  
 * @author sumbarkar
 * 
 * Immutable objects are naturally thread-safe
		Because immutable objects can not be changed, they can be shared among multiple threads freely. 
		This eliminates the requirements of doing synchronization. In summary, 
		String is designed to be immutable for efficiency and security reasons.
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
