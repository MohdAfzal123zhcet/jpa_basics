package com.example.jpa_basics.Repository;

import com.example.jpa_basics.model.card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface cardRepository extends JpaRepository<card,Integer>
    {

    }

