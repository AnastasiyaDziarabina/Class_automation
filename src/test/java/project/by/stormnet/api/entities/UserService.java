package project.by.stormnet.api.entities;

import by.stormnet.core.FrameworkHttpClient;
import by.stormnet.core.Response;

;

public class UserService extends AbstractService {
    private FrameworkHttpClient client = new FrameworkHttpClient();
    private String userUrl = baseUrl1 + "/api/users";
    private String putUrl = baseUrl1 + "/api/users/2";
    private String deleteUrl = baseUrl1 + "/api/users/2";


    public Response createUser(){
        System.out.println("Create new user");
        return client.doPost(userUrl,"{\n" + "\"name\": \"morpheus\",\n" + "\"job\": \"leader\"\n" + "}");
    }

    public Response updateUser(){
        System.out.println("Update user");
        return client.doPut(putUrl,"{\n" + "\"name\": \"morpheus\",\n" + "\"job\": \"zion resident\"\n" + "}");
    }
    public Response deleteUser(){
        System.out.println("Delete user");
        return client.doDelete(deleteUrl);
    }
}