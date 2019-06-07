package com.ydl.dream.service.facade;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import  com.ydl.dream.intf.facade.DoctorFacade;

import com.ydl.dream.service.biz.DoctorBiz;


@Service
public class DoctorFacadeImpl implements DoctorFacade {

	@Resource
	DoctorBiz doctorBiz;

}
