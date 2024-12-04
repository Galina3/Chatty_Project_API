package apiUtil;

import user.UserRole;

import java.util.Objects;

public class User {
    private String id;
    private String name;
    private String surname;
    private String phone;
    private String email;
    private UserRole role;
    private Gender gender;
    private String birthDate;
    private String avatarUrl;
    private String backgroundUrl;
    private boolean blocked;

    public User(String id, String name, String surname, String phone, String email, UserRole role, Gender gender, String birthDate, String avatarUrl, String backgroundUrl, boolean blocked) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.role = role;
        this.gender = gender;
        this.birthDate = birthDate;
        this.avatarUrl = avatarUrl;
        this.backgroundUrl = backgroundUrl;
        this.blocked = blocked;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return blocked == user.blocked && Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(phone, user.phone) && Objects.equals(email, user.email) && role == user.role && gender == user.gender && Objects.equals(birthDate, user.birthDate) && Objects.equals(avatarUrl, user.avatarUrl) && Objects.equals(backgroundUrl, user.backgroundUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, phone, email, role, gender, birthDate, avatarUrl, backgroundUrl, blocked);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", gender=" + gender +
                ", birthDate='" + birthDate + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", backgroundUrl='" + backgroundUrl + '\'' +
                ", blocked=" + blocked +
                '}';
    }
}