import java.util.HashMap;

public class UserService {

    // Collection for storing users
    private HashMap<String, User> users = new HashMap<>();

    // Register user
    public void registerUser(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("User already exists!");
        } else {
            users.put(username, new User(username, password));
            System.out.println("Registration successful!");
        }
    }

    // Login user
    public boolean loginUser(String username, String password) {
        User user = users.get(username);

        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
