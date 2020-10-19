package org.example.icloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("icloud_payment")
public class Payment {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
}
