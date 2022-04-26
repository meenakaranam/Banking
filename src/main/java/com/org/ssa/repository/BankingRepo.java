package com.org.ssa.repository;

import com.org.ssa.model.Banking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository

public interface BankingRepo extends JpaRepository<Banking, Integer> {

@Transactional
List<Banking> findByName(String name);

 @Transactional
 String deleteByName(String name);

 @Transactional
 String deleteByBranch(String branch);
@Transactional
 List<Banking> findByBranch(String branch);




}
