package com.testing.main.repository;

/*import org.springframework.stereotype.Repository;*/

import com.testing.main.model.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
