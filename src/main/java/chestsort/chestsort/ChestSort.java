package chestsort.chestsort;

import chestsort.chestsort.Events.PlayerEvent;
import chestsort.chestsort.Events.SortEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ChestSort extends JavaPlugin {

    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onEnable() {
        // Plugin startup logic
        logger.info("시작");
        SortEvent sortEvent = new SortEvent();
        PlayerEvent playerEvent = new PlayerEvent();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("종료");
    }
}
