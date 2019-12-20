package com.dsl.service.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName UserService
 * @Description 采购入库四实体类
 * @Author jiangruliang
 * @Date 2019/4/3 10:34
 * @Version 1.0
 */
@Data
public class User implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long id;
  private String name;
}
