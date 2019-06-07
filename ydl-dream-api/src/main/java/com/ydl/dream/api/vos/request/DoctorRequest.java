package com.ydl.dream.api.vos.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author: Xinkai Gao
 * @description:
 * @date: 2019/6/7.
 */



@Getter
@Setter
public class DoctorRequest implements Serializable {


    private static final long serialVersionUID = 5989047112950745394L;

    private List<Integer> doctorIdList;


}
