package org.example.icloud;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by 10235627@zte.intra on 20-12-15.
 */
@Component
public class OrderServiceFallbackService implements OrderService {

    @Override
    public String save() {
        return "服务降级类save降级方法";
    }

    @Override
    public String timeOut() {
        return "服务降级类timeOut降级方法";
    }
}
