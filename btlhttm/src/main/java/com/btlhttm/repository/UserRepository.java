/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btlhttm.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.btlhttm.model.User;
/**
 *
 * @author HP
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    Optional<User> findOneByEmailAndPassword(String email, String password);
    Optional<User> findOneByUsernameAndPassword(String email, String password);
}

