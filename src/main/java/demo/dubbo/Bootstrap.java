package demo.dubbo;

import demo.dubbo.api.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by DJ009828 on 2020/10/31 18:56
 */
public class Bootstrap {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                =new ClassPathXmlApplicationContext("dubbo-client.xml") ;
        IHelloService iHelloService =(IHelloService)classPathXmlApplicationContext.getBean("iHelloService");
//        iHelloService.helle("zdb");
        System.out.println(iHelloService.helle("zdb"));

         System.in.read();


    }

}
