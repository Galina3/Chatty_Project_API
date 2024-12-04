import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static apiUtil.ApiRequestsUser.*;
import static apiUtil.UrlUtil.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static user.UserDataRegistry.putUpdatePassword;
import static user.UserDataRegistry.putUpdatePasswordEmpty;

public class PutPasswordUserTest extends AdminUserTest {

    @Test
    public void putPasswordUserWithValidDataTest(){
    Response response = putPasswordRequest(UPDATE_PASSWORD_PATH, putUpdatePassword(),200,accessToken);
    assertEquals(200, response.getStatusCode());
}

    @Test
    public void putPasswordWithNoAuthorisationTest() {
        Response response = putPasswordRequest(UPDATE_PASSWORD_PATH, putUpdatePassword(),401,"");
        assertEquals(401, response.getStatusCode());
    }

    @Test
    public void putPasswordWithEmptyDataTest() {
        Response response = putPasswordRequest(UPDATE_PASSWORD_PATH, putUpdatePasswordEmpty(),400,accessToken);
        assertEquals(400, response.getStatusCode());
    }
}

