package com.example.jkm.dao;

import com.example.jkm.domian.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select new User(name, collage, passInfo, passIdentity, imagesUrl) from User where code = ?1 and mockLocation = ?2")
    User findByCodeAndLocation(String userCode, String location);
}
