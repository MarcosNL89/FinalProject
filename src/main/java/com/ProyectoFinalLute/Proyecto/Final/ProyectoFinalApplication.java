package com.ProyectoFinalLute.Proyecto.Final;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoFinalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listening on. http://localhost.3000/h2-console");

		}

	}


