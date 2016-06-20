package cn.cloudtop.strawberry.rest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by jackie on 16-6-12
 */
@ApiModel
public class ChildMore implements Serializable {
    @ApiModelProperty("服务名称")
    private String service;
    @ApiModelProperty("相对路径")
    private String relativeUrl;

    /**
     * for json deserialize.
     */
    @Deprecated
    public ChildMore() {

    }

    public ChildMore(String service, String relativeUrl) {
        this.service = service;
        this.relativeUrl = relativeUrl;
    }

    public String getService() {
        return service;
    }

    public String getRelativeUrl() {
        return relativeUrl;
    }
}
