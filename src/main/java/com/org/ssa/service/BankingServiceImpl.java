package com.org.ssa.service;

import com.org.ssa.model.Banking;
import com.org.ssa.repository.BankingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BankingServiceImpl implements BankingService {

    @Autowired
    BankingRepo bankingRepo;

    @Override
    public void createBanking(Banking banking) {
         bankingRepo.save(banking);


    }

    @Override
    public List<Banking> getAll() {
        List<Banking> ma =bankingRepo.findAll();
        return ma;
    }

    @Override



    public String updateAddressBasedOnName(String name) {
       List<Banking> list =bankingRepo.findByName(name);

        for(int i=0;i<list.size();i++){
            Banking bank=list.get(i);
            bank.setAddress("mumbai");
            bankingRepo.save(bank);
        }

        return null;
    }

    @Override
    public String deleteByName(String name) {
        bankingRepo.deleteByName(name);
        return "success";
    }

    @Override
    public String deleteByBranch(String branch) {
        bankingRepo.deleteByBranch(branch);
        return "null";
    }

    @Override
    public String updateAddressBasedOnBranch(String branch) {
        List<Banking> list=bankingRepo.findByBranch(branch);
        for(int i=0;i<list.size();i++) {
            Banking banking1 = list.get(i);
            banking1.setAddress("mumbai");
            bankingRepo.save(banking1);
        }
            return "null";

    }


}









