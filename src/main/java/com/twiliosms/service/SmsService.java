package com.twiliosms.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.lookups.v1.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    @Value("${twilio.account-sid}")
    private String accountSid;

    @Value("${twilio.auth-token}")
    private String authToken;

    @Value("${twilio.phone-number}")
    private String twilioPhoneNumber;

    public void sendSms(String to, String message) {
        Twilio.init(accountSid, authToken);

        Message twilioMessage = Message.creator(
                new com.twilio.type. PhoneNumber(to),
                new com.twilio.type.PhoneNumber(twilioPhoneNumber),
                message)
        .create();

        System.out.println("SMS sent: " + twilioMessage.getSid());
    }
}

