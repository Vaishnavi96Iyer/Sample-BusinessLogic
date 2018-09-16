package com.pojo;

public class User {

	private int userId;
	private String password;
	private float balanceUSD;
	private float balanceEUR;
	private float balanceGBP;
	
	public User(int userId, String password, float balanceUSD, float balanceEUR, float balanceGBP) {
		super();
		this.userId = userId;
		this.password = password;
		this.balanceUSD = balanceUSD;
		this.balanceEUR = balanceEUR;
		this.balanceGBP = balanceGBP;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getBalanceUSD() {
		return balanceUSD;
	}

	public void setBalanceUSD(float balanceUSD) {
		this.balanceUSD = balanceUSD;
	}

	public float getBalanceEUR() {
		return balanceEUR;
	}

	public void setBalanceEUR(float balanceEUR) {
		this.balanceEUR = balanceEUR;
	}

	public float getBalanceGBP() {
		return balanceGBP;
	}

	public void setBalanceGBP(float balanceGBP) {
		this.balanceGBP = balanceGBP;
	}
}
