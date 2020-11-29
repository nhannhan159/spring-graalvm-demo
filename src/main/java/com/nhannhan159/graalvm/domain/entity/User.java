package com.nhannhan159.graalvm.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

/**
 * @author tien.tan
 */
@Data
@Table("user")
public class User {
    @Id
    private Long id;
    private LocalDateTime gmtCreated;
    private LocalDateTime gmtModified;
    private String username;
    private String fullName;
    private String email;
    private Long phoneNumber;
    private String status;
}
