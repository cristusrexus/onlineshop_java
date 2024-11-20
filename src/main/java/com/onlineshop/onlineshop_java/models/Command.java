package com.onlineshop.onlineshop_java.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "commands")
@Data
public class Command {

    @Id
    private int id;
    @JsonFormat(pattern = "YYYY-MM-dd")
    private LocalDate date;

    private double total;

    @Column(columnDefinition = "text", nullable = false)
    private String details;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnoreProperties("commandsList")
    private User customer;

    @ManyToMany
    @JoinTable(name = "commands_items", joinColumns = @JoinColumn(name = "command_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "item_id", referencedColumnName = "id"))
    @JsonIgnoreProperties("commandList")
    List<Item> itemsList = new ArrayList<>();


    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;


}
