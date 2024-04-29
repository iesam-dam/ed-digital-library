package com.iesam.digitallibrary.feature.user.data;

import com.iesam.digitallibrary.feature.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.feature.user.domain.User;
import com.iesam.digitallibrary.feature.user.domain.UserRepository;

/**
 * Esta es la clase que me permite gestionar las fuentes de datos: local | remota| otras....
 */
public class UserDataRepository implements UserRepository {

    private UserFileLocalDataSource localDataSource;

    public UserDataRepository(UserFileLocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override
    public void saveUser(User user) {
        localDataSource.save(user);
    }

    @Override
    public void removeUser(String userId) {
        localDataSource.remove();
    }
}
