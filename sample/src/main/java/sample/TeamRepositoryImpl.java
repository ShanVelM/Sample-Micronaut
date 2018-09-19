package sample;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import org.springframework.transaction.annotation.Transactional;
import sample.dao.TeamDao;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Singleton
public class TeamRepositoryImpl implements TeamRepository {

    @PersistenceContext
    EntityManager entityManager;

    public TeamRepositoryImpl(@CurrentSession EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = true)
    public List<TeamDao> findAll() {
        return entityManager
                .createQuery("SELECT * from team", TeamDao.class)
                .getResultList();
    }
}
