package com.erhankose.talep_yonetimi.repository;

import com.erhankose.talep_yonetimi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

  User findByUname(String user_name);
}
