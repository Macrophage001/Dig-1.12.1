package macrophage.dig.util;

public class ModInfo {
    public static final String MODID   = "dig";
    public static final String NAME    = "Dig";
    public static final String VERSION = "1.1.11";

    public static final String SCRIPTS_FOLDER = ".\\dig";
    public static final String SCRIPT_EXT = ".ds";
    public static final String CONFIG_ALERTS_COMMENT = "If true, will display text indicating whether there are any drops available for the block you're digging [Default: false]";
    public static final String CONFIG_SCRIPTS_FOLDER_COMMENT = "Where the scripts for this mod will be stored";
    public static final String CONFIG_TOOL_BLACKLIST_COMMENT = "List of items that you would like to blacklist the mod from using [Format: modid:item_name]";
    public static final String CONFIG_ALLOW_HAND_DAMAGE_COMMENT = "If enabled, when the '~' modifier is placed before 'HAND', damage will be done to the player when the block breaks. [Default: true]";
    public static final String CONFIG_USE_HUNGER_COMMENT = "If enabled, will use hunger while the player digs through blocks [Default: true]";


    public class PROPER_TOOL {
        public static final String HAND = "HAND";
        public static final String PICKAXE = "PICKAXE";
        public static final String AXE = "AXE";
        public static final String SHOVEL = "SHOVEL";
        public static final String TOOL = "TOOL";
    }

    public class COMMANDS {
        public static final String LIST_RESOURCES = "res_list";
        public static final String RELOAD = "res_reload";

        public class USAGE {
            public static final String LIST_RESOURCES = "/res_list [all/drops/blocks] [registry_name]";
        }
    }

    public class PROXY {
        public static final String CLIENT = "macrophage.dig.proxy.ClientProxy";
        public static final String COMMON = "macrophage.dig.proxy.CommonProxy";
    }
}
