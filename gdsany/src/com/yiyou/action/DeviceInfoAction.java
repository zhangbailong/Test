package com.yiyou.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.data.provider.Page;
import com.yiyou.dao.DeviceInfoDao;
import com.yiyou.entity.DeviceInfo;

@Component
public class DeviceInfoAction {
	
	@Resource 
	private DeviceInfoDao deviceInfoDao;
	  
	@DataProvider
	public void getAllById(Page<DeviceInfo> page,long id) throws Exception
	{
		System.out.println("后台传过来的值是："+id);
		deviceInfoDao.getAllById(page,id);
	}
   
}
