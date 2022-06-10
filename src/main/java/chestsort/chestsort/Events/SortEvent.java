package chestsort.chestsort.Events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEvent;

public class SortEvent implements Listener {

    @EventHandler
    public void onLeftClick(PlayerBucketEvent event) {
        Player p = event.getPlayer();
        Block b = event.getBlockClicked();

        p.sendMessage("클릭한 블록 :>> {}" ,b.toString());

    }


}