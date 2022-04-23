package com.org.ssa.controller;

import com.org.ssa.model.Banking;
import com.org.ssa.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("/api")

public class BankingController {

    @Autowired
    BankingService bankingService;

    @PostMapping("/create")
    public void createBanking(@RequestBody Banking banking){
        bankingService.createBanking(banking);

    }
    @GetMapping("/getAll")
    public List<Banking> getAll(){
        List<Banking> ban =bankingService.getAll();
        return ban;


    }
    @PutMapping("/updateAddressBasedOnName/{name}")
    public String updateAddressBasedOnName(@PathVariable String name){
        String s=bankingService.updateAddressBasedOnName(name);
        return s;

    }
    @DeleteMapping("/deleteByName/{name}")
    public String deleteByName(@PathVariable String name){
      String ma  =bankingService.deleteByName(name);
      return ma;

    }
    @DeleteMapping("/deleteByBranch/{branch}")
    public String deleteByBranch(@PathVariable String branch ){
     String str   =bankingService.deleteByBranch(branch);
     return str;

    }

    @PutMapping("/updateAddressBasedOnBranch/{branch}")
    public String updateAddressBasedOnBranch(@PathVariable String branch){
         String st1 = bankingService.updateAddressBasedOnBranch(branch);
         return st1;
    }
}
