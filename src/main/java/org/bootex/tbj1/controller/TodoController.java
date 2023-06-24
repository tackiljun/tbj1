package org.bootex.tbj1.controller;

import org.codehaus.groovy.classgen.ReturnAdder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/todo/")
public class TodoController {

    // List.
    @GetMapping("list")
    public void list() {
        log.info("LIST!!!!!");
    }

    @GetMapping("add")
    public void add() {
        log.info("ADD!!!!!");
    }

    @GetMapping("read/{tno}")
    public String read(@PathVariable("tno") Long tno) {
        log.info("GET READ!!!!!");

        return "/todo/read";
    }

    @GetMapping("modify/{tno}")
    public String modify(@PathVariable("tno") Long tno) {
        log.info("GET MODIFY!!!!!");

        return "/todo/modify";
    }

    @PostMapping("add")
    public String addPost() {
        log.info("ADD POST!!!!!");

        return "redirect:/todo/list";
    }

    @PostMapping("remove")
    public String removePost() {
        log.info("REMOVE POST!!!!!");

        return "redirect:/todo/list";
    }

    @PostMapping("modify/{tno}")
    public String modifyPost(@PathVariable("tno") Long tno) {
        log.info("MODIFY POST!!!!!");

        return "redirect:/todo/read/" + tno;
    }

    
}
