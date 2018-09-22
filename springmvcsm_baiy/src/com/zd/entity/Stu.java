package com.zd.entity;

public class Stu {
	private int sid;
	private String sname;
	private String ssex;
	private int sage;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Stu [sage=" + sage + ", sid=" + sid + ", sname=" + sname
				+ ", ssex=" + ssex + "]";
	}
	
}
