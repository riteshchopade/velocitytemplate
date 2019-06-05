package com.template.model;

import java.util.List;

public class Email {
	
	private String projectName = null;
	
	private int executionNo = 0;
	
	private String date = null;
	
	private List<FeatureReport> featureReports = null;

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getExecutionNo() {
		return executionNo;
	}

	public void setExecutionNo(int executionNo) {
		this.executionNo = executionNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<FeatureReport> getFeatureReports() {
		return featureReports;
	}

	public void setFeatureReports(List<FeatureReport> featureReports) {
		this.featureReports = featureReports;
	}

}
