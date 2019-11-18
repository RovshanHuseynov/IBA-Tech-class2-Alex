package lesson11.step.controller;

import lesson11.step.console.Console;
import lesson11.step.service.MainService;

public class MainController {

  private final Console console;
  private final MainService mainService;

  public MainController(Console console) {
    this.console = console;
    this.mainService = new MainService();
  }

  public String help() {
    return mainService.menuContent();
  }
}
