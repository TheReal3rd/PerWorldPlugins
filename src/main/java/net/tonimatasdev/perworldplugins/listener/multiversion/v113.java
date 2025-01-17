package net.tonimatasdev.perworldplugins.listener.multiversion;

import net.tonimatasdev.perworldplugins.util.HandlerListUtil;
import net.tonimatasdev.perworldplugins.util.ListenerUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.*;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.event.player.PlayerRecipeDiscoverEvent;
import org.bukkit.event.player.PlayerRiptideEvent;

public class v113 implements Listener {
    public static void addHandlerList() {
        HandlerListUtil.minecraftHandlerLists.add(BlockCookEvent.getHandlerList());
        //HandlerListUtil.minecraftHandlerLists.add(BlockDispenseArmorEvent.getHandlerList()); Not have HandlerList
        HandlerListUtil.minecraftHandlerLists.add(BlockDropItemEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(BlockFertilizeEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(BlockShearEntityEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(FluidLevelChangeEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(MoistureChangeEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(SpongeAbsorbEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(BatToggleSleepEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(EntityDropItemEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(EntityPlaceEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(EntityPoseChangeEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(EntityToggleSwimEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(EntityTransformEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(PigZombieAngerEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(VillagerCareerChangeEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(PlayerCommandSendEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(PlayerRecipeDiscoverEvent.getHandlerList());
        HandlerListUtil.minecraftHandlerLists.add(PlayerRiptideEvent.getHandlerList());
        //HandlerListUtil.minecraftHandlerLists.add(ServerLoadEvent.getHandlerList()); Impossible to get World
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onCook(BlockCookEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onDispenseArmor(BlockDispenseArmorEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onDropItem(BlockDropItemEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onFertilize(BlockFertilizeEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onShearEntity(BlockShearEntityEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onFluidLevelChange(FluidLevelChangeEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onMoistureChange(MoistureChangeEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onSpongeAbsorb(SpongeAbsorbEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getBlock().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onBatToggleSleep(BatToggleSleepEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getEntity().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onDropItem(EntityDropItemEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getEntity().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onPlace(EntityPlaceEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getEntity().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onPoseChange(EntityPoseChangeEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getEntity().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onToggleSwim(EntityToggleSwimEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getEntity().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onTransform(EntityTransformEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getEntity().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onPigZombieAnger(PigZombieAngerEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getEntity().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onVillagerCareerChange(VillagerCareerChangeEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getEntity().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onCommandSend(PlayerCommandSendEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getPlayer().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onRecipeDiscover(PlayerRecipeDiscoverEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getPlayer().getWorld());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public static void onRiptide(PlayerRiptideEvent event) {
        ListenerUtils.perWorldPlugins(event, event.getPlayer().getWorld());
    }
}
