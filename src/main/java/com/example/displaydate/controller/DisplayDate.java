package com.example.displaydate.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@Controller
public class DisplayDate {

    @RequestMapping("/")
    public String root(){
    return "home";
}

@RequestMapping("/date")
public String dat(Model model){
    Date date = new Date();
            model.addAttribute("Date",date);
            return "date";
}

@RequestMapping("/time")
public String timme(Model model){

    LocalTime time = LocalTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
    String formatterTime = time.format(formatter);
    model.addAttribute("Time",formatterTime);
    return "time";
}

}
