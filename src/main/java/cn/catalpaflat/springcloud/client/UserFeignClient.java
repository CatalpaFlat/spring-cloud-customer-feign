package cn.catalpaflat.springcloud.client;

import cn.catalpaflat.springcloud.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author CatalpaFlat
 * @date Created in 2018/4/7 下午6:32
 */
@FeignClient("spring-cloud-provider-demo")
public interface UserFeignClient {
    @RequestMapping("{uuid}")
    User obtainUser(@RequestParam("uuid") String uuid);
}
