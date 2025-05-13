package com.menglang.spring_webflux.controllers;

import com.menglang.spring_webflux.dtos.MultiplyRequestDTO;
import com.menglang.spring_webflux.dtos.response.ResponseDTO;
import com.menglang.spring_webflux.services.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

//    @GetMapping(value = "table/{input}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public Flux<ResponseDTO> table(@PathVariable int input){
//        return productService.getProduct();
//    }

}
