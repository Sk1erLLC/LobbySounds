package club.sk1er.lobbysounds.config;

import club.sk1er.lobbysounds.LobbySounds;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;

import java.io.IOException;

public class Sounds {

    public static boolean DISABLE_SLIME_SOUNDS;
    public static boolean DISABLE_DRAGON_SOUNDS;
    public static boolean DISABLE_WITHER_SOUNDS;
    public static boolean DISABLE_ITEM_PICKUP_SOUNDS;
    public static boolean DISABLE_EXPERIENCE_SOUNDS;
    public static boolean DISABLE_TNT_PRIME_SOUNDS;
    public static boolean DISABLE_EXPLOSION_SOUNDS;
    public static boolean DISABLE_DELIVERY_MAN_SOUNDS;
    public static boolean DISABLE_MYSTERY_BOX_NOTES;
    public static boolean DISABLE_FIREWORKS_SOUNDS;
    public static boolean DISABLE_LEVELUP_SOUNDS;
    public static boolean DISABLE_STEP_SOUNDS;
    public static boolean DISABLE_ARROW_SOUNDS;
    public static boolean DISABLE_BAT_SOUNDS;

    public static void loadConfig() {
        try {
            JsonObject object = new JsonParser().parse(FileUtils.readFileToString(LobbySounds.instance.getConfigFile())).getAsJsonObject();
            if (object.has("disableSlimeSounds")) DISABLE_SLIME_SOUNDS = object.get("disableSlimeSounds").getAsBoolean();
            if (object.has("disableDragonSounds")) DISABLE_DRAGON_SOUNDS = object.get("disableDragonSounds").getAsBoolean();
            if (object.has("disableWitherSounds")) DISABLE_WITHER_SOUNDS = object.get("disableWitherSounds").getAsBoolean();
            if (object.has("disableItemPickupSounds")) DISABLE_ITEM_PICKUP_SOUNDS = object.get("disableItemPickupSounds").getAsBoolean();
            if (object.has("disableExperienceSounds")) DISABLE_EXPERIENCE_SOUNDS = object.get("disableExperienceSounds").getAsBoolean();
            if (object.has("disableTntPrimeSounds")) DISABLE_TNT_PRIME_SOUNDS = object.get("disableTntPrimeSounds").getAsBoolean();
            if (object.has("disableExplosionSounds")) DISABLE_EXPLOSION_SOUNDS = object.get("disableExplosionSounds").getAsBoolean();
            if (object.has("disableDeliveryManSounds")) DISABLE_DELIVERY_MAN_SOUNDS = object.get("disableDeliveryManSounds").getAsBoolean();
            if (object.has("disableMysteryBoxNotes")) DISABLE_MYSTERY_BOX_NOTES = object.get("disableMysteryBoxNotes").getAsBoolean();
            if (object.has("disableFireworksSounds")) DISABLE_FIREWORKS_SOUNDS = object.get("disableFireworksSounds").getAsBoolean();
            if (object.has("disableLevelupSounds")) DISABLE_LEVELUP_SOUNDS = object.get("disableLevelupSounds").getAsBoolean();
            if (object.has("disableStepSounds")) DISABLE_STEP_SOUNDS = object.get("disableStepSounds").getAsBoolean();
            if (object.has("disableArrowSounds")) DISABLE_ARROW_SOUNDS = object.get("disableArrowSounds").getAsBoolean();
            if (object.has("disableBatSounds")) DISABLE_BAT_SOUNDS = object.get("disableBatSounds").getAsBoolean();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveConfig() {
        try {
            JsonObject object = new JsonObject();
            object.addProperty("disableSlimeSounds", DISABLE_SLIME_SOUNDS);
            object.addProperty("disableDragonSounds", DISABLE_DRAGON_SOUNDS);
            object.addProperty("disableWitherSounds", DISABLE_WITHER_SOUNDS);
            object.addProperty("disableItemPickupSounds", DISABLE_ITEM_PICKUP_SOUNDS);
            object.addProperty("disableExperienceSounds", DISABLE_EXPERIENCE_SOUNDS);
            object.addProperty("disableTntPrimeSounds", DISABLE_TNT_PRIME_SOUNDS);
            object.addProperty("disableExplosionSounds", DISABLE_EXPLOSION_SOUNDS);
            object.addProperty("disableDeliveryManSounds", DISABLE_DELIVERY_MAN_SOUNDS);
            object.addProperty("disableMysteryBoxNotes", DISABLE_MYSTERY_BOX_NOTES);
            object.addProperty("disableFireworksSounds", DISABLE_FIREWORKS_SOUNDS);
            object.addProperty("disableLevelupSounds", DISABLE_LEVELUP_SOUNDS);
            object.addProperty("disableStepSounds", DISABLE_STEP_SOUNDS);
            object.addProperty("disableArrowSounds", DISABLE_ARROW_SOUNDS);
            object.addProperty("disableBatSounds", DISABLE_BAT_SOUNDS);
            FileUtils.writeStringToFile(LobbySounds.instance.getConfigFile(), object.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
