package de.fiwanecki.cleanarchitecture.data.repositories.user;

import de.fiwanecki.cleanarchitecture.data.dataproviders.user.UserDataProvider;
import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UserRepositoryImplTest {

    UserDataProvider userDataProvider = mock(UserDataProvider.class);

    UserRepositoryImpl userRepository = new UserRepositoryImpl(userDataProvider);

    @Test
    void returnsUser() {
        UserEntity expected = givenAUserIsFound();
        UserEntity actual = userRepository.getUser("uuid");
        assertEquals(expected, actual);
    }

    private UserEntity givenAUserIsFound() {
        UserEntity expected = new UserEntity("uuid", "username", "user@mail.de");
        when(userDataProvider.getUser("uuid")).thenReturn(expected);
        return expected;
    }
}
