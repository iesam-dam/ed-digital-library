package com.iesam.digitallibrary.features.user.domain;

public class NewUserUseCase {
    private  UserRepository userRepository;
    public NewUserUseCase() {this.userRepository = userRepository;}

    public final void execute(User user){
        userRepository.save(user);
    }


}
