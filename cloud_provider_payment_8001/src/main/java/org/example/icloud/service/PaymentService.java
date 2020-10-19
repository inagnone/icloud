package org.example.icloud.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.icloud.entity.Payment;
import org.example.icloud.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

@Service
public class PaymentService extends ServiceImpl<PaymentMapper, Payment> {

}
