package com.example.demo.controller.api;

import com.example.demo.model.Board;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
public class BoardRestController {

    @Autowired
    BoardService service;

    @RequestMapping("/get/new")
    public Board getNew(){
        return service.getBoard();
    }


}
