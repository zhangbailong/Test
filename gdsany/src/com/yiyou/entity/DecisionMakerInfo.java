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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.engine.Cascade;

/**
 * ��������Ϣ-ʵ���ϵ����
 * @author �Ű���
 * @���� 2013-8-10 15:30:04
 */

@Entity
@Table(name="decision_maker_info")
public class DecisionMakerInfo {

	   private long dm_id;                    //������-���
	   private String name;                   //������-����
	   private String job;                    //������-ְ��
	   private String sex;                    //������-�Ա�
	   private Date birthday;                 //������-����
	   private String native_palce;           //������-����
	   private String nation;                 //������-����
	   private String ismarry;                //������-���
	   private String cellphone;              //������-�ֻ�
	   private String telephone;              //������-�绰
	   private String educational_background; //������-ѧ��
	   private String address;                //������-��ͥ��ַ
	   private String zip_code;               //������-�ʱ�
	   private String eamil;                  //������-����
	   private String hobby;                  //������-����
       private long customer_id;   //�ͻ��ľ�����
	
   	
    @Id
   	@GeneratedValue
   	@Column(name="dm_id")	
   	public long getDm_id() {
   		return dm_id;
   	}
	public void setDm_id(long dm_id) {
		this.dm_id = dm_id;
	}
	@Column(name="name",length=50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="job",length=50)	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Column(name="sex",length=4)	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Column(name="birthday")	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Column(name="native_palce")	
	public String getNative_palce() {
		return native_palce;
	}
	public void setNative_palce(String native_palce) {
		this.native_palce = native_palce;
	}
	
	@Column(name="nation",length=50)	
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	@Column(name="ismarry",length=4)	
	public String getIsmarry() {
		return ismarry;
	}
	public void setIsmarry(String ismarry) {
		this.ismarry = ismarry;
	}
	
	@Column(name="cellphone",length=11)	
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	@Column(name="telephone",length=20)	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Column(name="educational_background",length=50)	
	public String getEducational_background() {
		return educational_background;
	}
	public void setEducational_background(String educational_background) {
		this.educational_background = educational_background;
	}
	
	@Column(name="address",length=100)	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="zip_code",length=6)	
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	@Column(name="eamil",length=50)	
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	
	@Column(name="hobby",length=200)	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Column(name="customer_id")
	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	
	
	
	
	   
	   
}
