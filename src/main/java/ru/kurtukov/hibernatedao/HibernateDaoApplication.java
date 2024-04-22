package ru.kurtukov.hibernatedao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kurtukov.hibernatedao.entity.Person;

@SpringBootApplication
public class HibernateDaoApplication implements CommandLineRunner {
	@PersistenceContext
	private EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(HibernateDaoApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) {
		System.out.println(entityManager.createQuery("from Person", Person.class).getResultList());
	}

}
