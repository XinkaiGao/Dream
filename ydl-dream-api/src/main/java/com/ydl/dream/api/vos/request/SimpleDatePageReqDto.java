package com.ydl.dream.api.vos.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Xinkai Gao
 * @description:
 * @date: 2019/1/4.
 */


@Getter
@Setter
public class SimpleDatePageReqDto implements Serializable {

    private static final long serialVersionUID = 1415399954535128310L;
    @ApiModelProperty(value = "查询开始时间")
    private Date startTime;

    @ApiModelProperty(value = "查询结束时间")
    private Date endTime;

    /**
     * 第几页
     */
    @ApiModelProperty(value = "页数")
    private Integer pageNum;

    /**
     * 每页条数
     */
    @ApiModelProperty(value = "每页条数")
    private Integer perPageRow;


}
