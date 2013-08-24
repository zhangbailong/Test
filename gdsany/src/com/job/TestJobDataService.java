package com.job;

import java.util.List;

import com.bstek.bdf2.core.context.ContextHolder;
import com.bstek.bdf2.job.model.JobDefinition;
import com.bstek.bdf2.job.service.IJobDataService;

public class TestJobDataService implements IJobDataService {

	@Override
	public List<JobDefinition> filterJobs(List<JobDefinition> arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public String getCompanyId() {
		if(ContextHolder.getLoginUser() != null)
			return ContextHolder.getLoginUser().getCompanyId();
		else
		return null;
	}

}
