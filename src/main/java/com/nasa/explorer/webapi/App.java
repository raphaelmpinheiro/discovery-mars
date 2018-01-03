package com.nasa.explorer.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.nasa.explorer.webapi.controller.MarsController;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(MarsController.class, args);
	}
}
