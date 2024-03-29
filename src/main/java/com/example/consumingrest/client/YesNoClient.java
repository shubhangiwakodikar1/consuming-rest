package com.example.consumingrest.client;

import com.example.consumingrest.model.Force;
import com.example.consumingrest.model.ResponseYesNo;
import org.springframework.web.client.RestClient;

public class YesNoClient {
    RestClient restClient = RestClient.create();
    String uri = "https://yesno.wtf/api";
    public ResponseYesNo getYesNo(Force force) {
        //TODO: need to figure how to use force value as request parameter
        ResponseYesNo responseYesNo = restClient.get()
                .uri(uri)
                .retrieve()
                .body(ResponseYesNo.class);
        return responseYesNo;
    }
}
