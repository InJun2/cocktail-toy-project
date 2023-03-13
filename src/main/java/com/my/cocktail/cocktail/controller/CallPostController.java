//package com.my.cocktail.cocktail.controller;
//
//import com.my.cocktail.cocktail.model.dto.ItemCreateRequest;
//import com.my.cocktail.cocktail.model.dto.ItemResponse;
//import com.my.cocktail.cocktail.model.dto.ItemUpdateRequest;
//import com.my.cocktail.cocktail.service.ItemService;
//import com.my.cocktail.common.dto.PageDto;
//import com.my.cocktail.common.dto.ResponseDto;
//import com.my.cocktail.common.dto.SwaggerNote;
//import io.swagger.annotations.ApiOperation;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
////import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("api/v1/callPost")
//public class CallPostController {
//
//    private final ItemService itemService;
//
//    @GetMapping
//    @ApiOperation(value = "모든 상품 목록 조회", notes = SwaggerNote.ITEM_READ_ALL_NOTE)
//    public ResponseEntity<Page<ItemResponse>> getAllItems(
//            @PageableDefault(page = 0, size = 20) Pageable pageable
//    ) {
//        var items = itemService.getAllItems(pageable);
//        return PageDto.ok(items);
//    }
//
//    @GetMapping("/{id}")
//    @ApiOperation(value = "단건 상품 조회", notes = SwaggerNote.ITEM_READ_ONE_NOTE)
//    public ResponseEntity<ItemResponse> getItemById(@PathVariable("id") Long id) {
//        ItemResponse item = itemService.getItemById(id);
//        return ResponseDto.ok(item);
//    }
//
//    @PostMapping
//    @ApiOperation(value = "상품 등록 및 생성", notes = SwaggerNote.ITEM_CREATE_NOTE)
//    public ResponseEntity<ItemResponse> createItem(@RequestBody ItemCreateRequest request) {
//        ItemResponse item = itemService.createItem(request);
//        return ResponseDto.created(item);
//    }
//
//    @PatchMapping("/{id}")
//    public ResponseEntity<ItemResponse> updateItemById(
//            @PathVariable("id") Long id,
//            @RequestBody ItemUpdateRequest request
//    ) {
//        ItemResponse response = itemService.updateItemById(id, request);
//        return ResponseDto.ok(response);
//    }
//
//    @PatchMapping("/{id}/delete")
//    public ResponseEntity<Void> deleteItemById(@PathVariable("id") Long id) {
//        itemService.deleteItemById(id);
//        return ResponseDto.noContent();
//    }
//}
//package com.my.cocktail.cocktail.controller;
//
//import com.my.cocktail.cocktail.model.dto.ItemCreateRequest;
//import com.my.cocktail.cocktail.model.dto.ItemResponse;
//import com.my.cocktail.cocktail.model.dto.ItemUpdateRequest;
//import com.my.cocktail.cocktail.service.ItemService;
//import com.my.cocktail.common.dto.PageDto;
//import com.my.cocktail.common.dto.ResponseDto;
//import com.my.cocktail.common.dto.SwaggerNote;
//import io.swagger.annotations.ApiOperation;
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
////import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("api/v1/callPost")
//public class CallPostController {
//
//    private final ItemService itemService;
//
//    @GetMapping
//    @ApiOperation(value = "모든 상품 목록 조회", notes = SwaggerNote.ITEM_READ_ALL_NOTE)
//    public ResponseEntity<Page<ItemResponse>> getAllItems(
//            @PageableDefault(page = 0, size = 20) Pageable pageable
//    ) {
//        var items = itemService.getAllItems(pageable);
//        return PageDto.ok(items);
//    }
//
//    @GetMapping("/{id}")
//    @ApiOperation(value = "단건 상품 조회", notes = SwaggerNote.ITEM_READ_ONE_NOTE)
//    public ResponseEntity<ItemResponse> getItemById(@PathVariable("id") Long id) {
//        ItemResponse item = itemService.getItemById(id);
//        return ResponseDto.ok(item);
//    }
//
//    @PostMapping
//    @ApiOperation(value = "상품 등록 및 생성", notes = SwaggerNote.ITEM_CREATE_NOTE)
//    public ResponseEntity<ItemResponse> createItem(@RequestBody ItemCreateRequest request) {
//        ItemResponse item = itemService.createItem(request);
//        return ResponseDto.created(item);
//    }
//
//    @PatchMapping("/{id}")
//    public ResponseEntity<ItemResponse> updateItemById(
//            @PathVariable("id") Long id,
//            @RequestBody ItemUpdateRequest request
//    ) {
//        ItemResponse response = itemService.updateItemById(id, request);
//        return ResponseDto.ok(response);
//    }
//
//    @PatchMapping("/{id}/delete")
//    public ResponseEntity<Void> deleteItemById(@PathVariable("id") Long id) {
//        itemService.deleteItemById(id);
//        return ResponseDto.noContent();
//    }
//}
