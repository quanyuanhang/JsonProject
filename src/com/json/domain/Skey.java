package com.json.domain;

public class Skey {

	private String name;
	private String skey;
	public Skey(String name, String skey) {
		super();
		this.name = name;
		this.skey = skey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkey() {
		return skey;
	}
	public void setSkey(String skey) {
		this.skey = skey;
	}
	@Override
	public String toString() {
		return "Skey [name=" + name + ", skey=" + skey + "]";
	}
	
}
