package de.fiwanecki.cleanarchitecture.entrypoints.rest;

import de.fiwanecki.cleanarchitecture.data.mappers.UserDataEntityMapper;
import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;
import de.fiwanecki.cleanarchitecture.entrypoints.api.UserApi;

public class UserRestEntrypointImpl implements UserRestEntrypoint {

    private UserApi userApi;
    private UserDataEntityMapper userDataEntityMapper;

    public UserEntity getUser(String uuid) {
        return userDataEntityMapper.mapFrom(userApi.getUser(uuid));
    }
}
