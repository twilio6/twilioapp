package com.twiliosms;



import com.twiliosms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sms")
public class SmsController {
    @Autowired
    private SmsService smsService;

    @PostMapping("/send")
    public String sendSms(@RequestBody SmsRequest smsRequest) {
        //validate input and handle errors if needed

        smsService.sendSms(smsRequest.getTo(), smsRequest.getMessage());


        return "SMS sent successfully!";
    }
}



