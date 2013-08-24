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
 * �ͻ���Ϣ-ʵ���ϵ����
 * @author �Ű���
 * @���� 2013-8-10 15:30:24
 */

@Entity
@Table(name="customer_info")
public class CustomerInfo {
	
	   private long customer_id;   //�ͻ�-���
	   private String name;        //�ͻ�-����
	   private String helper_short;//����-���
	   private String address;     //�ͻ�-��ַ
	   private String type;        //�ͻ�-����
	   private String compete;     //�ͻ�-��������
	   private String aptitude;    //�ͻ�-��������
	   private Date enter_time;             //¼��-ʱ�� 
	   private String enter_man;            //¼��
	   private Date update_time;            //�޸�-ʱ��
	   private String update_man;           //�޸���
	   
		
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