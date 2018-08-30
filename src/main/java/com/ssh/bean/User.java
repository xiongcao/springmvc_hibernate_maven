package com.ssh.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="tb_user")
public class User{	
	@Id
	@GeneratedValue(generator="id")
	@GenericGenerator(name = "id",strategy="identity")
	private Integer id;
	private String name;
	private String password;
//	@Column(name = "status",nullable = false,columnDefinition="Integer default 1") 
	private Integer status;
	@Column(name="login_date")
	private String loginDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(String loginDate) {
		this.loginDate = loginDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", status=" + status + ", loginDate="
				+ loginDate + "]";
	}
	
}

