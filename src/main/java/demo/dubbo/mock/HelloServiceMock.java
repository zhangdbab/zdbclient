package demo.dubbo.mock;

import demo.dubbo.api.IHelloService;

/**
 * Created by DJ009828 on 2020/10/31 18:35
 */
public class HelloServiceMock implements IHelloService {
    @Override
    public String helle(String msg) {
        return  "hello, "+msg+" ， 系统繁忙";
    }
}
