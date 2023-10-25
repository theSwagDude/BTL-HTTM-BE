/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btlhttm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.btlhttm.model.Role;
/**
 *
 * @author HP
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String name);
}