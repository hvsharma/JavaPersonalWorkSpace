package com.harsh.demo;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PageChooser 
{
	private String page;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public PageChooser() {
		this.page="page2";
	}	
	
}
