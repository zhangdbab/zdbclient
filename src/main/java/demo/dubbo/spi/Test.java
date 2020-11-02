package demo.dubbo.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.rpc.Protocol;
import demo.dubbo.api.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by DJ009828 on 2020/10/31 18:56
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                =new ClassPathXmlApplicationContext("dubbo-client.xml") ;
        IHelloService iHelloService =(IHelloService)classPathXmlApplicationContext.getBean("iHelloService");
//        iHelloService.helle("zdb");
        System.out.println(iHelloService.helle("zdb"));

        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("myProtocol");
        System.out.println(protocol.getDefaultPort());

         System.in.read();



    }

}
