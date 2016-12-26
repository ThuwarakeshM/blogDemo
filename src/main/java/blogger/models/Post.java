package blogger.models;

import java.util.Date;

/**
 * Created by thuwarakesh on 12/24/16.
 */
public class Post {
    private Long id;
    private String title;
    private String body;
    private User auther;
    private Date date = new Date();

    public Post(Long id, String title, String body, User auther) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.auther = auther;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getAuther() {
        return auther;
    }

    public void setAuther(User auther) {
        this.auther = auther;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", auther=" + auther +
                ", date=" + date +
                '}';
    }
}
