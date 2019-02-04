package de.fiwanecki.cleanarchitecture.data.dataproviders.user;

import de.fiwanecki.cleanarchitecture.data.dataproviders.BaseDataProvider;
import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;

public interface UserDataProvider extends BaseDataProvider {
    UserEntity getUser(String uuid);
}
