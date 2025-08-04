package com.marcos.springwithgradle.controller;

// configuração para rotas e métodos
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


//metodos
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// configuração para respostas.
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;

// DTO response
import com.marcos.springwithgradle.dto.response.World;
import com.marcos.springwithgradle.dto.response.Status;

// DTO request
import com.marcos.springwithgradle.dto.request.FilmeDTO;


import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

//import jakarta.validation.BindingResult;
//import jakarta.validation.
// import javax.validation.Valid;


//Array
import java.util.ArrayList;

//Time
import java.time.LocalTime;

@RestController
@RequestMapping("/api/vi")

public class Controller {

    private int count = 0;

    @GetMapping
    public ResponseEntity<World> status(){

        ArrayList<Object> arr = new ArrayList<>();

        arr.add(new Status(LocalTime.now(), count++));

        World world = new World("Rodando",arr);

        return ResponseEntity
                .status(200)
                .header("Content-Type", "application/json")
                .body(world);

    }


    @PostMapping
    public ResponseEntity<?> valid(@RequestBody @Valid FilmeDTO filmes, BindingResult result){

        if(result.hasErrors()){
            return ResponseEntity.badRequest().body(result.getAllErrors());
        }

        LocalTime time = LocalTime.now();

        return ResponseEntity
                .status(200)
                .header("Content-Type", "application/json")
                .body("{\"Status\":\"Adicionado com sucesso\", \"info\":[ \"Time\": \""+time+"\", \"Nome\":\"Marcos\", \"Requisições\":[\"id\":\"854123\", \"id\":\"12783129\" ] ]}");
    }


}
