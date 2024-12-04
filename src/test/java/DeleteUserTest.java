import static apiUtil.ApiRequestsUser.deleteRequest;
import static apiUtil.ApiRequestsUser.getRequest;
import static apiUtil.UrlUtil.GET_USER_PATH;
import static apiUtil.UrlUtil.UPDATE_OR_DELETE_USER_PATH;

import io.restassured.response.Response;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeleteUserTest extends AdminUserTest {

    @Test
    public void deleteUserTest() {
        deleteRequest(UPDATE_OR_DELETE_USER_PATH, 204, accessAdminToken, userId);
        Response getUserResponse = getRequest(GET_USER_PATH, 404, accessToken);
        String errorMessage = getUserResponse.getBody().jsonPath().getString("message");
        assertEquals("User not found!", errorMessage);
    }

    @Test
    public void deleteUserNoAuthorizationTest() {
        Response deleteUserResponse = deleteRequest(UPDATE_OR_DELETE_USER_PATH, 401, null, userId);
        String errorMessage = deleteUserResponse.getBody().jsonPath().getString("message");
        assertEquals("Unauthorized", errorMessage);
    }

    @Test
    public void deleteUserByUserTest() {
        Response deleteUserResponse = deleteRequest(UPDATE_OR_DELETE_USER_PATH, 403, accessToken, userId);
        String errorMessage = deleteUserResponse.getBody().jsonPath().getString("message");
        assertEquals("You don't have permission to delete users", errorMessage);
    }

    @Test
    public void deleteUserBadRequestTest() {
        Response response = deleteRequest(UPDATE_OR_DELETE_USER_PATH, 404, accessAdminToken, "");
        assertEquals(404, response.getStatusCode());
    }


}
