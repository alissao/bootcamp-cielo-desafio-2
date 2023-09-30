package com.cielo.desafio2.domain.delegate;

import com.cielo.desafio2.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.cielo.desafio2.api.UserApiDelegate;

import java.util.List;

@Service
public class UserDelegateImpl implements UserApiDelegate {

    @Override
    public ResponseEntity<User> createUserByDoc(List<User> user) {
        return UserApiDelegate.super.createUserByDoc(user);
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username, User user) {
        return UserApiDelegate.super.deleteUser(username, user);
    }

    @Override
    public ResponseEntity<String> getUser(String username, String password) {
        return UserApiDelegate.super.getUser(username, password);
    }

    @Override
    public ResponseEntity<Void> updateUser(String username, User user) {
        return UserApiDelegate.super.updateUser(username, user);
    }
}
