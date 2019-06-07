package com.ydl.dream.service.facade;

import com.ydl.common.dto.BaseDtoResponse;
import com.ydl.common.helper.ResponseFormatterHelper;
import com.ydl.dream.intf.facade.DoctorFacade;
import com.ydl.dream.intf.po.Doctor;
import com.ydl.dream.service.biz.DoctorBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class DoctorFacadeImpl implements DoctorFacade {

	@Resource
	DoctorBiz doctorBiz;

	@Override
	public BaseDtoResponse<List<Doctor>> queryDoctorByIdList(List<Integer> request) {

		List<Doctor> response = doctorBiz.queryDoctorByIdList(request);

		return ResponseFormatterHelper.success(response);
	}
}
