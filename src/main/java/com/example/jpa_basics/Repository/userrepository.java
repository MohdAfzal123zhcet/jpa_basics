package com.example.jpa_basics.Repository;

import com.example.jpa_basics.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userrepository extends JpaRepository<user,Integer> {

}