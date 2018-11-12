package Commands;

import Main.Main.Main.Main;
import Utils.API;
import Utils.CC;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.form.window.FormWindowModal;
import cn.nukkit.scheduler.NukkitRunnable;

public class Servers extends Command {

  private static Main plugin = Main.getInstance();

  // CONFIG
  API api = new API();

  public Servers(String name) {
    super(name);
    this.setAliases(new String[] {"transfer"}); //
  }

  @Override
  public boolean execute(CommandSender sender, String label, String[] args) {
    Player p = (Player) sender;

    if (args.length == 0) {
      sendwindow(p);
    } else {
      if (args.length >= 1) {
        p.sendMessage(CC.chat("&cUsage: /servers OR /transfer"));
      }
    }
    return true;
  }

  public void sendwindow(Player p) { // SENDS THE PLAYER THE WINDOW.
    new NukkitRunnable() {
      @Override
      public void run() {
        FormWindowModal window = new FormWindowModal(CC.chat(api.getNameOfMenu()), CC.chat(api.getTextInTheBox()),
            CC.chat(api.getButton1()), CC.chat(api.getButton2()));
        p.showFormWindow(window);
      }
    }.run();
  }
}
