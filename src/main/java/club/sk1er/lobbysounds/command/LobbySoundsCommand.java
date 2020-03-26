package club.sk1er.lobbysounds.command;

import club.sk1er.lobbysounds.LobbySounds;
import club.sk1er.mods.core.ModCore;
import java.util.Collections;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class LobbySoundsCommand extends CommandBase {

  @Override
  public String getCommandName() {
    return "lobbysounds";
  }

  @Override
  public String getCommandUsage(ICommandSender sender) {
    return "/lobbysounds";
  }

  @Override
  public void processCommand(ICommandSender sender, String[] args) {
    ModCore.getInstance().getGuiHandler().open(LobbySounds.instance.getSounds().gui());
  }

  @Override
  public int getRequiredPermissionLevel() {
    return -1;
  }

  @Override
  public List<String> getCommandAliases() {
    return Collections.singletonList("sounds");
  }
}
