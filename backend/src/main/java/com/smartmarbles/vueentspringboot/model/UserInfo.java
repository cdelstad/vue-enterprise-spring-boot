package com.smartmarbles.vueentspringboot.model;

public class UserInfo {
//{\"id\":2,\"username\":\"user1\",\"name\":\"User One\",\"token\":\"valid-token-for-user1\"}
	private Integer id;
	private String username;
	private String password;
	private String name;
	private String token;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
