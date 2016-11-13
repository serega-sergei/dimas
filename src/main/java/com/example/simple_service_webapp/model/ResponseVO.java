package com.example.simple_service_webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "response", "reason" })
public class ResponseVO {

	@JsonProperty
	public int response;

	@JsonProperty
	public String reason;

	public int getResponse() {
		return response;
	}

	public void setResponse(int response) {
		this.response = response;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "ResponseVO [response=" + response + ", reason=" + reason + "]";
	}

}