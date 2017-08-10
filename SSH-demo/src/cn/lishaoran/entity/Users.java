package cn.lishaoran.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="users")
public class Users implements Serializable{

	    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UserID")
	private Integer userId;
	    
	@Column(name="UserName",length=16)
	private String userName;
	@Column(name="Password",length=16)
	private String password;
	@Column(name="Telephone",length=16)
	private String telephone;
	
	@Column(name="Address",length=16)
	private String address;

	public Users(){
		
	}
	
	
	
	public Users(Integer userId, String userName, String password,
			String telephone, String address) {

		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.telephone = telephone;
		this.address = address;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
