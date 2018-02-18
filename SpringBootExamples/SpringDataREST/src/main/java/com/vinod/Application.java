/**
 * 
 */
package com.vinod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author vinod
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
		System.out.println("This is Spring Boot Applicatio");
		SpringApplication.run(Application.class, args);
	}

}
