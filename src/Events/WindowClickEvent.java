package Events;

import java.net.InetSocketAddress;
import Main.Main.Main.Main;
import Utils.API;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.window.FormWindowModal;

public class WindowClickEvent implements Listener {

  private static Main plugin = Main.getInstance();
  API api = new API();
  InetSocketAddress server1 = new InetSocketAddress(api.getIp(), api.getPort());

  public WindowClickEvent() {}

  @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = false) // DON'T FORGET THE
                                                                          // ANNOTATION
                                                                          // @EventHandler
  public void event(PlayerFormRespondedEvent event) {
    if (event.getWindow() instanceof FormWindowModal) {
      FormWindowModal gui = (FormWindowModal) event.getWindow();
      String answer = gui.getResponse().getClickedButtonText();

      if (answer.contains(api.getButton1())) {
        event.getPlayer().transfer(server1);
      }
    }
  }
}
