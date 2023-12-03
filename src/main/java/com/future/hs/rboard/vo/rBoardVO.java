package com.future.hs.rboard.vo;

public class rBoardVO {
	private String name;
	private String ename; 
	private String managemets;
	private String classes;
	private String url;
	
	public rBoardVO(String name, String ename, String managemets, String classes, String url) {
		super();
		this.name = name;
		this.ename = ename;
		this.managemets = managemets;
		this.classes = classes;
		this.url = url;
	}
	@Override
	public String toString() {
		return "BoardVO [name=" + name + ", ename=" + ename + ", managemets=" + managemets + ", classes=" + classes
				+ ", url=" + url + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getManagemets() {
		return managemets;
	}
	public void setManagemets(String managemets) {
		this.managemets = managemets;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}