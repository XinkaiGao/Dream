package com.ydl.dream.service.biz;

import com.ydl.common.service.IService;
import com.ydl.dream.intf.po.Doctor;

import java.util.List;

public interface DoctorBiz extends IService<Doctor> {

    List<Doctor> queryDoctorByIdList(List<Integer> doctorIdList);


}
