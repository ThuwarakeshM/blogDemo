package blogger.controllers;

import blogger.models.Post;
import blogger.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thuwarakesh on 12/25/16.
 */
@Controller
public class PostController {

    @Autowired
    private PostService postService;


    @RequestMapping("/posts/view/{id}")
    public String View(@PathVariable("id") Long id, Model model){
        Post post = postService.findById(id);
        model.addAttribute("post", post);
        return "posts/view";
    }
}
