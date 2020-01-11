package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author caiyunchun
 * @date 2019/5/22 0022
 * @return
 * Eureka
 *      高可用实际上是自己作为服务，并且向其他服务注册中心注册自己，这样就形成一组互相注册服务的注册中心，
 *      从而实现服务清单的互相同步，达到高可用效果。
 */

@SpringBootApplication
@EnableEurekaServer
public class AppEuareka {

    public static void main(String[] args) {
        SpringApplication.run(AppEuareka.class,args);
    }
}
