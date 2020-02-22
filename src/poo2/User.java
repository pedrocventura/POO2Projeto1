/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import java.security.SecureRandom;

/**
 *
 * @author pedro
 */
public class User {

    protected String username;
    protected String password;
    protected String email;
    protected String cell;

    public User(String username, String email, String cell) {
        setEmail(email);
        setCell(cell);
        generatePassword();
        setUsername(username);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public User(String email, String cell) {
        this.email = email;
        this.cell = cell;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    //Autogenerate the password
    private void generatePassword() {
        SecureRandom random1 = new SecureRandom();
        long longToken = Math.abs(random1.nextLong());
        String random = Long.toString(longToken, 20);
        setPassword(random);
    }
}
