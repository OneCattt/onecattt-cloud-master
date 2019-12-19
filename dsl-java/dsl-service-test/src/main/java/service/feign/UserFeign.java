package service.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.config.FeignDisableHystrixConfiguration;
import service.model.User;

import java.util.List;

@FeignClient(name = "dsl-service-user", configuration = FeignDisableHystrixConfiguration.class)
public interface UserFeign {

    @RequestMapping(value = "/user/getall", method = RequestMethod.GET)
     List<User> getall();
}
