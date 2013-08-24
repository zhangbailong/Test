package com.yiyou.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 设备联系人-实体关系对象
 * @author 张佰龙
 * @日期 2013-8-10 15:34:30
 */

@Entity
@Table(name="device_linkman")
public class DeviceLinkMan {
   
	   private long linkman_id;       //设备联系人-编号
	   private String name;  //设备联系人-名称
	   private String role;  //设备联系人-角色
	   private String phone; //设备联系人-手机
	   private String email; //设备联系人-邮箱
	   private long customer_id; //联系那个客户
	

    @Id
	@GeneratedValue  
	@Column(name="linkman_id")	
	public long getLinkman_id() {
		return linkman_id;
	}
	
	public void setLinkman_id(long linkman_id) {
		this.linkman_id = linkman_id;
	}
	
	@Column(name="name",length=50)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="role",length=30)
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone() {
		return phone;
	}
	@Column(name="phone",length=11)
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(name="email",length=50)
	public String getEmail() {
		return email;
	}
	
	@Column(name="customer_id")
	public void setEmail(String email) {
		this.email = email;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	
	   
}
