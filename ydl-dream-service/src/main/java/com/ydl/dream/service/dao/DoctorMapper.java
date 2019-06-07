package com.ydl.dream.service.dao;

import com.ydl.common.service.BaseMapper;
import com.ydl.dream.intf.po.Doctor;

import java.util.List;

public interface DoctorMapper extends BaseMapper<Doctor> {


    List<Doctor> queryDoctorByIdList(List<Integer> doctorIds);


}
