public class SkypeApp {
  public void updateSkype() {
    double p = Math.random();
    if (p < 0.5) System.out.println("Skype is up-to-date!");
    else System.out.println("Downloading and installing Skype updates from the server...");
  }
}