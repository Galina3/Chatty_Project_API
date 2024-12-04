import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static apiUtil.ApiRequestsUser.deleteRequest;
import static apiUtil.UrlUtil.UPDATE_OR_DELETE_USER_PATH;
import static user.UserRole.ADMIN;
import static user.UserRole.USER;


public class AdminUserTest extends BaseTest {
    protected String userId;
    protected String adminId;

    @BeforeEach
    public void setUp() {
        setTokensAfterUserRegistration(USER);
        setTokensAfterUserRegistration(ADMIN);
        this.userId = getUserIdAfterRequest();
        this.adminId = getAdminIdAfterRequest();
    }

    @AfterEach
    public void deleteUserAndAdmin() {
        deleteRequest(UPDATE_OR_DELETE_USER_PATH, 204, accessAdminToken, userId);
        deleteRequest(UPDATE_OR_DELETE_USER_PATH, 204, accessAdminToken, adminId);
    }
}
