package me.zwrumpy.chocohills.register;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.zwrumpy.chocohills.ChocoHills;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class ChocoItems {

    private ChocoItems() {}

    public static final NestedItemGroup CH_GENERAL = new NestedItemGroup(new NamespacedKey(ChocoHills.getInstance(), "CH_GENERAL"), new CustomItemStack(Material.SUNFLOWER, "&b虫火谷工艺"));
    public static final SubItemGroup CH_RESOURCES = subGroup("CH_RESOURCES", "资源", Material.LARGE_AMETHYST_BUD);
    public static final SubItemGroup CH_TOOLS = subGroup("CH_TOOLS", "工具", Material.NETHERITE_PICKAXE);
    public static final SubItemGroup CH_GENERATOR = subGroup("CH_GENERATOR", "物品生成器", Material.ANCIENT_DEBRIS);
    public static final SubItemGroup CH_MACHINES = subGroup("CH_MACHINES", "机器", Material.HONEY_BLOCK);
    //public static final ItemGroup CH_GROUP = new ItemGroup(new NamespacedKey(ChocoHills.getInstance(), "CH_GROUP"), new CustomItemStack(Material.SUNFLOWER, "&e&lChocoHills"));

    static SubItemGroup subGroup( String namespaceKey, String name, Material icon){
        return new SubItemGroup(new NamespacedKey(ChocoHills.getInstance(), namespaceKey), CH_GENERAL,new CustomItemStack(icon, name));
    }
    public static final SlimefunItemStack BLASTXEL = new SlimefunItemStack(
            "BLASTXEL",
            Material.NETHERITE_PICKAXE,
            "&7&l火谷之镐 &aI",
            "&7用于:",
            "&f高速破坏方块",
            "",
            "&7技能:",
            "&f雷管: 3x1x3"
    );

    public static final SlimefunItemStack BLASTXEL_2 = new SlimefunItemStack(
            "BLASTXEL_2",
            Material.NETHERITE_PICKAXE,
            "&7&l火谷之镐 &b2",
            "&7用于:",
            "&f高速破坏方块",
            "",
            "&7技能:",
            "&f雷管: 3x2x3"
    );

    public static final SlimefunItemStack BLASTXEL_3 = new SlimefunItemStack(
            "BLASTXEL_3",
            Material.NETHERITE_PICKAXE,
            "&7&l火谷之镐 &43",
            "&7用于:",
            "&f高速破坏方块",
            "",
            "&7技能:",
            "&f雷管: 3x3x3"
    );

    public static final SlimefunItemStack CHOCO_CRYSTAL = new SlimefunItemStack(
            "CHOCO_CRYSTAL",
            Material.SMALL_AMETHYST_BUD,
            "&e&l虫火谷水晶",
            "&f基础虫火谷元素",
            ""
    );

    public static final SlimefunItemStack COMPRESSED_CRYSTAL = new SlimefunItemStack(
            "COMPRESSED_CRYSTAL",
            Material.MEDIUM_AMETHYST_BUD,
            "&e&l液压结晶",
            "&f高级虫火谷元素",
            ""
    );

    public static final SlimefunItemStack HYPER_CRYSTAL = new SlimefunItemStack(
            "HYPER_CRYSTAL",
            Material.LARGE_AMETHYST_BUD,
            "&e&l超晶体",
            "&f终极虫火谷元素",
            ""
    );

    public static final SlimefunItemStack CHOCO_CRYSTAL_X2 = new SlimefunItemStack(
            "CHOCO_CRYSTAL_X2",
            Material.AMETHYST_CLUSTER,
            "&e&l虫火谷水晶 &7X2",
            "&f双倍虫火谷元素",
            ""
    );

    public static final SlimefunItemStack ENERGIZED_CRYSTAL = new SlimefunItemStack(
            "ENERGIZED_CRYSTAL",
            Material.END_CRYSTAL,
            "&e&l增能晶体",
            "&f蕴含无穷能量",
            ""
    );

    public static final SlimefunItemStack CHOCO_INGOT = new SlimefunItemStack(
            "CHOCO_INGOT",
            Material.GOLD_INGOT,
            "&e&l虫火谷锭",  ""
    );

    public static final SlimefunItemStack ARFWOOFERITE = new SlimefunItemStack(
            "ARFWOOFERITE",
            Material.ANCIENT_DEBRIS,
            "&4&l下界合金生成器",
            "&7用于",
            "&f无限生产下界合金锭",
            "",
            "&7产量: &f1 &7下界合金锭",
            "&7世界: &f5 &7min"
    );

    public static final SlimefunItemStack KEIMAEXPORTER = new SlimefunItemStack(
            "KEIMAEXPORTER",
            Material.SLIME_BLOCK,
            "&a&l虫火谷SF物品输出接口 &8(&7上&8)",
            "&7用于",
            " &f将物品",
            " &7从&f粘液科技&7机器输出口",
            " &7转移至&f原版&7容器",
            "",
            "&a贴士",
            " &f上: 原版容器: &6输出",
            " &f中: 虫火谷SF物品输出接口: &7连接",
            " &f下: 粘液科技机器: &3输入"
    );

    public static final SlimefunItemStack KEIMAEXPORTER_DOWN = new SlimefunItemStack(
            "KEIMAEXPORTER_DOWN",
            Material.SLIME_BLOCK,
            "&a&l虫火谷SF物品输出接口 &8(&7下&8)",
            "&7用于",
            " &f将物品",
            " &7从&f粘液科技&7机器输出口",
            " &7转移至&f原版&7容器",
            "",
            "&a贴士",
            " &f上: 粘液科技机器: &3输入",
            " &f中: 虫火谷SF物品输出接口: &7连接",
            " &f下: 原版容器: &6输出"
    );


    public static final SlimefunItemStack KEIMAIMPORTER = new SlimefunItemStack(
            "KEIMAIMPORTER",
            Material.HONEY_BLOCK,
            "&6&l虫火谷原版物品输出接口 &8(&7下&8)",
            "&7用于",
            " &f将物品",
            " &7从&f原版&7容器",
            " &7转移至&f粘液科技&7机器输入口",
            "",
            "&a贴士",
            " &f上: 原版容器: &6输入",
            " &f中: 虫火谷SF物品输出接口: &7连接",
            " &f下: 粘液科技机器: &3输出"
    );

    public static final SlimefunItemStack KEIMAIMPORTER_UP = new SlimefunItemStack(
            "KEIMAIMPORTER_UP",
            Material.HONEY_BLOCK,
            "&6&l虫火谷原版物品输出接口 &8(&7上&8)",
            "&7用于",
            " &f将物品",
            " &7从&f原版&7容器",
            " &7转移至&f粘液科技&7机器输入口",
            "",
            "&a贴士",
            " &f上: 粘液科技机器: &3输出",
            " &f中: 虫火谷SF物品输出接口: &7连接",
            " &f下: 原版容器: &6输如"
    );

    public static final SlimefunItemStack ARFYTRANSPORTER_UP = new SlimefunItemStack(
            "ARFYTRANSPORTER_UP",
            Material.RED_STAINED_GLASS_PANE,
            "&f&l虫火谷单向口 &r&8(&7上&8)",
            "&7用于",
            " &f仅将物品向上转移至",
            " &f原版储存",
            "",
            "&a贴士",
            " &f上: 原版储存: &6输出",
            " &f中: 虫火谷单向: &7连接",
            " &f下: 原版储存: &3输入"
    );

    public static final SlimefunItemStack ARFYTRANSPORTER_DOWN = new SlimefunItemStack(
            "ARFYTRANSPORTER_DOWN",
            Material.BLACK_STAINED_GLASS_PANE,
            "&f&l虫火谷单向口 &r&8(&7下&8)",
            "&7用于",
            " &f仅将物品向下转移至",
            " &f原版储存",
            "",
            "&a贴士",
            " &f上: 原版储存: &6输入",
            " &f中: 虫火谷单向: &7连接",
            " &f下: 原版储存: &3输出"
    );

    public static final SlimefunItemStack TORCHTILLAS = new SlimefunItemStack(
            "TORCHTILLAS",
            Material.TORCH,
            "&6&l虫火谷火炬",
            "&7用于: ",
            "&f给予30min",
            "&f夜视",
            "",
            "&8左击空气",
            "&8激活"
    );

    public static final SlimefunItemStack JAIL_HAMMER = new SlimefunItemStack(
            "JAIL_HAMMER",
            Material.TORCH,
            "&4监狱锤",
            "&7用于: ",
            "&f使敌人在5s内",
            "&f无法动弹"
    );

    public static final SlimefunItemStack MULTONG_GHOST = new SlimefunItemStack(
            "MULTONG_GHOST",
            Material.TORCH,
            "&4木桐鬼",
            "&7用于: ",
            "&f使敌人在5s内",
            "&f无法动弹"
    );

    public static final SlimefunItemStack BAAM_BRUSH = new SlimefunItemStack(
            "BAAM_BRUSH ",
            Material.TORCH,
            "&4火谷刷",
            "&7用于: ",
            "&f使敌人在5s内",
            "&f无法交互"
    );

    public static final SlimefunItemStack BAAM_PLACEXEL = new SlimefunItemStack(
            "BAAM_PLACEXEL ",
            Material.TORCH,
            "&4裂谷刷",
            "&7用于: ",
            "&f使敌人在5s内",
            "&f无法交互"
    );

    public static final SlimefunItemStack BAAM_BOT = new SlimefunItemStack(
            "BAAM_BOT",
            Material.TORCH,
            "&4靶慕机器人",
            "&7用于: ",
            "&f在5s内",
            "&f摆放方块"
    );

    public static final SlimefunItemStack ATHENAS_KIMCHI = new SlimefunItemStack(
            "ATHENAS_KIMCHI",
            Material.TORCH,
            "&4雅典娜泡菜",
            "&7用于: ",
            "&f食用时",
            "&f给予5sBuff"
    );

    public static final SlimefunItemStack SHIRO_TRAP = new SlimefunItemStack(
            "SHIRO_TRAP",
            Material.FERN,
            "&4曼德拉草",
            "&7用于: ",
            "&f食用时",
            "&f给予5sBuff"
    );

    public static final SlimefunItemStack YANYAN_AXE = new SlimefunItemStack(
            "YANYAN_AXE",
            Material.DIAMOND_AXE,
            "&4燕燕斧",
            "&c+20%火谷效果"
    );

    public static final SlimefunItemStack SHIRODEX = new SlimefunItemStack(
            "SHIRODEX",
            Material.POTION,
            "&4拜克斯药",
            "&c+20%火谷效果"
    );

    public static final SlimefunItemStack SHIELDEAN = new SlimefunItemStack(
            "SHIELDEAN",
            Material.SHIELD,
            "&4虫火谷之盾",
            "&c+20%火谷效果"
    );

    public static final SlimefunItemStack AFKEIMA_SWORD = new SlimefunItemStack(
            "AFKEIMA_SWORD",
            Material.WOODEN_SWORD,
            "&4云穆之剑",
            "敌人会受到AFK伤害",
            "并且5s内无法移动"
    );
}
