package com.xpc.easyes.core.params;

import com.xpc.easyes.core.enums.AggregationTypeEnum;
import lombok.Data;

/**
 * 聚合参数
 *
 * @ProjectName: easy-es
 * @Package: com.xpc.easyes.core.config
 * @Description: 处理聚合时需要
 * @Author: xpc
 * @Version: 1.0
 * <p>
 * Copyright © 2021 xpc1024 All Rights Reserved
 **/
@Data
public class AggregationParam {
    /**
     * 返回字段名称
     */
    private String name;
    /**
     * 聚合字段
     */
    private String field;
    /**
     * 聚合类型
     */
    private AggregationTypeEnum aggregationType;
}