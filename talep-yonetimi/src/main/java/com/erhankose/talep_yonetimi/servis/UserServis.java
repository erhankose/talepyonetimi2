package com.erhankose.talep_yonetimi.servis;

import com.erhankose.talep_yonetimi.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserServis {
    User save(User user);

    Optional<User> getById(Long id);

    Page<User> getAllPageble(Pageable pageable);
}
