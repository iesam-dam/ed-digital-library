package com.iesam.digitallibrary.feature.user.domain;

public interface UserRepository {
    void saveUser(User user);
    User getUser(String userId);

}
