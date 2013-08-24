package com.yiyou.dao;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.stereotype.Repository;

import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.yiyou.entity.CustomerInfo;
import com.yiyou.entity.DeviceLinkMan;
/**
 * 设备信息持久化-层
 * @author 张佰龙
 * @日期 2013-8-10 17:26:21
 */

@Repository
public class LinkManDao extends HibernateDao {
   
	public void getAll(Page<DeviceLinkMan> page,Criteria criteria) throws Exception
	{
		//String hql="from "+CustomerInfo.class.getName()+"";
		//this.pagingQuery(page, hql, "select count(*)"+hql);
		DetachedCriteria dc=this.buildDetachedCriteria(criteria,CustomerInfo.class);
		this.pagingQuery(page,dc);
		
	}
}
