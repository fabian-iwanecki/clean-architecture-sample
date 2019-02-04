package de.fiwanecki.cleanarchitecture.entrypoints.rest;

import de.fiwanecki.cleanarchitecture.data.dataproviders.BaseDataProvider;
import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;

public interface UserRestEntrypoint extends BaseDataProvider {
    UserEntity getUser(String uuid);
}
