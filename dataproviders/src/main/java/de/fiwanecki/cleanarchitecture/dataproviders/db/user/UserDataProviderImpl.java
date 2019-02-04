package de.fiwanecki.cleanarchitecture.dataproviders.db.user;

import de.fiwanecki.cleanarchitecture.dataproviders.db.user.user.UserDao;
import de.fiwanecki.cleanarchitecture.data.dataproviders.user.UserDataProvider;
import de.fiwanecki.cleanarchitecture.data.mappers.UserDataEntityMapper;
import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;

public class UserDataProviderImpl implements UserDataProvider {

    private UserDao userDao;
    private UserDataEntityMapper userDataEntityMapper;

    public UserEntity getUser(String uuid) {
        return userDataEntityMapper.mapFrom(userDao.select(uuid));
    }
}
