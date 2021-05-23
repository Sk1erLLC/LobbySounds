package club.sk1er.lobbysounds.config;

import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.io.File;

public class Sounds extends Vigilant {

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Slime Sounds",
        description = "Remove sounds created by slimes.",
        category = "Sounds",
        subcategory = "Mobs"
    )
    public static boolean DISABLE_SLIME_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Dragon Sounds",
        description = "Remove sounds created by dragons.",
        category = "Sounds",
        subcategory = "Mobs"
    )
    public static boolean DISABLE_DRAGON_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Wither Sounds",
        description = "Remove sounds created by withers & wither skeletons.",
        category = "Sounds",
        subcategory = "Mobs"
    )
    public static boolean DISABLE_WITHER_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Item Pickup Sounds",
        description = "Remove sounds created by picking up an item.",
        category = "Sounds",
        subcategory = "Tile Entities"
    )
    public static boolean DISABLE_ITEM_PICKUP_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Experience Orb Sounds",
        description = "Remove sounds created by experience orbs.",
        category = "Sounds",
        subcategory = "Tile Entities"
    )
    public static boolean DISABLE_EXPERIENCE_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Primed TNT Sounds",
        description = "Remove sounds created by primed TNT.",
        category = "Sounds",
        subcategory = "Blocks"
    )
    public static boolean DISABLE_TNT_PRIME_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Explosion Sounds",
        description = "Remove sounds created by explosions.",
        category = "Sounds",
        subcategory = "Blocks"
    )
    public static boolean DISABLE_EXPLOSION_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Delivery Man Sounds",
        description = "Remove sounds created by delivery man events.",
        category = "Sounds",
        subcategory = "Players"
    )
    public static boolean DISABLE_DELIVERY_MAN_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Mystery Box Sounds",
        description = "Remove sounds created by mystery boxes.",
        category = "Sounds",
        subcategory = "Players"
    )
    public static boolean DISABLE_NOTE_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Firework Sounds",
        description = "Remove sounds created by fireworks.",
        category = "Sounds",
        subcategory = "Tile Entities"
    )
    public static boolean DISABLE_FIREWORKS_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Levelup Sounds",
        description = "Remove sounds created by someone leveling up.",
        category = "Sounds",
        subcategory = "Players"
    )
    public static boolean DISABLE_LEVELUP_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Stepping Sounds",
        description = "Remove sounds created by stepping.",
        category = "Sounds",
        subcategory = "Players"
    )
    public static boolean DISABLE_STEP_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Arrow Sounds",
        description = "Remove sounds created by arrows.",
        category = "Sounds",
        subcategory = "Tile Entities"
    )
    public static boolean DISABLE_ARROW_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Bat Sounds",
        description = "Remove sounds created by bats.",
        category = "Sounds",
        subcategory = "Mobs"
    )
    public static boolean DISABLE_BAT_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Fire Sounds",
        description = "Remove sounds created by fire.",
        category = "Sounds",
        subcategory = "Blocks"
    )
    public static boolean DISABLE_FIRE_SOUNDS;

    @Property(
        type = PropertyType.SWITCH,
        name = "Disable Enderman Sounds",
        description = "Remove sounds created by endermen.",
        category = "Sounds",
        subcategory = "Mobs"
    )
    public static boolean DISABLE_ENDERMEN_SOUNDS;

    public Sounds() {
        super(new File("./config/lobbysounds.toml"));
        initialize();
    }
}
