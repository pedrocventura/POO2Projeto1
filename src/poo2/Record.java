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
public interface Record {
    // Aqui define que as classes que implementam essa interface devem;
    // por obrigação ter o método de registrar, seja via xml, sms, wpp, email ou json;
    public boolean record(User user);
}
