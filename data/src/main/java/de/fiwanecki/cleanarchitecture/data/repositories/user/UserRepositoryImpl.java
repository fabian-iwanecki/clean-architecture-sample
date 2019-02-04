package de.fiwanecki.cleanarchitecture.data.repositories.user;

import de.fiwanecki.cleanarchitecture.data.dataproviders.user.UserDataProvider;
import de.fiwanecki.cleanarchitecture.data.repositories.BaseRepositoryImpl;
import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;
import de.fiwanecki.cleanarchitecture.domain.repositories.user.UserRepository;

public class UserRepositoryImpl extends BaseRepositoryImpl<UserEntity> implements UserRepository {

    private UserDataProvider userDataProvider;

    public UserRepositoryImpl(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public UserEntity getUser(String uuid) {
        return userDataProvider.getUser(uuid);
    }
}
