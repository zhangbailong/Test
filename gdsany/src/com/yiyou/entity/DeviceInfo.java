package com.yiyou.entity;

import java.util.Date;

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
 * 设备信息-实体关系对象
 * @author 张佰龙
 * @日期 2013-8-10 15:29:53
 */

@Entity
@Table(name="device_info")
public class DeviceInfo {
      
	   private long device_id;            //设备-编号
	   private String brand;      //设备-品牌   
	   private String type;       //设备-类型  
	   private String model;      //设备-型号  
	   private Date buy_time;     //购买-日期  
	   private float price;       //设备-单价
	   private String remarks;    //设备-备注
	   private long customer_id;  //设备属于人
	
    @Id
	@GeneratedValue  
	@Column(name="device_id")	
	public long getDevice_id() {
		return device_id;
	}
	public void setDevice_id(long device_id) {
		this.device_id = device_id;
	}
	@Column(name="brand",length=50)
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Column(name="type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name="model",length=50)
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Column(name="time")
	public Date getBuy_time() {
		return buy_time;
	}
	public void setBuy_time(Date buy_time) {
		this.buy_time = buy_time;
	}

	@Column(name="price")
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Column(name="remarks",length=500)
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Column(name="customer_id")
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	   
	   
	   
	   
	   
	   
}
