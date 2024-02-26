package com.example.consumingrest.controller;

import com.example.consumingrest.model.ResponseYesNo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

@RestController
@RequestMapping("/yesno")
public class YesNoController {
    RestClient restClient = RestClient.create();
    String uri = "https://yesno.wtf/api";
    @GetMapping("/api")
    @ResponseBody
    public ResponseEntity<ResponseYesNo> getResponseYesNo(@RequestParam("force") String force) {
        ResponseYesNo responseYesNo = restClient.get()
                .uri(uri)
                .retrieve()
                .body(ResponseYesNo.class);
        return ResponseEntity.ok(responseYesNo);
    }
}
