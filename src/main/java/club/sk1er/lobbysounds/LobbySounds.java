package club.sk1er.lobbysounds;

import club.sk1er.lobbysounds.command.LobbySoundsCommand;
import club.sk1er.lobbysounds.config.Sounds;
import club.sk1er.modcore.ModCoreInstaller;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "lobby_sounds", name = "Lobby Sounds", version = "1.3")
public class LobbySounds {

  private static final String COMPASS_NAME =
      EnumChatFormatting.GREEN + "Game Menu " + EnumChatFormatting.GRAY +
          "(Right Click)";
  private static final String COMPASS_LORE =
      EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.ITALIC.toString()
          + EnumChatFormatting.GRAY +
          "Right Click to bring up the Game Menu!";

  private boolean inHypixelLobby;
  private boolean onHypixel;

  private Sounds sounds;

  @Instance("lobby_sounds")
  public static LobbySounds instance;

  @Mod.EventHandler
  public void init(FMLInitializationEvent event) {
    ModCoreInstaller.initializeModCore(Minecraft.getMinecraft().mcDataDir);

    sounds = new Sounds();
    sounds.preload();

    ClientCommandHandler.instance.registerCommand(new LobbySoundsCommand());
    MinecraftForge.EVENT_BUS.register(this);
    runLobbyCheckerTimer();
  }

  @SubscribeEvent
  public void soundPlay(PlaySoundEvent event) {
    String soundName = event.name;

    if (onHypixel && inHypixelLobby) {
      if (soundName.startsWith("mob.slime") && Sounds.DISABLE_SLIME_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.startsWith("mob.enderdragon") && Sounds.DISABLE_DRAGON_SOUNDS) {
        setNullResult(event);
      }

      if ((soundName.startsWith("mob.wither") || soundName.startsWith("mob.skeleton"))
          && Sounds.DISABLE_WITHER_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.equals("random.orb") && Sounds.DISABLE_EXPERIENCE_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.equals("random.pop") && Sounds.DISABLE_ITEM_PICKUP_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.equals("game.tnt.primed") && Sounds.DISABLE_TNT_PRIME_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.equals("random.explode") && Sounds.DISABLE_EXPLOSION_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.equals("mob.chicken.plop") && Sounds.DISABLE_DELIVERY_MAN_SOUNDS) {
        setNullResult(event);
      }

      if ((soundName.startsWith("note.") || soundName.equals("random.click"))
          && Sounds.DISABLE_NOTE_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.startsWith("fireworks") && Sounds.DISABLE_FIREWORKS_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.equals("random.levelup") && Sounds.DISABLE_LEVELUP_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.startsWith("step.") && Sounds.DISABLE_STEP_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.startsWith("mob.bat") && Sounds.DISABLE_BAT_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.equals("fire.fire") && Sounds.DISABLE_FIRE_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.startsWith("mob.endermen") && Sounds.DISABLE_ENDERMEN_SOUNDS) {
        setNullResult(event);
      }

      if (soundName.startsWith("random.bow") && Sounds.DISABLE_ARROW_SOUNDS) {
        setNullResult(event);
      }
    }
  }

  private void setNullResult(PlaySoundEvent event) {
    event.result = null;
  }

  // lobby checker taken from LobbyGlow by biscut
  private void runLobbyCheckerTimer() {
    Minecraft mc = Minecraft.getMinecraft();
    new Timer().scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        checkForItem(mc);
        checkIp(mc);
      }
    }, 1000, 1000);
  }

  private void checkIp(Minecraft mc) {
    if (mc.getCurrentServerData() != null) {
      String ip = mc.getCurrentServerData().serverIP.toLowerCase();
      if (ip.equals("hypixel.net") || ip.endsWith(".hypixel.net") || ip.contains(".hypixel.net:")
          || ip.startsWith("hypixel.net:")) {
        onHypixel = true;
        return;
      }
    }

    onHypixel = false;
  }

  private void checkForItem(Minecraft mc) {
    if (mc != null && mc.thePlayer != null && mc.thePlayer.inventory != null) {
      ItemStack itemStack = mc.thePlayer.inventory.getStackInSlot(0);

      if (itemStack != null && itemStack.hasDisplayName() && itemStack.getDisplayName()
          .equals(COMPASS_NAME)) {
        List<String> tooltip = itemStack.getTooltip(mc.thePlayer, false);
        if (tooltip.get(1).equals(COMPASS_LORE)) {
          inHypixelLobby = true;
          return;
        }
      }
    }

    inHypixelLobby = false;
  }

  public Sounds getSounds() {
    return sounds;
  }
}
