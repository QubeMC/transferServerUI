package transferServerUI.Utils;

import transferServerUI.Main;

public class API {

  private static Main plugin = Main.getInstance();
  
  public String nameOfMenu = plugin.getConfig().getString("NameOfMenu");
  public String textInTheBox = plugin.getConfig().getString("TextInTheBox");
  public String Button1 = plugin.getConfig().getString("TRUEButton1TEXT");
  public String Button2 = plugin.getConfig().getString("FALSEButton2TEXT");
  
  public String ip = plugin.getConfig().getString("IP");
  public int port = plugin.getConfig().getInt("PORT");
  //END OF VAR
  public String getNameOfMenu() {
    return nameOfMenu;
  }
  public String getTextInTheBox() {
    return textInTheBox;
  }
  public String getButton1() {
    return Button1;
  }
  public String getButton2() {
    return Button2;
  }
  public String getIp() {
    return ip;
  }
  public int getPort() {
    return port;
  }
}