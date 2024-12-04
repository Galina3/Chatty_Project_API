package posts;


public class PostCreate {

    public static Post createPost() {
        Post post = new Post();
        post.setTitle("Lorem");
        post.setDescription("Lorem Description description description description description, description 987654");
        post.setBody("Lorem Body body body body body body bodybody body; body bodybody bodybody body 852741");
        post.setImageUrl("string");
        post.setPublishDate("2024-11-05 10:59");
        post.setDraft(true);
        return post;
    }
}