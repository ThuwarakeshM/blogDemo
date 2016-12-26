package blogger.models;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by thuwarakesh on 12/24/16.
 */
public class User {
    private Long id;
    private String username;
    private String passwordHash;
    private String fullName;
    private Set<Post> Posts = new HashSet<>();

    public User(long id, String username,String fullName) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Post> getPosts() {
        return Posts;
    }

    public void setPosts(Set<Post> posts) {
        Posts = posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
