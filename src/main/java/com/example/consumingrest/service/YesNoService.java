package com.example.consumingrest.service;

import com.example.consumingrest.client.YesNoClient;
import com.example.consumingrest.model.Force;
import com.example.consumingrest.model.ResponseYesNo;
import org.springframework.stereotype.Service;

@Service
public class YesNoService {
    YesNoClient yesNoClient = new YesNoClient();
    public ResponseYesNo getYesNo(Force force) {
        return yesNoClient.getYesNo(force);
    }
}
