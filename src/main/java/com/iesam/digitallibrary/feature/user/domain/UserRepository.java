package com.iesam.digitallibrary.feature.user.domain;

public interface UserRepository {
    void saveUser(User user);
    void removeUser(String userId);
}
