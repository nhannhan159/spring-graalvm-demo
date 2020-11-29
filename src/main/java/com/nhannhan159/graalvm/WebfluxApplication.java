package com.nhannhan159.graalvm;

import com.nhannhan159.graalvm.domain.entity.User;
import com.nhannhan159.graalvm.domain.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

/**
 * fork from https://github.com/spring-projects-experimental/spring-graalvm-native
 *
 * @author tien.tan
 */
@SpringBootApplication(scanBasePackages = "com.nhannhan159.graalvm")
public class WebfluxApplication {

	@Bean
	RouterFunction<ServerResponse> routes(UserRepository userRepository) {
		return route().GET("/users", r -> ok().body(userRepository.findAll(), User.class)).build();
	}

//	@Bean
//	@ConditionalOnBean()
//	ApplicationRunner runner(UserRepository userRepository) {
//		return args -> userRepository.findAll().doOnNext(System.out::println).subscribe();
//	}

	public static void main(String[] args) {
		SpringApplication.run(WebfluxApplication.class, args);
	}
}
