package com.org.ssa.service;

import com.org.ssa.model.Banking;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BankingService {
    public void createBanking(Banking banking);

    public List<Banking> getAll();

    public String updateAddressBasedOnName(String name);

    public String deleteByName(String name);

    public String deleteByBranch(String branch);

    public String updateAddressBasedOnBranch(String branch);
}






