package com.redis.sb.app.repository;

import com.redis.sb.app.model.UsersModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<UsersModel, Integer> {

    List<UsersModel> findAll();
}
