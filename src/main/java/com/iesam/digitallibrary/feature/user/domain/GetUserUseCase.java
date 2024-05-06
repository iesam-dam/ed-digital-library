package com.iesam.digitallibrary.feature.user.domain;

public class GetUserUseCase {

    private UserRepository userRepository;

    public GetUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User execute(String userId){
        return userRepository.getUser(userId);
    }
}
