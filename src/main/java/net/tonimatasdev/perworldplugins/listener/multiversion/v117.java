package net.tonimatasdev.perworldplugins.listener.multiversion;

import net.tonimatasdev.perworldplugins.util.HandlerListUtil;
import net.tonimatasdev.perworldplugins.util.ListenerUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockReceiveGameEvent;
import org.bukkit.event.inventory.FurnaceStartSmeltEvent;
import org.bukkit.event.world.EntitiesLoadEvent;
import org.bukkit.event.world.EntitiesUnloadEvent;
import org.bukkit.event.world.GenericGameEvent;

public class v117 implements Listener {
    public static void addHandlerList() {
        HandlerListUtil.minecraftHandlerLists.add(BlockReceiveGameEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(FurnaceStartSmeltEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(EntitiesLoadEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(EntitiesUnloadEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(GenericGameEvent.getHandlerList());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onReceiveGame(BlockReceiveGameEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onFurnaceStartSmelt(FurnaceStartSmeltEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onEntitiesLoad(EntitiesLoadEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onEntitiesUnload(EntitiesUnloadEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onGenericGame(GenericGameEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getWorld());
    }
}
