package com.shivraj.moviecatalogservice.model;

public class CatalogItem {

	private String name;
	private String desc;
	private int rarting;
	
	public CatalogItem()
	{
		
	}

	public CatalogItem(String name, String desc, int rarting) {
		this.name = name;
		this.desc = desc;
		this.rarting = rarting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getRarting() {
		return rarting;
	}

	public void setRarting(int rarting) {
		this.rarting = rarting;
	}

}
