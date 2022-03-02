package it.itsuptoyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ItsuptoyouDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItsuptoyouDiscoveryApplication.class, args);
	}

}
