import java.util.ArrayList;

public class AppUpdater {

  private static AppUpdater uniqueInstance = new AppUpdater();

  private ArrayList<Command> programList = new ArrayList<Command>();

  private AppUpdater() {}

  public static AppUpdater getInstance() {return uniqueInstance;}

  public void registerProgram(ArrayList<Command> programs) {programList = programs;}

  public void scheduledTimeIsUp() {
    for (Command program : programList)
      program.execute();
  }

}