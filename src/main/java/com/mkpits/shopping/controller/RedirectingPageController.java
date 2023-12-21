package com.mkpits.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RedirectingPageController {



    @GetMapping("/showLoginPage")
    public String redirectPage(){

        return "dashboard";
        /// redirect to login page;
    }

   @RequestMapping("/redirectToAdminPage")
    public String redirectoAdminPage(){
        return "product";
        // redirect of admin to productPAge
    }
    @RequestMapping("/redirectToUserLoginPage")
    public String redirectToUser(){
        return "login";

        // redirect of user to user login
    }
    @RequestMapping("/mainPage")
    public String mainPage(){
        return "dashboard";
        // opening mainPage
    }

    @GetMapping("/myntra")
    public String myntraPage(){
        return "myntra1";
    }


    @GetMapping("/addingsearchfunction")
    public String myNextFrontPage(){

        return "addingsearachfunction";
    }

}
