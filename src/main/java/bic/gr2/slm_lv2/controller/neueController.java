package bic.gr2.slm_lv2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class neueController {
    @GetMapping
    public double calculateProgram(@RequestParam double relative){
        double minuitsMonth = 60 * 24 * 30;
        double getInitMonate = relative / 100;
        return minuitsMonth * getInitMonate;
    }
}
