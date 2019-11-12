package lesson11.step.controller;

import lesson11.step.service.MainService;

public class MainController {
  private final MainService mainService;

  public MainController() {
    this.mainService = new MainService();
  }

  public String help() {
    return mainService.menuContent();
  }
}
