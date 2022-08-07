package me.xpyex.plugin.flywithfood.bukkit.implementations.energys;

import me.xpyex.plugin.flywithfood.bukkit.FlyWithFood;
import me.xpyex.plugin.flywithfood.common.implementations.FWFUser;
import me.xpyex.plugin.flywithfood.common.implementations.flyenergy.energys.ExpPointEnergy;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BukkitExpPoint extends ExpPointEnergy {
    @Override
    public void cost(@NotNull FWFUser user, @NotNull Number value) {
        if (value.intValue() == 0) {
            return;
        }
        Player target = user.getPlayer();
        if (target.getTotalExperience() <= 0) {
            return;
        }
        if (target.getTotalExperience() - value.intValue() > 0) {
            Bukkit.getScheduler().runTask(FlyWithFood.INSTANCE, () -> {
                target.setTotalExperience(target.getTotalExperience() - value.intValue());
            });
        }
    }

    @Override
    public @NotNull Integer getNow(FWFUser user) {
        Player target = user.getPlayer();
        return target.getTotalExperience();
    }
}
