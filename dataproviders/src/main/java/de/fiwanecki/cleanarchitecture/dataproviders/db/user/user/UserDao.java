package de.fiwanecki.cleanarchitecture.dataproviders.db.user.user;

import de.fiwanecki.cleanarchitecture.data.daos.BaseDao;
import de.fiwanecki.cleanarchitecture.data.model.user.UserData;

import javax.persistence.EntityManager;

public class UserDao implements BaseDao<UserData> {

    private EntityManager entityManager;

    public UserData select(Object id) {
        return entityManager.find(UserData.class, id);
    }

    public UserData merge(UserData userData) {
        return entityManager.merge(userData);
    }

    public void delete(UserData userData) {
        entityManager.remove(userData);
    }
}
