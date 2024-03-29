package com.example.consumingrest.controller;

import com.example.consumingrest.model.Force;
import com.example.consumingrest.model.ResponseYesNo;
import com.example.consumingrest.service.YesNoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/yesno")
public class YesNoController {

    YesNoService yesNoService = new YesNoService();

    @GetMapping("/api")
    @ResponseBody
    public ResponseEntity<String> getResponseYesNo(@RequestParam("force") String force) {
        String response = yesNoService.getYesNo(Force.valueOf(force));
        return ResponseEntity.ok(response);
    }
}
