package apiUtil;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class UrlUtil {

    public static final String BASE_URL = "http://chatty.telran-edu.de:8989";

    public static final String GET_USER_PATH = "/api/me";

    public static final String UPDATE_OR_DELETE_USER_PATH = "/api/users/";

    public static final String REGISTER_PATH = "/api/auth/register";

    public static final String UPDATE_PASSWORD_PATH = "/api/user/password/update";

    public static final String GET_POSTS_BY_USER_START = "/api/users/";

    public static final String GET_POSTS_BY_USER_END = "/posts";

    public static final String CREATE_POST = "/api/posts";

    public static final RequestSpecification SPECIFICATION = new RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .setContentType(ContentType.JSON).build().log().all();

    private UrlUtil() {
    }
}
