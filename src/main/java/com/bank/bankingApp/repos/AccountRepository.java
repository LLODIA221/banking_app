package com.bank.bankingApp.repos;

import com.bank.bankingApp.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
