public class ChromeApp {
  public void updateChrome() {
    double p = Math.random();
    if (p < 0.5) System.out.println("Chrome is up-to-date!");
    else System.out.println("Downloading and installing Chrome updates from the server...");
  }
}