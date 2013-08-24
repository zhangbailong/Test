package com.yiyou.utils;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *����һ�����������ݿ� ���ݷ��ʲ�
 * @author �Ű���
 * @��������  2012-11-13 10:59:13
 */
public class BaseDao {
      
	@Resource private SessionFactory sf;
	
	//��ȡsession�Ự
	public Session getSession()
	{
		return sf.getCurrentSession();
	}
	
	/**
	 * �����������ݼ���
	 * @param cls
	 * @return
	 */
	public List findAll(Class cls){
		return getSession().createCriteria(cls).list();
	}
	
	/**
	 * �����������Ҷ���
	 * @param cls
	 * @param id
	 * @return
	 */
	public Object findById(Class cls,String id){
		return getSession().get(cls,id);
	}
	
	/**
	 * ����
	 * @param obj
	 */
	public void sava(Object obj){
		getSession().save(obj);
	}
	
	
	/**
	 * �޸�
	 * @param obj
	 */
	public void update(Object obj){
		getSession().update(obj);
	}
	
	/**
	 * ɾ��
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
