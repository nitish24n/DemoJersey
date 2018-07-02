package com.myCode.DemoJersey.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	
	private String errorMessage;
	private String errorCode;
	private String Documentation;
	
	public ErrorMessage() {
		
	}
	
	public ErrorMessage(String errorMessage, String errorCode, String documentation) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		Documentation = documentation;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getDocumentation() {
		return Documentation;
	}
	public void setDocumentation(String documentation) {
		Documentation = documentation;
	}

}
