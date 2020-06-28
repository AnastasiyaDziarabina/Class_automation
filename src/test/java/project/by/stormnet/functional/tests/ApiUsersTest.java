package project.by.stormnet.functional.tests;

import by.stormnet.core.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.by.stormnet.api.entities.UserService;

public class ApiUsersTest {
    private UserService userService = new UserService();

    @Test
    public void createUserTest() {
        Response response = userService.createUser();
        int code = response.getCode();
        Assert.assertTrue(code == 201, "User not created");

    }

    @Test
    public void updateUserTest() {
        Response response = userService.updateUser();
        int code = response.getCode();
        boolean containsText = response.getBody().contains("morpheus");
        Assert.assertTrue(code == 200 && containsText, "User not updated");

    }

    @Test
    public void deleteUserTest() {
        Response response = userService.deleteUser();
        int code = response.getCode();
        Assert.assertTrue(code == 204, "User not deleted");

    }
}