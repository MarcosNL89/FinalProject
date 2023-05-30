package com.ProyectoFinalLute.Proyecto.Final.controller;

import com.ProyectoFinalLute.Proyecto.Final.middleware.ResponseHandler;
import com.ProyectoFinalLute.Proyecto.Final.model.Product;
import com.ProyectoFinalLute.Proyecto.Final.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Object> postProduct(@RequestBody Product product) {
        try {
            System.out.println(product);
            Product productSaved = productService.postProduct(product);
            return ResponseHandler.generateResponse(
                    "Product stored successfully",
                    HttpStatus.OK,
                    productSaved
            );
        } catch (Exception e) {
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }
        @GetMapping(path = "{id}")
        public ResponseEntity<Object> getProduct(@PathVariable int id){
            try{
                System.out.println(id);
                Product productFound = productService.getProduct(id);
                return ResponseHandler.generateResponse(
                        "Product stored successfully",
                        HttpStatus.OK,
                        productFound

                );

            }catch(Exception e){
                return ResponseHandler.generateResponse(
                        e.getMessage(),
                        HttpStatus.INTERNAL_SERVER_ERROR,
                        null
                );
            }
        }
    }

