package lesson11.step;

import lesson11.step.console.Console;
import lesson11.step.console.SystemConsole;

public class Application {
  public static void main(String[] args) {
    Console console = new SystemConsole();
    Database database = new Database();
    Core app = new Core(console, database);
    app.run();
  }
}
