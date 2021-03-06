package cn.cloudtop.strawberry.rest;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by jackie on 16-4-26
 */
public abstract class RestResponse implements Response, Serializable {

    @ApiModelProperty("是否成功")
    private boolean success;
    @ApiModelProperty("错误代码")
    private int errorCode;
    @ApiModelProperty("错误信息")
    private String errorMessage;
    @ApiModelProperty("服务器返回时间")
    private long timestamp;

    public RestResponse() {
        this.success = true;
        timestamp = System.currentTimeMillis();
    }

    public RestResponse(int errorCode, String errorMessage) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        timestamp = System.currentTimeMillis();
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public long getTimestamp() {
        return this.timestamp;
    }
}
