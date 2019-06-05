package com.template.model;

public class FeatureReport {

	private String feature = null;

	private String passedStep = null;

	private String failedStep = null;

	private String skippedStep = null;

	private String pendingStep = null;

	private String undefinedStep = null;

	private String totalStep = null;

	private String passedScenario = null;

	private String failedScenario = null;

	private String totalScenario = null;

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getPassedStep() {
		return passedStep;
	}

	public void setPassedStep(String passedStep) {
		this.passedStep = passedStep;
	}

	public String getFailedStep() {
		return failedStep;
	}

	public void setFailedStep(String failedStep) {
		this.failedStep = failedStep;
	}

	public String getSkippedStep() {
		return skippedStep;
	}

	public void setSkippedStep(String skippedStep) {
		this.skippedStep = skippedStep;
	}

	public String getPendingStep() {
		return pendingStep;
	}

	public void setPendingStep(String pendingStep) {
		this.pendingStep = pendingStep;
	}

	public String getUndefinedStep() {
		return undefinedStep;
	}

	public void setUndefinedStep(String undefinedStep) {
		this.undefinedStep = undefinedStep;
	}

	public String getTotalStep() {
		return totalStep;
	}

	public void setTotalStep(String totalStep) {
		this.totalStep = totalStep;
	}

	public String getPassedScenario() {
		return passedScenario;
	}

	public void setPassedScenario(String passedScenario) {
		this.passedScenario = passedScenario;
	}

	public String getFailedScenario() {
		return failedScenario;
	}

	public void setFailedScenario(String failedScenario) {
		this.failedScenario = failedScenario;
	}

	public String getTotalScenario() {
		return totalScenario;
	}

	public void setTotalScenario(String totalScenario) {
		this.totalScenario = totalScenario;
	}

}
