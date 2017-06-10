package com.xav.chart;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="callDataDetail")
public class callDataDetail {
	
	@Id
	private String id;
	private String location;
	private String callStatus;
	private String agent;
	private String callStartTime;
	private String callEndTime;
	private String accountNumber;
	private String callerLastName;
	private String callerAddress;
	private String callerAudio;
	private String callerVoiceText;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(String callStatus) {
		this.callStatus = callStatus;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getCallStartTime() {
		return callStartTime;
	}
	public void setCallStartTime(String callStartTime) {
		this.callStartTime = callStartTime;
	}
	public String getCallEndTime() {
		return callEndTime;
	}
	public void setCallEndTime(String callEndTime) {
		this.callEndTime = callEndTime;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCallerLastName() {
		return callerLastName;
	}
	public void setCallerLastName(String callerLastName) {
		this.callerLastName = callerLastName;
	}
	public String getCallerAddress() {
		return callerAddress;
	}
	public void setCallerAddress(String callerAddress) {
		this.callerAddress = callerAddress;
	}
	public String getCallerAudio() {
		return callerAudio;
	}
	public void setCallerAudio(String callerAudio) {
		this.callerAudio = callerAudio;
	}
	public String getCallerVoiceText() {
		return callerVoiceText;
	}
	public void setCallerVoiceText(String callerVoiceText) {
		this.callerVoiceText = callerVoiceText;
	}
	
	
	

}
