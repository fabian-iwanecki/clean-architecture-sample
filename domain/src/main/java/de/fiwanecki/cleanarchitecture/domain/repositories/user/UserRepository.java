package de.fiwanecki.cleanarchitecture.domain.repositories.user;

import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;
import de.fiwanecki.cleanarchitecture.domain.usecases.BaseUseCase;

public interface UserRepository extends BaseUseCase {
    UserEntity getUser(String uuid);
}
