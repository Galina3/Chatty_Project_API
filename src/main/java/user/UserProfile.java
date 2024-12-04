package user;

import apiUtil.Gender;
import apiUtil.User;

public class UserProfile {
    public static User getUserForUpdate (){
        User user = new User();
        user.setAvatarUrl("qwe");
        user.setName("Ivan");
        user.setSurname("Ivanov");
        user.setBirthDate("2000-11-29T10:35:04.464Z");
        user.setPhone("+1234567890");
        user.setGender(Gender.FEMALE);
        user.setBackgroundUrl("qwer");
        user.setBlocked(true);
        return user;
    }

    public static User getUserForUpdateEmpty (){
        User user = new User();
        user.setAvatarUrl("");
        user.setName("");
        user.setSurname("");
        user.setBirthDate("");
        user.setPhone("");
        user.setGender(Gender.MALE);
        user.setBackgroundUrl("");
        user.setBlocked(true);
        return user;
    }
}
