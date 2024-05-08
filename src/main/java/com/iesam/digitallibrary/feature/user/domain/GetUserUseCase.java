package com.iesam.digitallibrary.feature.user.domain;

public class GetUserUseCase {

    private UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String userId){
        User user = userRepository.getUser(userId);
        return user;
    }
}
