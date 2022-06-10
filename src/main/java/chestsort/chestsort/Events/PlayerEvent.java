package chestsort.chestsort.Events;

import chestsort.chestsort.Entity.PlayerEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerEvent implements Listener {


    @EventHandler
    public void setJoinPlayer(PlayerJoinEvent event) {
        Player p = event.getPlayer();

        if(!(PlayerEntity.getPlayerLsit().contains(p.getUniqueId()))) {
            PlayerEntity.getPlayerLsit().add(p.getUniqueId());
        }


    }

}
