package pl.coderslab.tdd;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<Integer, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public User createUser(User user) {
        user.setId(users.size() + 1);
        users.put(users.size() + 1, user);
        return user;
    }

// pozostałe metody
}