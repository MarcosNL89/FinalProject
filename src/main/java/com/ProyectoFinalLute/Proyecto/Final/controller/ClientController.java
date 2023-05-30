package com.ProyectoFinalLute.Proyecto.Final.controller;

import com.ProyectoFinalLute.Proyecto.Final.middleware.ResponseHandler;
import com.ProyectoFinalLute.Proyecto.Final.model.Client;
import com.ProyectoFinalLute.Proyecto.Final.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/client")

public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Object> postClient(@RequestBody Client client) {
        try {
            System.out.println(client);
            Client clientSaved = clientService.postClient(client);
            return ResponseHandler.generateResponse(
                    "Client saved successfully",
                    HttpStatus.OK,
                    clientSaved
            );
        } catch (Exception e) {
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }

    @GetMapping (path = "{id}")

    public ResponseEntity<Object> getClient(@PathVariable int id ){
            try{
                System.out.println(id);
                Client clientFound = clientService.getClient(id);
                return ResponseHandler.generateResponse(
                        "Client stored successfully",
                        HttpStatus.OK,
                        clientFound

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


