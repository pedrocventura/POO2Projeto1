/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author pedro
 */
public class Register {

    protected User user;
    protected Record typerecord;

    public Register(User user, Record type) {
        setType(type);
        setUser(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setType(Record type) {
        this.typerecord = type;
    }

    public boolean register() {
        try {
            typerecord.record(this.user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
