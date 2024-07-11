package com.example.jpa_basics.service;

import com.example.jpa_basics.Repository.cardRepository;
import com.example.jpa_basics.model.card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cardService {
@Autowired
cardRepository cr;
public String addcard(card c)
{
    cr.save(c);
    return "card added";
}
}
