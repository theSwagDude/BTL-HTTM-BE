/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btlhttm.service;

import com.btlhttm.dto.LoginDto;
import com.btlhttm.dto.UserDto;
import com.btlhttm.model.LoginMessage;
import java.util.List;
import com.btlhttm.model.User;
/**
 *
 * @author HP
 */

public interface UserService {
    LoginMessage saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
    
    LoginMessage loginUser(LoginDto loginDTO);
}