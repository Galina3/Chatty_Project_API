package posts;

import java.util.Objects;

public class Post {

    private String title;
    private String description;
    private String body;
    private String imageUrl;
    private String publishDate;
    private boolean draft;

    public Post() {
    }

    public Post(String title, String description, String body, String imageUrl, String publishDate, boolean draft) {
        this.title = title;
        this.description = description;
        this.body = body;
        this.imageUrl = imageUrl;
        this.publishDate = publishDate;
        this.draft = draft;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public boolean isDraft() {
        return draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;
        return isDraft() == post.isDraft() && Objects.equals(getTitle(), post.getTitle()) && Objects.equals(getDescription(), post.getDescription()) && Objects.equals(getBody(), post.getBody()) && Objects.equals(getImageUrl(), post.getImageUrl()) && Objects.equals(getPublishDate(), post.getPublishDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDescription(), getBody(), getImageUrl(), getPublishDate(), isDraft());
    }
}
