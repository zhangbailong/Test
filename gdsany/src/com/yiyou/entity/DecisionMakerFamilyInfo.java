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
 * 决策人家庭信息-实体关系对象
 * @author  张佰龙
 * @日期 2013-8-10 15:30:14
 */

@Entity
@Table(name="dm_family_info")
public class DecisionMakerFamilyInfo {

	   private long dm_family_id;             //决策人家庭-编号
	   private String relation;               //决策人家庭-与决策人 
	   private String name;                   //决策人家庭-成员名称
	   private Date birthday;                 //决策人家庭-成员生日
	   private String educational_background; //决策人家庭-成员学历 
	   private String telephone;              //决策人家庭-成员电话
	   private String hobby;                  //决策人家庭-成员爱好
	   private long dm_id;                    //属于那个决策人的家属
	
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
