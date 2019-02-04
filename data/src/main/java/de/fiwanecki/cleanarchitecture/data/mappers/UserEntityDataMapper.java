package de.fiwanecki.cleanarchitecture.data.mappers;

import de.fiwanecki.cleanarchitecture.data.model.user.UserData;
import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;

public class UserEntityDataMapper extends BaseMapper<UserEntity, UserData> {
    @Override
    public UserData mapFrom(UserEntity from) {
        return new UserData(from.getUuid(), from.getUsername(), from.getEmail());
    }
}
