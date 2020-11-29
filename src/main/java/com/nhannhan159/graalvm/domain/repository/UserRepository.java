package com.nhannhan159.graalvm.domain.repository;

import com.nhannhan159.graalvm.domain.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author tien.tan
 */
public interface UserRepository extends ReactiveCrudRepository<User, Long> {
}