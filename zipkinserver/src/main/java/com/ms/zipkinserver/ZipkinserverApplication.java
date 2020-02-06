package com.ms.zipkinserver;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinserverApplication.class, args);
	}

}
