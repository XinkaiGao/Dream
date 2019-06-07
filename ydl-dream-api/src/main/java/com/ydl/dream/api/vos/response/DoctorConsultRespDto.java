package com.ydl.dream.api.vos.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author: Xinkai Gao
 * @description:
 * @date: 2019/1/4.
 */

@Getter
@Setter
public class DoctorConsultRespDto implements Serializable {


    private static final long serialVersionUID = -2481987087419865798L;


    @ApiModelProperty(value="专家id")
    private Integer doctorId;

    @ApiModelProperty(value="专家名字")
    private String doctorName;

    @ApiModelProperty(value="主订单数")
    private Integer orderNum;

    @ApiModelProperty(value="订单数")
    private Integer subOrderNum;

    @ApiModelProperty(value="支付人数")
    private Integer payPeopleNum;

    @ApiModelProperty(value="复购人数")
    private Integer rebuyPeopleNum;

    @ApiModelProperty(value="支付金额")
    private BigDecimal orderMoney;

    @ApiModelProperty(value="客单价")
    private BigDecimal averagePrice;

    @ApiModelProperty(value="套餐数")
    private Integer packageOrderNum;

    @ApiModelProperty(value="套餐金额")
    private BigDecimal packageOrderMoney;

    @ApiModelProperty(value="套餐率")
    private Double packageOrderRate;

    @ApiModelProperty(value="复购率（订单）")
    private Double orderRebuyRate;

    @ApiModelProperty(value="复购率（人数）")
    private Double peopleRebuyRate;

    @ApiModelProperty(value="Y值")
    private Double yValue;

    @ApiModelProperty(value="服务时长")
    private Double totalServiceTime;

    @ApiModelProperty(value="退款金额")
    private BigDecimal refundMoney;

    @ApiModelProperty(value="退款订单数")
    private Integer refundOrderNum;

    @ApiModelProperty(value="退款率")
    private Double refundRate;



}
