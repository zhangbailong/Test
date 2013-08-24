package com.yiyou.utils;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *这是一个公共的数据库 数据访问层
 * @author 张佰龙
 * @创建日期  2012-11-13 10:59:13
 */
public class BaseDao {
      
	@Resource private SessionFactory sf;
	
	//获取session会话
	public Session getSession()
	{
		return sf.getCurrentSession();
	}
	
	/**
	 * 查找所有数据集合
	 * @param cls
	 * @return
	 */
	public List findAll(Class cls){
		return getSession().createCriteria(cls).list();
	}
	
	/**
	 * 根据主键查找对象
	 * @param cls
	 * @param id
	 * @return
	 */
	public Object findById(Class cls,String id){
		return getSession().get(cls,id);
	}
	
	/**
	 * 保存
	 * @param obj
	 */
	public void sava(Object obj){
		getSession().save(obj);
	}
	
	
	/**
	 * 修改
	 * @param obj
	 */
	public void update(Object obj){
		getSession().update(obj);
	}
	
	/**
	 * 删除
	 * @param obj
	 */
	public void delete(Object obj){
		getSession().delete(obj);
	}
	
	public int showAllNum(Class cls)
	{
		String str=cls.getName();
		str=str.substring(str.lastIndexOf(".")+1);
		String hql="select count(*) from "+str+"";
		Query q=getSession().createQuery(hql);
		return ((Long) q.uniqueResult()).intValue(); 
	}
	
}
