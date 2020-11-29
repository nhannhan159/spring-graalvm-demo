package com.nhannhan159.graalvm.domain.service;

import com.nhannhan159.graalvm.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author tien.tan
 */
@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
        userRepository.findAll().doOnNext(System.out::println).subscribe();
    }
}
