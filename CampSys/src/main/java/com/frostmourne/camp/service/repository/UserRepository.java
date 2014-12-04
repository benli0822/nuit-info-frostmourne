package com.frostmourne.camp.service.repository;

import com.frostmourne.camp.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jamesRMBP on 05/12/14.
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
