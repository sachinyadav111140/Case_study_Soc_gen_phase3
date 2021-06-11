package com.springcore.new_project_1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity 
{
	@Id
	private int id;
	@Column(nullable=false,unique=true)
	private String userName;
	private String passWord;
	private boolean isUser;
	@Column(nullable=false,unique=true)
	private String email;
	private Long mobileNumber;
	private boolean isConfirmed;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public boolean isUser() {
		return isUser;
	}
	public void setUser(boolean isUser) {
		this.isUser = isUser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean isConfirmed() {
		return isConfirmed;
	}
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", isUser=" + isUser
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", isConfirmed=" + isConfirmed + "]";
	}
	UserEntity(int id, String userName, String passWord, boolean isUser, String email, Long mobileNumber,
			boolean isConfirmed) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.isUser = isUser;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.isConfirmed = isConfirmed;
	}
	UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
