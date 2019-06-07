package com.ydl.dream.api.apis;

import com.ydl.common.dto.BaseDtoResponse;
import com.ydl.dream.api.vos.request.DoctorRequest;
import com.ydl.dream.intf.facade.DoctorFacade;
import com.ydl.dream.intf.po.Doctor;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: Xinkai Gao
 * @description:
 * @date: 2018/12/28.
 */

@Controller
@RequestMapping(value = "/doctor")
public class DoctorApi {

    @Resource
    DoctorFacade doctorFacade;



    @RequestMapping(value = "/doctorInfo", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "专家信息")
    public BaseDtoResponse<List<Doctor>> queryDoctorConsult(HttpServletRequest req,
                                                         @RequestBody DoctorRequest request) {


        List<Integer> doctorList = request.getDoctorIdList();
        BaseDtoResponse<List<Doctor>> respDto = doctorFacade.queryDoctorByIdList(doctorList);


        return respDto;
    }


}
