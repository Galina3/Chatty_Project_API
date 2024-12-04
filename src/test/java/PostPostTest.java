import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static apiUtil.ApiRequestsPost.postCreatePostRequest;
import static apiUtil.UrlUtil.CREATE_POST;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostPostTest extends AdminUserTest {

    @Test
    public void postValidPostTest() {
        Response response = postCreatePostRequest(CREATE_POST, posts.PostCreate.createPost(), 201, accessToken);
        assertEquals(201, response.getStatusCode());
    }

    @Test
    public void postPostNoAuthorizationTest() {
        Response response = postCreatePostRequest(CREATE_POST, posts.PostCreate.createPost(), 401, "");
        assertEquals(401, response.getStatusCode());
    }
}
