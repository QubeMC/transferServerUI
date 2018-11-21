package transferServerUI;

import transferServerUI.Commands.Servers;
import transferServerUI.Events.WindowClickEvent;
import transferServerUI.Utils.CC;
import cn.nukkit.command.Command;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

  public static Main plugin;

  public static Main getInstance() {
    return plugin;
  }

  @Override
  public void onLoad() {
    plugin = this;
    this.getLogger().info(CC.chat("&2transferServerUI has been loaded!"));
  }

  @Override
  public void onEnable() {
    this.regConfig();
    this.regEvent();
    this.regCommands();
    this.getLogger().info(CC.chat("&atransferServerUI has been enabled!"));
  }

  @Override
  public void onDisable() {
    this.getLogger().info(CC.chat("&ctransferServerUI has been disabled!"));
  }

  public void regEvent() {
    // Register Events from another class.
    this.getServer().getPluginManager().registerEvents(new WindowClickEvent(), this);
  }

  public void regCommands() {
    // Register Commands from another class
    getServer().getCommandMap().register("servers", (Command) new Servers("servers"));
  }

  public void regConfig() { // INCASE YOU HAVE ALOT OF CONFIGS.
    this.saveDefaultConfig();
    this.saveConfig();
  }
}
