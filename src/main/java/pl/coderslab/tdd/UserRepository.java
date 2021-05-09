package pl.coderslab.tdd;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UserRepository {

    private Map<Integer, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public User create(String name) {
        User user = new User();
        user.setId(new Random().nextInt());
        user.setName(name);
        users.put(user.getId(), user);

        return user;
    }

    public void update(User user) {
        User result = users.get(user.getId());
        result.setName(user.getName());
        users.put(result.getId(), result);
    }

    public User getUser(Integer id) {
        return users.get(id);
    }

    public void remove(User user) {
        users.remove(user.getId());
    }

// pozostałe metody

}