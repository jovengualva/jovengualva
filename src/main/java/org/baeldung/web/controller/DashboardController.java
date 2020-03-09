package org.baeldung.web.controller;

import java.util.Locale;
import org.baeldung.persistence.dao.ReceivingsummaryRepository;
import org.baeldung.persistence.model.Receivingsummary;

import org.baeldung.security.ActiveUserStore;
import org.baeldung.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    @Autowired
    ActiveUserStore activeUserStore;

    @Autowired
    IUserService userService;
    
    @Autowired
    ReceivingsummaryRepository receivingsummary;

  
    
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String getDashboard(final Locale locale, final Model model) {
//        model.addAttribute("receivingsummarys", receivingsummary.findAll());
        return "admin/dashboard";
    }
}
