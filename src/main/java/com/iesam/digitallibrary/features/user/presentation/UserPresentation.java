package com.iesam.digitallibrary.features.user.presentation;

import com.iesam.digitallibrary.features.user.data.UserDataRepository;
import com.iesam.digitallibrary.features.user.domain.NewUserUseCase;
import com.iesam.digitallibrary.features.user.domain.User;
import com.iesam.digitallibrary.features.user.domain.UserRepository;

public class UserPresentation {
    public static void save(User user){
        NewUserUseCase newUserUseCase = new NewUserUseCase(UserDataRepository.newInstance());
        newUserUseCase.execute(user);
    }
}
