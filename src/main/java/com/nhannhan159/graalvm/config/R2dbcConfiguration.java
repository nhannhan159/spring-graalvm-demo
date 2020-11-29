package com.nhannhan159.graalvm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

/**
 * @author tien.tan
 */
@Configuration
@EnableR2dbcRepositories("com.nhannhan159.graalvm.domain.repository")
public class R2dbcConfiguration  {
}
