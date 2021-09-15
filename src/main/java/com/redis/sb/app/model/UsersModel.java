package com.redis.sb.app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash(value = "users")
public class UsersModel {

    private Integer id;
    private String login;
    private int age;


}
