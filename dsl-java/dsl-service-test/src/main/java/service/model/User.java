package service.model;

import lombok.Data;

import java.io.Serializable;

/**
 *@ClassName User
 *@Description 实体类
 *@Author jiangruliang
 *@Date 2019/4/17 9:49
 *@Version 1.0
 */
@Data
public class User implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long id;
  private String name;
}
