package com.template;

import java.util.ArrayList;
import java.util.List;

import com.template.model.Email;
import com.template.model.FeatureReport;
import com.template.util.TemplateUtil;

public class Main {

	public static void main(String[] args) {
		
		Email email = new Email();
		email.setProjectName("Abc");
		email.setExecutionNo(2);
		email.setDate("23 May 2019");
		
		List<FeatureReport> featureReports = new ArrayList<FeatureReport>(2);
		FeatureReport featureReport = new FeatureReport();
		featureReport.setFeature("Feature 1");
		featureReport.setPassedStep("1");
		featureReport.setFailedStep("0");
		featureReport.setSkippedStep("0");
		featureReport.setPendingStep("0");
		featureReport.setUndefinedStep("0");
		featureReport.setTotalStep("1");
		featureReport.setPassedScenario("1");
		featureReport.setFailedScenario("0");
		featureReport.setTotalScenario("1");
		featureReports.add(featureReport);
		
		featureReport = new FeatureReport();
		featureReport.setFeature("Feature 2");
		featureReport.setPassedStep("1");
		featureReport.setFailedStep("0");
		featureReport.setSkippedStep("0");
		featureReport.setPendingStep("0");
		featureReport.setUndefinedStep("0");
		featureReport.setTotalStep("1");
		featureReport.setPassedScenario("1");
		featureReport.setFailedScenario("0");
		featureReport.setTotalScenario("1");
		featureReports.add(featureReport);
		
		email.setFeatureReports(featureReports);
		
		String strTemplate = TemplateUtil.populateTemplate("email.vm", email);
		
		System.out.println(strTemplate);
	}

}