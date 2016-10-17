package cn.sheep3.cloud.client.post.repository;

import cn.sheep3.cloud.client.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sheep3 on 16-9-15.
 */
public interface PostRepository extends JpaRepository<Post,Long> {
    Post findByPostTitle(String postTitle);
    Post findByIdAndPostTitle(Long id, String postTitle);

    void deleteById(Long id);
}
