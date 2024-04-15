package com.iesam.digitallibrary.features.user.data;
import com.iesam.digitallibrary.features.user.data.local.UserFileLocalDataSource;
import com.iesam.digitallibrary.features.user.domain.User;
import com.iesam.digitallibrary.features.user.domain.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserDataRepository implements UserRepository{

    public UserFileLocalDataSource userFileLocalDataSource = new UserFileLocalDataSource();
    public final Map<String, User> userMap = new HashMap<>();
    public final ArrayList<User> users = new ArrayList<>();
    public static UserRepository instance=null;
    public static UserDataRepository newInstance(){
        if(instance==null){
            instance=new UserDataRepository();
        }
        return (UserDataRepository) instance;
    }

    @Override
    public void save(User user) {
        userFileLocalDataSource.save(user);
    }
}
