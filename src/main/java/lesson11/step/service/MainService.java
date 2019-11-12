package lesson11.step.service;

import lesson11.step.Menu;

public class MainService {
  public String menuContent() {
    return new Menu().show();
  }
}
