package com.iesam.digitallibrary.features.user.presentation;

import com.iesam.digitallibrary.features.user.domain.NewUserUseCase;
import com.iesam.digitallibrary.features.user.domain.User;

public class UserPresentation {
    public void create(User user){
        NewUserUseCase newUserUseCase = new NewUserUseCase();
        newUserUseCase.execute(user);
    }
}
