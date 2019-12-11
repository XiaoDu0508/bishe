package cn.ekgc.itrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>注册中心启动类</b>
 */
@EnableEurekaServer
@SpringBootApplication
public class ItripEurekaStarter {
	public static void main(String[] args) {
		SpringApplication.run(ItripEurekaStarter.class, args);
	}
}
