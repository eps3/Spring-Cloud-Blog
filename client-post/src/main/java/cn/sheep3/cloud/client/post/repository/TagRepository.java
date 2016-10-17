package cn.sheep3.cloud.client.post.repository;

import cn.sheep3.cloud.client.post.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sheep3 on 16-9-15.
 */
public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findByName(String name);
}
