package com.jspbasic.inputtypes.vo;

import java.sql.Date;
import java.util.Arrays;

public class Member {
	
	private String userId;
	private String pwd1;
	private String email;
	private String mobile;
	private Date birth;
	private String gender;
	private int age;
	private String hobby;
	private String job;
	private String memo;
	
	public Member(){}


	public Member(String userId, String pwd1, String email, String mobile, Date birth, String gender, int age,
			String hobby, String job, String memo) {
		super();
		this.userId = userId;
		this.pwd1 = pwd1;
		this.email = email;
		this.mobile = mobile;
		this.birth = birth;
		this.gender = gender;
		this.age = age;
		this.hobby = hobby;
		this.job = job;
		this.memo = memo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@Override
	public String toString() {
		return "Member [userId=" + userId + ", pwd1=" + pwd1 + ", email=" + email + ", mobile=" + mobile + ", birth="
				+ birth + ", gender=" + gender + ", age=" + age + ", hobby=" + hobby + ", job=" + job
				+ ", memo=" + memo + "]";
	}

}
