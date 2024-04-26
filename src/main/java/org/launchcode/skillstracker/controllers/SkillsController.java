package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {
@GetMapping
    public String skillsTracker() {
    return "<html>" +
            "<body>" +
            "<h1>" +
            "Skills Tracker" +
            "</h1>" +
            "<h2>" +
            "<ol>" +
            "<li>" +
            "Java" +
            "</li>" +
            "<li>" +
            "C#" +
            "</li>" +
            "<li>" +
            "Python" +
            "</li>" +
            "</ol>" +
            "</h2>" +
            "</body>" +
            "</html>";
    }
    @GetMapping("form")
    public String skillsForm(){
    return "<html>" +
            "<body>" +
            "<form method = 'get' action= '/skills'>" +
            "<p>" +
            "Name:" +
            "</p>" +
            "<input type='text' name='name'>" +
            "<br/>" +
            "<p>" +
            "My first language choice:" +
            "</p>" +
            "<select name='language1'>" +
            "<option value='Java'>" +
            "Java" +
            "</option>" +
            "<option value='C#'>" +
            "C#" +
            "</option>" +
            "<option value='Python'>" +
            "Python" +
            "</option>" +
            "</select>" +
            "<p>" +
            "My second language choice" +
            "</p>" +
            "<select name='language2'>" +
            "<option value='Java'>" +
            "Java" +
            "</option>" +
            "<option value='C#'>" +
            "C#" +
            "</option>" +
            "<option value='Python'>" +
            "Python" +
            "</option>" +
            "</select>" +
            "<p>" +
            "My third language choice" +
            "</p>" +
            "<select name='language3'>" +
            "<option value='Java'>" +
            "Java" +
            "</option>" +
            "<option value='C#'>" +
            "C#" +
            "</option>" +
            "<option value='Python'>" +
            "Python" +
            "</option>" +
            "</select>" +
            "</br>" +
            "<input type=submit>" +
            "</form>" +
            "</body>" +
            "</html>";
    }
    @RequestMapping(value = "skills", method = {RequestMethod.GET, RequestMethod.POST})
    public String skillsSubmission(@RequestParam String name, String language1, String language2, String language3) {
        return "<html>" +
                "<body>" +
                "<h1>" +
                name +
                "</h1>" +
                "<ol>" +
                "<li>" +
                language1 +
                "</li>" +
                "<li>" +
                language2 +
                "</li>" +
                "<li>" +
                language3 +
                "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
