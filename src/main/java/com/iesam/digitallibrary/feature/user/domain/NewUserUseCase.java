package com.iesam.digitallibrary.feature.user.domain;

public class NewUserUseCase {

    private UserRepository userRepository;

    public NewUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(User user){
        userRepository.saveUser(null);
    }
}
