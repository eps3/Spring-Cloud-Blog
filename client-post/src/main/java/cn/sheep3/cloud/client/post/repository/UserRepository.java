package cn.sheep3.cloud.client.post.repository;

import cn.sheep3.cloud.client.post.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sheep3 on 16-9-14.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserLogin(String userLogin);
}
