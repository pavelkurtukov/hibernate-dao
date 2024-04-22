package ru.kurtukov.hibernatedao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.kurtukov.hibernatedao.entity.Person;

import java.util.List;

@Repository
@AllArgsConstructor
public class PersonRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("from Person where city = UPPER(:city)", Person.class)
                .setParameter("city", city)
                .getResultList();
    }

}
