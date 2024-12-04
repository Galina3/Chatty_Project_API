
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static apiUtil.ApiRequestsUser.getPostByIdRequest;
import static apiUtil.UrlUtil.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GetPostsByUserTest extends AdminUserTest {

    @Test
    public void getPostsByUserTest() {
        Response responseGetPosts = getPostByIdRequest(GET_POSTS_BY_USER_START, GET_POSTS_BY_USER_END, 200, accessToken, userId);
        assertEquals(200, responseGetPosts.getStatusCode());
    }

    @Test
    public void getPostsByUserWithNoAuthorisationTest() {
        Response responseGetPosts = getPostByIdRequest(GET_POSTS_BY_USER_START, GET_POSTS_BY_USER_END, 401, "", userId);
        assertEquals(401, responseGetPosts.getStatusCode());
    }
}