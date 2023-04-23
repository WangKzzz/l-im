package com.lld.im.common.model;

import lombok.Data;

/**
 * @description: 请求基类，包含公共参数，如：appId、operater、clientType、imei等
 * @author: lld
 * @version: 1.0
 */
@Data
public class RequestBase {
    private Integer appId;

    private String operater;

    private Integer clientType;

    private String imei;
}
