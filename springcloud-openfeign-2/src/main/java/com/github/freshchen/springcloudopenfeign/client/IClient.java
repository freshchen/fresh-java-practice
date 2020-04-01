package com.github.freshchen.springcloudopenfeign.client;

import com.github.freshchen.springcloudopenfeign.controller.IController;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author darcy
 * @since 2020/03/24
 **/
@FeignClient(
        name = "IClient",
        url = "localhost:8800",
        fallbackFactory = IClientFallbackFactory.class
)
public interface IClient extends IController {
}
