package com.xav.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.*;
import org.springframework.stereotype.Component;

import com.xav.bean.User;
/**
 * 
 * @author MD Shahid
 *
 */
@Component
public interface UserRepository extends MongoRepository<User,Long>{

	Optional<User> findByEmail(String email);

	List<User> findByRole(String role);

}
