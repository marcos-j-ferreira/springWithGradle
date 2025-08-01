package com.marcos.springwithgradle.controller;

// configuração para rotas e métodos
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// configuração para respostas.
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;

// DTO
import com.marcos.springwithgradle.dto.response.World;
import com.marcos.springwithgradle.dto.response.Status;

//Array
import java.util.ArrayList;

//Time
import java.time.LocalTime;

@RestController
@RequestMapping("/api/vi")

public class Controller {


    @GetMapping
    public ResponseEntity<World> status(){

        int c = 0;

        ArrayList<Object> arr = new ArrayList<>();

        arr.add(new Status(LocalTime.now(), c++));

        World world = new World("Rodando",arr);

        return ResponseEntity
                .status(200)
                .header("content-Type", "application/json")
                .body(world);

    }
}
