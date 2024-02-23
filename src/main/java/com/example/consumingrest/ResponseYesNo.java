package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record ResponseYesNo(String answer, Boolean forced, String image) {

}