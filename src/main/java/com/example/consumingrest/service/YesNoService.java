package com.example.consumingrest.service;

import com.example.consumingrest.client.YesNoClient;
import com.example.consumingrest.model.Force;
import com.example.consumingrest.model.ResponseYesNo;
import org.springframework.stereotype.Service;

@Service
public class YesNoService {
    YesNoClient yesNoClient = new YesNoClient();
    public String getYesNo(Force force) {
        ResponseYesNo responseYesNo = yesNoClient.getYesNo(force);
        String responseImageOrError = getResponseImageOrError(force, responseYesNo);
        return responseImageOrError;
    }

    public String getResponseImageOrError(Force force, ResponseYesNo responseYesNo) {
        if (force.equals(Force.YES)) {
            return responseYesNo.image();
        } else {
            //TODO: need to return Error object?
            return "error";
        }
    }
}
