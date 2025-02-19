package com.example.adp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello world!";
    }
    @GetMapping("/helloagain")
    public String[] helloAgain() {
        return new String[] { "hello world!", "again", "hang on what's this?" };
    }
    @GetMapping("/pojo")
    public MyPOJO[] myPojo() {
        return new MyPOJO[] {
                new MyPOJO("John", "Smith", 1234567),
                new MyPOJO("Sarah", "Brown", 7654321) };
    }
    @GetMapping("/pojo/{first}/{last}/{id}")
    public MyPOJO myPojo( @PathVariable("first") String firstName,
                          @PathVariable("last") String lastName,
                          @PathVariable("id") int idNumber) {
        return new MyPOJO(firstName, lastName, idNumber);
    }




}
