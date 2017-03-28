package interf;

import bean.User;

/**
 * Created by Oliverlee on 2017/3/28.
 */
public interface UserService {
    void update(User var1);
//
//    User save(User var1);
//
//    User findById(String var1);

    void deleteById(String var1);
}
