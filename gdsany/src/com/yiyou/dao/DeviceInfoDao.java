package com.yiyou.dao;

import org.springframework.stereotype.Repository;

import com.bstek.bdf2.core.orm.hibernate.HibernateDao;
import com.bstek.dorado.data.provider.Page;
import com.yiyou.entity.DeviceInfo;
import com.yiyou.utils.BaseDao;


/**
 * 设备信息持久化-层
 * @author 张佰龙
 * @日期 2013-8-10 17:26:21
 */
@Repository
public class DeviceInfoDao extends HibernateDao {

	public void getAllById(Page<DeviceInfo> page, long id) throws Exception {
             String hql="from "+DeviceInfo.class.getName()+"";
             if(id>0)
             {
            	 hql+=" where customer_id="+id+"";
            	 System.out.println(hql);
            	 this.pagingQuery(page,hql,"select count(*) "+hql);
             }
             else
             {
    		   this.pagingQuery(page,hql,"select count(*) "+hql);
    		   System.out.println(hql);  
             }
	}

}
