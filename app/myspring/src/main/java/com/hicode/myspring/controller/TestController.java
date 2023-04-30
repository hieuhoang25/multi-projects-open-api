package com.hicode.myspring.controller;

import com.hicode.library.model.APIResponse;
import com.hicode.openapi.controller.PetApi;
import com.hicode.openapi.controller.UserApi;
import com.hicode.openapi.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements UserApi {
    /**
     * GET /user/{username} : Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing.  (required)
     * @return successful operation (status code 200)
     * or Invalid username supplied (status code 400)
     * or User not found (status code 404)
     */
    @Override
    public ResponseEntity<Object> getUserByName(String username) {
        User user = new User();
        user.setUsername(username);
        APIResponse<User> apiResponse = new APIResponse<>();
        apiResponse.setData(user);
        apiResponse.setMessage("Fetch a user by username successfully!");
        apiResponse.setStatus("200");
        return ResponseEntity.ok(apiResponse);
    }
}
