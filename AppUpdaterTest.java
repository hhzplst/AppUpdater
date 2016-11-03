public class AppUpdaterTest {
  public static void main(String[] args) {
    AppUpdater myAppUpdater = new AppUpdater();

    SpotifyApp spotify = new SpotifyApp();
    ChromeApp chrome = new ChromeApp();
    SkypeApp skype = new SkypeApp();

    myAppUpdater.registerProgram(new ArrayList<Command> {{add(spotify::updateSpotify), add(chrome::updateChrome), add(skype::updateSkype)}});

    myAppUpdater.scheduledTimeIsUp();
  }
}