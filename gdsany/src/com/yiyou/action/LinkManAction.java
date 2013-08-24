package com.yiyou.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.yiyou.dao.LinkManDao;
import com.yiyou.entity.CustomerInfo;
import com.yiyou.entity.DeviceLinkMan;


@Component
public class LinkManAction {
	
	@Resource
	private LinkManDao linkManDao;	
	
	@DataProvider
	public void getAll(Page<DeviceLinkMan> page,Criteria criteria) throws Exception
	{
		linkManDao.getAll(page,criteria);
	}

}
