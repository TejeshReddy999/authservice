package com.mvr.authservice.repository;

import com.mvr.authservice.entity.ProfileUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ProfileUser,Long> {

    Optional<ProfileUser> findByUserName(String userName);
    boolean existsByUserName(String userName);
}
