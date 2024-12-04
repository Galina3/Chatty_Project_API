package user;

public class UserDataRegistry {

    public static AuthorizationUser getUserRegistration() {
        AuthorizationUser authorizationUser = new AuthorizationUser();
        authorizationUser.setEmail("ivawewe123@ukr.net");
        authorizationUser.setPassword("1234567890Qw");
        authorizationUser.setConfirmPassword("1234567890Qw");
        authorizationUser.setRole("user");
        return authorizationUser;
    }

    public static AuthorizationUser getAdminRegistration() {
        AuthorizationUser authorizationUser = new AuthorizationUser();
        authorizationUser.setEmail("ivanrfrfr22344@ukr.net");
        authorizationUser.setPassword("1234567890Qw");
        authorizationUser.setConfirmPassword("1234567890Qw");
        authorizationUser.setRole("admin");
        return authorizationUser;
    }

    public static UserUpdatePassword putUpdatePassword() {
        UserUpdatePassword userUpdatePassword = new UserUpdatePassword();
        userUpdatePassword.setCurrentPassword("1234567890Qw");
        userUpdatePassword.setNewPassword("321234567890Qw");
        userUpdatePassword.setConfirmPassword("321234567890Qw");
        return userUpdatePassword;
    }

    public static UserUpdatePassword putUpdatePasswordEmpty() {
        UserUpdatePassword userUpdatePassword = new UserUpdatePassword();
        userUpdatePassword.setCurrentPassword("");
        userUpdatePassword.setNewPassword("");
        userUpdatePassword.setConfirmPassword("");
        return userUpdatePassword;
    }
}

