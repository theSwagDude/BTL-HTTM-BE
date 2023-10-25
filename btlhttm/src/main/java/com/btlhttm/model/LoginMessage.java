/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btlhttm.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author HP
 */
@Data
@AllArgsConstructor
public class LoginMessage {
    String message;
    Boolean status;
}
