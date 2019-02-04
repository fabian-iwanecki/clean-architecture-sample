package de.fiwanecki.cleanarchitecture.domain.usecases.user;

import de.fiwanecki.cleanarchitecture.domain.entities.UserEntity;
import de.fiwanecki.cleanarchitecture.domain.repositories.user.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GetUserUseCaseImplTest {

    private UserRepository userRepository = mock(UserRepository.class);

    private GetUserUseCaseImpl getUserUseCase = new GetUserUseCaseImpl(userRepository);

    @Test
    void returnsUser() {
        UserEntity expected = givenAUserIsFound();
        UserEntity actual = getUserUseCase.getUser("uuid");
        assertEquals(expected, actual);
    }

    @Test
    void errorWhenUserNotFound() {
        givenAUserIsNotFound();
        assertThrows(UserNotFoundException.class, () -> getUserUseCase.getUser("uuid1"));
    }

    private UserEntity givenAUserIsFound() {
        UserEntity expected = new UserEntity("uuid", "username", "user@mail.de");
        when(userRepository.getUser("uuid")).thenReturn(expected);
        return expected;
    }

    private void givenAUserIsNotFound() {
        when(userRepository.getUser(anyString())).thenReturn(null);
    }
}
