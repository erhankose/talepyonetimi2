package com.erhankose.talep_yonetimi.servis.impl;

import com.erhankose.talep_yonetimi.entity.User;
import com.erhankose.talep_yonetimi.repository.TalepRepository;
import com.erhankose.talep_yonetimi.repository.UserRepository;
import com.erhankose.talep_yonetimi.servis.TalepServis;
import com.erhankose.talep_yonetimi.servis.UserServis;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServisImpl implements UserServis {

    //@Autowired setter inject.
    //public TalepRepository talepRepository;

    public final UserRepository userRepository;
    //Spring setter inject. yerine  constr.inject. best praktis
    public UserServisImpl(UserRepository userRepository) {
        this.userRepository =userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Page<User> getAllPageble(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
