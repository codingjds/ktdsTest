package com.ktdsuniversity.admin.common.vo;

public abstract class  AbstractVO {
	
	private String startDt;
	private String endDt;
	
	private int pageNo;
	private int viewCnt;
	private int totalCount;
	private int lastPage;
	private int lastGroup;
	private int rnum;
	
	//추상클래스안의 메소드이기에 상속받은 경우에만 접근가능하게 하기위해 protected로 변경!
	protected AbstractVO() {
		this.pageNo = 0;
		this.viewCnt = 10;
	}

	
	
	public String getStartDt() {
		return startDt;
	}

	public void setStartDt(String startDt) {
		this.startDt = startDt;
	}

	public String getEndDt() {
		return endDt;
	}

	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getLastGroup() {
		return lastGroup;
	}

	public void setLastGroup(int lastGroup) {
		this.lastGroup = lastGroup;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	
	
	
	
}
