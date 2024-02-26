package com.example.consumingrest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public record ResponseYesNo(String answer, Boolean forced, String image) {

}