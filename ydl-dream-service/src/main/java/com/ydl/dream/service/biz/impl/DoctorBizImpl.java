package com.ydl.dream.service.biz.impl;

import com.ydl.common.service.impl.BaseService;
import com.ydl.dream.intf.po.Doctor;
import com.ydl.dream.service.biz.DoctorBiz;
import com.ydl.dream.service.dao.DoctorMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DoctorBizImpl extends BaseService<Doctor> implements DoctorBiz {

	@Resource
	private DoctorMapper doctorMapper;


	@Override
	public List<Doctor> queryDoctorByIdList(List<Integer> doctorIdList) {

		List<Doctor> response = doctorMapper.queryDoctorByIdList(doctorIdList);

		return response;

	}
}
