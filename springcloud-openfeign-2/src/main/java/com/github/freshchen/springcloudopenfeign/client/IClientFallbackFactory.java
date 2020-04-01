package com.github.freshchen.springcloudopenfeign.client;

import com.github.freshchen.springcloudopenfeign.controller.Form;
import feign.hystrix.FallbackFactory;

/**
 * @author darcy
 * @since 2020/03/24
 **/
public class IClientFallbackFactory  implements FallbackFactory<IClient> {
    @Override
    public IClient create(Throwable throwable) {
        return new IClientFallbackClientFallback();
    }

    public static class IClientFallbackClientFallback implements IClient {

        @Override
        public String test(Form form) {
            return "失败";
        }
    }
}