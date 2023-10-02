package com.onurgundogdu.filterchainsecurity.repository;

import com.onurgundogdu.filterchainsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
