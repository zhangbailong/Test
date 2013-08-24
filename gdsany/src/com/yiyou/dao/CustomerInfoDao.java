package com.yiyou.dao;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.bdf2.core.model.DefaultUser;
import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.entity.EntityState;
import com.bstek.dorado.data.entity.EntityUtils;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.yiyou.entity.CustomerInfo;
import com.yiyou.utils.BaseDao;

/**
 * 客户信息持久化 层
 * @author 张佰龙
 * @日期 2013-8-10 17:28:30 
 */
@Repository
public class CustomerInfoDao  extends HibernateDao{
	  
	public void getAll(Page<CustomerInfo> page,Criteria criteria) throws Exception
	{
		//String hql="from "+CustomerInfo.class.getName()+"";
		//this.pagingQuery(page, hql, "select count(*)"+hql);
		DetachedCriteria dc=this.buildDetachedCriteria(criteria,CustomerInfo.class);
		this.pagingQuery(page, dc);
		
	}
	
	public void saveCustomer(List<CustomerInfo> customerInfos) throws Exception {
		org.hibernate.classic.Session session= this.getSessionFactory().openSession();

		try{
		for(CustomerInfo customer : customerInfos){
			EntityState state = EntityUtils.getState(customer);
				if(state.equals(EntityState.NEW)){
					session.save(customer);
				}
				if(state.equals(EntityState.MODIFIED)){
					session.update(customer);
				}
				if(state.equals(EntityState.DELETED)){
					session.delete(customer);
				}
		   }
		}
		finally{
			session.flush();
			session.close();

		}


	}
	
	
	public void deleteCustomer(Collection<CustomerInfo> customerInfos) {
		org.hibernate.classic.Session session= this.getSessionFactory().openSession();
		try{
		for(CustomerInfo customer : customerInfos){
			    System.out.println(customer.getName());
				session.delete(customer);
		    }
		}
		finally{
			session.flush();
			session.close();
		}
	}

	
}
