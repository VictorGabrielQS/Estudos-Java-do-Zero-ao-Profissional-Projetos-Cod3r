package br.com.cod3r.exercicios_sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExerciciosSbApplication {

	public static void main(String[] args) {
        SpringApplication.run(ExerciciosSbApplication.class, args);
        System.out.println("Conexão com o banco de dados estabelecida...");


	}

}