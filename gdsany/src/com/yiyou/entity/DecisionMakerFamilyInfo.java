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
 * �����˼�ͥ��Ϣ-ʵ���ϵ����
 * @author  �Ű���
 * @���� 2013-8-10 15:30:14
 */

@Entity
@Table(name="dm_family_info")
public class DecisionMakerFamilyInfo {

	   private long dm_family_id;             //�����˼�ͥ-���
	   private String relation;               //�����˼�ͥ-������� 
	   private String name;                   //�����˼�ͥ-��Ա����
	   private Date birthday;                 //�����˼�ͥ-��Ա����
	   private String educational_background; //�����˼�ͥ-��Աѧ�� 
	   private String telephone;              //�����˼�ͥ-��Ա�绰
	   private String hobby;                  //�����˼�ͥ-��Ա����
	   private long dm_id;                    //�����Ǹ������˵ļ���
	
    @Id
	@GeneratedValue
	@Column(name="dm_family_id")	
	public long getDm_family_id() {
		return dm_family_id;
	}
	public void setDm_family_id(long dm_family_id) {
		this.dm_family_id = dm_family_id;
	}
	
	@Column(name="relation",length=30)
	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	@Column(name="name",length=30)	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="birthday")
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Column(name="educational_background",length=100)
	public String getEducational_background() {
		return educational_background;
	}
	public void setEducational_background(String educational_background) {
		this.educational_background = educational_background;
	}
	@Column(name="telephone",length=11)
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Column(name="hobby",length=200)
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public long getDm_id() {
		return dm_id;
	}
	public void setDm_id(long dm_id) {
		this.dm_id = dm_id;
	}
 	   
	   
	   
}