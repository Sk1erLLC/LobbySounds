package club.sk1er.lobbysounds.gui.helper;

import net.minecraft.util.EnumChatFormatting;

public interface ScreenHelper {
    default String getSuffix(boolean option, String label) {
        // if sound is disabled, show as red, otherwise show as green
        return option ? EnumChatFormatting.RED + label : EnumChatFormatting.GREEN + label;
    }

    default int getRowPos(int rowNumber) {
        return 55 + rowNumber * 23;
    }
}
