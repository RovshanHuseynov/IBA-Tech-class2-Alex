package lesson12.step.service;

import lesson12.step.Menu;

public class MainService {
  public String menuContent() {
    return new Menu().show();
  }
}
