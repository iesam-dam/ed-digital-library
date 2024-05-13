package com.iesam.digitallibrary.feature.user.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

//Para crear los mocks con Mockito.
@ExtendWith(MockitoExtension.class)
class NewUserUseCaseTest {

    @Mock
    UserRepository userRepository;

    NewUserUseCase newUserUseCase;

    @BeforeEach
    public void setUp() {
        newUserUseCase = new NewUserUseCase(userRepository);
    }

    @AfterEach
    public void clear() {
        newUserUseCase = null;
    }

    @Test
    public void reciboUnUsuarioYLoGuardo() {
        //Given
        User user = new User("70", "Chema", "Apellidos", "1000", "asd@asd.com", "01/01/1990");

        //When
        newUserUseCase.execute(user);

        //Then
        Mockito.verify(userRepository, Mockito.times(1)).saveUser(user);
    }
}