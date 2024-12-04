import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static apiUtil.ApiRequestsUser.putRequest;
import static apiUtil.UrlUtil.UPDATE_OR_DELETE_USER_PATH;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static user.UserProfile.getUserForUpdate;
import static user.UserProfile.getUserForUpdateEmpty;

public class PutUserTest extends AdminUserTest {

    @Test
    public void putUserTest() {
        Response response = putRequest(UPDATE_OR_DELETE_USER_PATH, getUserForUpdate(), 200, accessToken,userId);
        String userId = response.jsonPath().getString("id");
        assertNotNull(userId);
    }

    @Test
    public void putUserWithEmptyDataTest() {
        Response response = putRequest(UPDATE_OR_DELETE_USER_PATH, getUserForUpdateEmpty(),400,accessToken,userId);
        assertEquals(400, response.getStatusCode());
    }
}