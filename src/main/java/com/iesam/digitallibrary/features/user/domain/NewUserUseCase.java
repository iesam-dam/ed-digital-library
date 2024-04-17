package com.iesam.digitallibrary.features.user.domain;

public class NewUserUseCase {
    UserRepository userRepository;
    public NewUserUseCase(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public final void execute(User user){
        userRepository.save(user);
    }


}
