package service.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.base.BaseController;
import service.feign.UserFeign;
import service.model.User;

import java.util.List;

/**
 * @ClassName TestController
 * @Description 测试控制器
 * @Author jiangruliang
 * @Date 2019/4/16 17:35
 * @Version 1.0
 * 添加swagger api文档，参考https://blog.csdn.net/sanyaoxu_2/article/details/80555328
 */
@RestController
@RequestMapping("/test")
@Api(value = "TestController|一个用来测试swagger注解的控制器")
public class TestController extends BaseController {
    @Autowired
    private UserFeign userFeign;
    @GetMapping("/getall")
    @ApiOperation(value="获取全部用户", notes="test: 仅1和2有正确返回")
    public List<User> getAll(){
        return userFeign.getall();
    }
    @Override
    public void getErrorLog(String errorMsg) {

    }
}
