package com.scalar.userservice.Repositories;

import com.scalar.userservice.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    User save(User user);//upsert > update+insert
}
