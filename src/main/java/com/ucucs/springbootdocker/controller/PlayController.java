package com.ucucs.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayController {

  @GetMapping(value = "play")
  public String play() {
    return "hey, play with me!";
  }
}
