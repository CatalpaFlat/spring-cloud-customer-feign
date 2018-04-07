package cn.catalpaflat.springcloud.idal;

import cn.catalpaflat.springcloud.client.UserFeignClient;
import cn.catalpaflat.springcloud.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author CatalpaFlat
 * @date Created in 2018/4/7 下午6:35
 */
@RestController
public class FeignIdal {
    @Resource
    private UserFeignClient userFeignClient;


    @GetMapping("feign/{uuid}")
    public User obtainUser(@PathVariable String uuid) {
        return userFeignClient.obtainUser(uuid);
    }
}
