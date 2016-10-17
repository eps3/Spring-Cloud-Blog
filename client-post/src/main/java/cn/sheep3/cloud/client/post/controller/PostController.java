package cn.sheep3.cloud.client.post.controller;

import cn.sheep3.cloud.client.post.entity.Post;
import cn.sheep3.cloud.client.post.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sheep3 on 16-10-17.
 */
@Slf4j
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostRepository postRepo;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(path = "/{postId}",method = RequestMethod.GET)
    public Post getPost(@PathVariable("postId") Long postId){
        ServiceInstance instance = client.getLocalServiceInstance();
        log.info("/post/"+postId+", host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return postRepo.getOne(postId);
    }

}
