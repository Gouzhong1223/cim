package com.crossoverjie.cim.route.vo.req;

import com.crossoverjie.netty.action.common.req.BaseRequest;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2018/05/21 15:56
 * @since JDK 1.8
 */
public class P2PRequest extends BaseRequest {

    @NotNull(message = "msg 不能为空")
    @ApiModelProperty(required = true, value = "msg", example = "hello")
    private String msg ;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
