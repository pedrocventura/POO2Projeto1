/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.google.gson.Gson;

/**
 *
 * @author pedro
 */
public class RecordWpp implements Record {

    @Override
    public boolean record(User user) {
        Gson gson = new Gson();
        String userS = gson.toJson(user);
        String ACCOUNT_SID = "ACfbcdbf19c1984a06255eed055fcd4241";
        String AUTH_TOKEN = "dfbf482896385d438acb0f695936c85b";

        try {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                    new com.twilio.type.PhoneNumber("whatsapp:+553196278223"),
                    new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                    userS)
                    .create();
            message.getSid();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
