package org.example.icloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.icloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
