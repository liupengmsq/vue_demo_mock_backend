package pengliu.me.forfrontend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pengliu.me.forfrontend.User;

import javax.servlet.http.HttpServletRequest;


@CrossOrigin
@RestController
public class DemoController {
    @GetMapping("/users")
    public List<User> getUsers(HttpServletRequest request) throws InterruptedException {
        Thread.sleep(10000);
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setAge(123);
        user1.setFirstName("first1");
        user1.setLastName("last1");

        User user2 = new User();
        user2.setAge(456);
        user2.setFirstName("first2");
        user2.setLastName("last2");

        users.add(user1);
        users.add(user2);

        return users;
    }

    @GetMapping("/users/another")
    public List<User> getAnotherUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setAge(888);
        user1.setFirstName("first3");
        user1.setLastName("last3");

        User user2 = new User();
        user2.setAge(999);
        user2.setFirstName("first4");
        user2.setLastName("last4");

        users.add(user1);
        users.add(user2);

        return users;
    }

    @ResponseStatus(code = HttpStatus.SERVICE_UNAVAILABLE,
            reason = "The HTTP Status will be SERVICE_UNAVAILABLE (CODE 503)")
    @GetMapping("/users/error")
    public void getUsersWithError() {
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        System.out.println("User is created: " + user.toString());
        return "created";
    }
}