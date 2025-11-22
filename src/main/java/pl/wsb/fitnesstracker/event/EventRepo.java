package pl.wsb.fitnesstracker.event;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Getter;

@Repository
@Getter
public class EventRepo {

    @PersistenceContext
    private final EntityManager entityManager;

    public EventRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public List<Event> findByName(String name) {
        String jpql = "SELECT e FROM Event e WHERE e.name = :name";

        return entityManager.createQuery(jpql, Event.class)
                .setParameter("name", name)
                .getResultList();
    }
}
