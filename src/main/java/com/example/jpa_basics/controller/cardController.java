package com.example.jpa_basics.controller;

import com.example.jpa_basics.service.cardService;
import com.example.jpa_basics.model.card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class cardController {
  @Autowired
  cardService cs;
  @PostMapping("/add")
  public String addcard1(@RequestBody card c)
    {
      return cs.addcard(c);
  }
}
