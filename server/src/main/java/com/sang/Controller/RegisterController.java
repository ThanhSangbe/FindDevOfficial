package com.sang.Controller;

import com.sang.pojo.Accounts;
import com.sang.pojo.Candidate;
import com.sang.service.JobService;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @Autowired
    private JobService jobservice;

    @RequestMapping("/Register")
    public String index(@ModelAttribute Accounts accounts) {

        return "register";
    }

    @RequestMapping("/Register2")
    public String index2(@ModelAttribute Candidate candidate, Model model) {
        model.addAttribute("jobs", this.jobservice.getJobs());
        return "register2";
    }

    @PostMapping("/Register")
    public String postStep1(@ModelAttribute @Valid Accounts accounts, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }
        return "redirect: /Register2";
    }
    @PostMapping("/Register2")
    public String postStep2(@ModelAttribute @Valid Candidate candidate, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "register2";
        }
        return "redirect:/";
    }
}
