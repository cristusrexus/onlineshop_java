package com.onlineshop.onlineshop_java.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="items")
@Data
public class Item {

    @Id
    @GeneratedValue()
    private int id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition ="text")
    private String description;

    @Column(nullable = false)
    private double price;
    @Column(columnDefinition ="text")
    private String image1;
    @Column(columnDefinition = "text")
    private String image2;
    @Column(columnDefinition = "text")
    private String image3;
    @Column(columnDefinition = "text")
    private String image4;

    @Enumerated(value=EnumType.STRING)
    private ItemType itemType;

    @ManyToMany(mappedBy = "itemsList")
    @JsonIgnoreProperties("itemsList")
    private List<Command> commandList;

}
