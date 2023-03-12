package com.my.cocktail.callpost.model.dto;

import com.my.cocktail.callpost.model.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
//import com.my.cocktail.callpost.model.vo.Category;
//import com.my.cocktail.callpost.model.vo.ItemState;


@Getter
@Builder
@AllArgsConstructor
public class ItemResponse {
    private Long id;
    private String name;
    private Long price;
//    private Category category;
    private Long memberId;
    private String description;
    private Integer auctionPeriod;
    private Long immediatelyPrice;
//    private ItemState state;


    public static ItemResponse of(Item item) {
        return ItemResponse.builder()
                .id(item.getId())
                .name(item.getName())
                .price(item.getPrice())
//                .category(item.getCategory())
                .memberId(item.getMemberId())
                .description(item.getDescription())
                .auctionPeriod(item.getAuctionPeriod())
                .immediatelyPrice(item.getImmediatelyPrice())
//                .state(item.getState())
                .build();
    }
}