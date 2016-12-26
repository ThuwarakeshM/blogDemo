package blogger.controllers;

import blogger.models.Post;
import blogger.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by thuwarakesh on 12/22/16.
 */
@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String index(Model model){
        List<Post> last5Post = postService.findLast5();
        model.addAttribute("last5Post", last5Post);

        List<Post> last3Post = last5Post.stream()
                .limit(3).collect(Collectors.toList());
        model.addAttribute("last3Post", last3Post);

        return "index";
    }

}
