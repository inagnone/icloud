package org.example.icloud;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 10235627@zte.intra on 20-12-10.
 */
@Configuration
public class OpenFeignConfig {

    /**
     *  NONE:默认的，不显示任何日志
     *  BASIC:仅记录请求方法，URL，响应状态和执行时间
     *  HEADERS:除了BASIC中定义的信息外，还有请求和响应的头信息
     *  FULL：除了HEADERS中的信息外，还有请求和响应的正文及元数据v
     * @return
     */
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
