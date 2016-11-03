public class SpotifyApp {
  public void updateSpotify() {
    double p = Math.random();
    if (p < 0.5) System.out.println("Spotify is up-to-date!");
    else System.out.println("Downloading and installing updates from the server...");
  }
}