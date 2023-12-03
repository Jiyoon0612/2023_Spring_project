package com.future.hs.board.vo;

public class BoardVO {
	private String name;
	private String url;
	private String ename;
	private String classes;
	private String rank;
	
	
	public BoardVO(String name, String url, String ename, String classes, String rank) {
		super();
		this.name = name;
		this.url = url;
		this.ename = ename;
		this.classes = classes;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "BoardVO [name=" + name + ", url=" + url + ", ename=" + ename + ", classes=" + classes + ", rank=" + rank
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}