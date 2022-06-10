package chestsort.chestsort.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PlayerEntity {
    private static List<UUID> PlayerLsit = new ArrayList<>();

    public static List<UUID> getPlayerLsit() {
        return PlayerLsit;
    }

    public static void setPlayerLsit(List<UUID> playerLsit) {
        PlayerLsit = playerLsit;
    }
}
