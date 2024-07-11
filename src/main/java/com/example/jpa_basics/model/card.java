package com.example.jpa_basics.model;

import com.example.jpa_basics.common.Status;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardno;
   private Date expiry;
    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn
    private user u;
    public card()
    {}

    public card(int cardno, Date expiry, Status status, user u) {
        this.cardno = cardno;
        this.expiry = expiry;
        this.status = status;
        this.u = u;
    }

    public int getCardno() {
        return cardno;
    }

    public void setCardno(int cardno) {
        this.cardno = cardno;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public user getU() {
        return u;
    }

    public void setU(user u) {
        this.u = u;
    }
}
