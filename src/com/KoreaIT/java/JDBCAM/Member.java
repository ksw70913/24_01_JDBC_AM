package com.KoreaIT.java.JDBCAM;

import java.time.LocalDateTime;

public class Member {
	int id;
	LocalDateTime regDate;
	LocalDateTime updateDate;
	String loginId;
	String loginPw;
	String name;

	public Member(int id, LocalDateTime regDate, String loginId, String loginPw) {
		this.id = id;
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.regDate = regDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
