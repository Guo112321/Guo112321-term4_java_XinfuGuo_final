package com.xg.Xinfu_Guo_ITE5435_FinalExam.controller;

import com.xg.Xinfu_Guo_ITE5435_FinalExam.model.Reservation;
import com.xg.Xinfu_Guo_ITE5435_FinalExam.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ReservationFormController {

    @Autowired
    private ReservationService service;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation_form";
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute Reservation reservation, Model model) {
        service.create(reservation);
        model.addAttribute("firstName", reservation.getFirstName());
        return "form_success";
    }
}
