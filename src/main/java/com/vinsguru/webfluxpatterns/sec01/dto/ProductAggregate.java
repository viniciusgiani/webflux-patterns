package com.vinsguru.webfluxpatterns.sec01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class ProductAggregate {

    private Integer id;
    private String category;
    private String description;
    private Price price;
    private List<Review> reviews;

}
