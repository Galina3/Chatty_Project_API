import static apiUtil.ApiRequestsUser.getRequest;
import static apiUtil.ApiRequestsUser.postRequestNoToken;

import user.AuthorizationUser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import user.UserRole;


import static apiUtil.UrlUtil.*;
import static user.UserDataRegistry.getAdminRegistration;
//import static user.UserDataRegistry.getUserForLogin;
import static user.UserDataRegistry.getUserRegistration;
import static user.UserRole.ADMIN;
import static user.UserRole.USER;


public class BaseTest {
    protected String accessToken;
    protected String refreshToken;
    protected String accessAdminToken;
    protected String refreshAdminToken;
    protected AuthorizationUser authRegisteredUser;

    public void setTokensAfterUserRegistration(UserRole role) {
        JsonPath jsonPath = registerValidUser(role).jsonPath();
        String accessToken = jsonPath.getString("accessToken");
        String refreshToken = jsonPath.getString("refreshToken");
        if (ADMIN == role) {
            this.accessAdminToken = accessToken;
            this.refreshAdminToken = refreshToken;
        } else if (USER == role) {
            this.accessToken = accessToken;
            this.refreshToken = refreshToken;
        } else {
            throw new IllegalArgumentException("User with unknown role");
        }
    }

    private Response registerValidUser(UserRole role) {
        if (ADMIN == role) {
            this.authRegisteredUser = getAdminRegistration();
        } else if (USER == role) {
            this.authRegisteredUser = getUserRegistration();
        } else {
            throw new IllegalArgumentException("User with unknown role");
        }
        return postRequestNoToken(REGISTER_PATH, authRegisteredUser, 201);
    }

    public String getUserIdAfterRequest() {
        return getRequest(GET_USER_PATH, 200, accessToken)
                .jsonPath()
                .getString("id");
    }

    public String getAdminIdAfterRequest() {
        return getRequest(GET_USER_PATH, 200, accessAdminToken)
                .jsonPath()
                .getString("id");
    }
}
