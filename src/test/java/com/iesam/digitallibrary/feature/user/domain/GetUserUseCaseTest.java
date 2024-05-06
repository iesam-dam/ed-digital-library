package com.iesam.digitallibrary.feature.user.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GetUserUseCaseTest {

    @Mock
    UserRepository userRepository;

    GetUserUseCase getUserUseCase;

    @BeforeEach
    public void setUp() {
        getUserUseCase = new GetUserUseCase(userRepository);
    }

    @AfterEach
    public void clear() {
        getUserUseCase = null;
    }

    @Test
    public void dadoUnValidoUserIDEntoncesDevuelvoUnUser(){
        //Given
        User userExpected = new User("1001", "Chema", "Apellidos", "650", "asd@asd.com", "01/01/1990");
        Mockito.when(userRepository.getUser("1001")).thenReturn(userExpected);

        //When
        User userReceived = getUserUseCase.execute("1001");

        //Then
        Assertions.assertEquals(userExpected.dni, "1001");
        Assertions.assertEquals(userExpected.name, "Chema");
        Assertions.assertEquals(userExpected.surname, "Apellidos");
        Assertions.assertEquals(userExpected.phoneNumber, "650");
        Assertions.assertEquals(userExpected.email, "asd@asd.com");
        Assertions.assertEquals(userExpected.dateBorn, "01/01/1990");

        //** Errores a evitar **/
        //1. Aquí se comparan direcciones de memorias, puede darse el caso que conserve la dirección pero se haya modificado algún atributo.
        Assertions.assertEquals(userExpected, userReceived);

        //2. Puede que se de el caso que se modifiquen los atributos en ambos objetos.
        // Nota: Si hay compromiso de hacerlos final, se podría usar
        Assertions.assertEquals(userExpected.dni, userReceived.dni);
    }

    @Test
    public void dadoUnUserIdNoValidoDevuelveNull(){
        //Given
        String userDni = "1002";
        Mockito.when(userRepository.getUser("1002")).thenReturn(null);

        //When
        User userReceived = getUserUseCase.execute(userDni);

        //Then
        Assertions.assertNull(userReceived);
    }
}