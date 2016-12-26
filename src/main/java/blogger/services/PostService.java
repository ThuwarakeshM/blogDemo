package blogger.services;

import blogger.models.Post;

import java.util.List;

/**
 * Created by thuwarakesh on 12/24/16.
 */
public interface PostService {
    List<Post> findAll();
    List<Post> findLast5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}
