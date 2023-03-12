package com.my.cocktail.callpost.controller;

import com.my.cocktail.common.dto.SwaggerNote;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v2/callPost")
public class CallPostController2 {
//    private final ItemService itemService;

    @GetMapping("/")
    @ApiOperation(value = "모든 상품 목록 조회", notes = SwaggerNote.ITEM_READ_ALL_NOTE)
    public void getAllItems() {
        System.out.println("Hello, World!");
    }
}
