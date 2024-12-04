import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static apiUtil.ApiRequestsUser.getRequest;
import static apiUtil.UrlUtil.GET_USER_PATH;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GetUserTest extends AdminUserTest {

    @Test
    public void getUserTest() {
        Response response = getRequest(GET_USER_PATH, 200, accessToken);
        String userId = response.jsonPath().getString("id");
        assertNotNull(userId);
    }

    @Test
    public void getUserWithNoAuthorisationTest() {
        Response response = getRequest(GET_USER_PATH, 401, "");
        assertEquals(401, response.getStatusCode());
    }

    @Test
    public void getUserWithInvalidTokenTest() {
        Response response = getRequest(GET_USER_PATH, 401, "Invalid Token");
        assertEquals(401, response.getStatusCode());
    }
}
