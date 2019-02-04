package de.fiwanecki.cleanarchitecture.data.mappers;

import de.fiwanecki.cleanarchitecture.data.model.user.UserData;
import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;

public class UserDataEntityMapper extends BaseMapper<UserData, UserEntity> {
    @Override
    public UserEntity mapFrom(UserData from) {
        return new UserEntity(from.getUuid(), from.getUsername(), from.getEmail());
    }
}
