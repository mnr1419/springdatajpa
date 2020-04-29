package com.example.springdatajpa.errorreponse;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SuccessResponse {
	private String successCode;
	private String successMessage;
	
	/*public String getSuccessCode() {
		return successCode;
	}
	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}*/
	
}
