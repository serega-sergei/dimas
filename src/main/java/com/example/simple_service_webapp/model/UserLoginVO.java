package com.example.simple_service_webapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "login", "password" })
public class UserLoginVO {

	@JsonProperty
	public String login;

	@JsonProperty
	public String password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserLoginVO [login=" + login + ", password=" + password + "]";
	}

}
