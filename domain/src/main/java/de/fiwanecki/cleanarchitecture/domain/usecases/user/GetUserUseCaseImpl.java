package de.fiwanecki.cleanarchitecture.domain.usecases.user;

import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;
import de.fiwanecki.cleanarchitecture.domain.repositories.user.UserRepository;

public class GetUserUseCaseImpl implements GetUserUseCase {

    private UserRepository userRepository;

    public UserEntity getUser(String uuid) {
        return userRepository.getUser(uuid);
    }
}
