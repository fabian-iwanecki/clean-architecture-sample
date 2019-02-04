package de.fiwanecki.cleanarchitecture.domain.usecases.user;

import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;
import de.fiwanecki.cleanarchitecture.domain.repositories.user.UserRepository;

public class GetUserUseCaseImpl implements GetUserUseCase {

    private UserRepository userRepository;

    public GetUserUseCaseImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity getUser(String uuid) {
        UserEntity userEntity = userRepository.getUser(uuid);

        if (userEntity == null) {
            throw new UserNotFoundException();
        }

        return userEntity;
    }
}
