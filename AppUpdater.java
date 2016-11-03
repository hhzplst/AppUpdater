public class AppUpdater {

  private static AppUpdater uniqueInstance = new AppUpdater();

  private AppUpdater() {}

  public static AppUpdater getInstance() {return uniqueInstance;}

}