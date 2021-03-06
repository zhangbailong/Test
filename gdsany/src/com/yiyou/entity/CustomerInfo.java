package com.yiyou.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 客户信息-实体关系对象
 * @author 张佰龙
 * @日期 2013-8-10 15:30:24
 */

@Entity
@Table(name="customer_info")
public class CustomerInfo {
	
	   private long customer_id;   //客户-编号
	   private String name;        //客户-名称
	   private String helper_short;//助记-简称
	   private String address;     //客户-地址
	   private String type;        //客户-类型
	   private String compete;     //客户-竞争性质
	   private String aptitude;    //客户-资质性质
	   private Date enter_time;             //录入-时间 
	   private String enter_man;            //录人
	   private Date update_time;            //修改-时间
	   private String update_man;           //修改人
	   
		
	@Id
	@GeneratedValue
	@Column(name="customer_id")	
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	@Column(name="name",length=50)
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="helper_short",length=50)
	public String getHelper_short() {
		return helper_short;
	}
	public void setHelper_short(String helper_short) {
		this.helper_short = helper_short;
	}
	@Column(name="address",length=100)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(name="type",length=50)	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name="compete",length=200)
	public String getCompete() {
		return compete;
	}
	public void setCompete(String compete) {
		this.compete = compete;
	}
	
	@Column(name="aptitude",length=200)
	public String getAptitude() {
		return aptitude;
	}
	public void setAptitude(String aptitude) {
		this.aptitude = aptitude;
	}
	@Column(name="enter_time")
	public Date getEnter_time() {
		return enter_time;
	}
	public void setEnter_time(Date enter_time) {
		this.enter_time = enter_time;
	}
	
	@Column(name="enter_man",length=50)
	public String getEnter_man() {
		return enter_man;
	}
	public void setEnter_man(String enter_man) {
		this.enter_man = enter_man;
	}
	@Column(name="update_time")
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	
	@Column(name="update_man",length=50)
	public String getUpdate_man() {
		return update_man;
	}
	public void setUpdate_man(String update_man) {
		this.update_man = update_man;
	}
	
	   
	   

}
