package de.fiwanecki.cleanarchitecture.domain.usecases.user;

import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;
import de.fiwanecki.cleanarchitecture.domain.usecases.BaseUseCase;

public interface GetUserUseCase extends BaseUseCase {
    UserEntity getUser(String uuid);
}
