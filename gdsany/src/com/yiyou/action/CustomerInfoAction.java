package com.yiyou.action;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bstek.dorado.annotation.DataProvider;
import com.bstek.dorado.annotation.DataResolver;
import com.bstek.dorado.annotation.Expose;
import com.bstek.dorado.data.provider.Criteria;
import com.bstek.dorado.data.provider.Page;
import com.yiyou.dao.CustomerInfoDao;
import com.yiyou.entity.CustomerInfo;


@Component
public class CustomerInfoAction {

	@Resource
	private CustomerInfoDao customerDao;	
	
	@DataProvider
	public void getAll(Page<CustomerInfo> page,Criteria criteria) throws Exception
	{
		customerDao.getAll(page,criteria);
	}
	
	@DataResolver
	public void saveCustomer(List<CustomerInfo> customerInfo) throws Exception
	{
         customerDao.saveCustomer(customerInfo);
	}
	
	@DataResolver
	public void deleteCustomer(Collection<CustomerInfo> customerInfo) throws Exception
	{
		customerDao.deleteCustomer(customerInfo);
	}
	
}
