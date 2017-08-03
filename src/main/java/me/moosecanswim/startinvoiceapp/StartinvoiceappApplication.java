package me.moosecanswim.startinvoiceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * Outline of how to make a program
 * 	1) Dependencies - sql, web, thymelear, jpa
 * 	2) Create a new database with mysql workbench "create schema [name]
 * 	3)Application properties:
 * 		Spring.database.url=jdbc.mysql://localhost:3306/[name]
 * 		Spring.datasource.driver-class-name=com.mysql.jdbc.Driver
 * 		Spring.datasource.username = root
 * 		Spring.datasource.password = password
 */


@SpringBootApplication
public class StartinvoiceappApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartinvoiceappApplication.class, args);
	}
}
