package me.zwrumpy.chocohills.register;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
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
    //public static final ItemGroup CH_GROUP = new ItemGroup(new NamespacedKey(ChocoHills.getInstance(), "CH_GROUP"), new CustomItemStack(Material.SUNFLOWER, "&e&l虫火谷工艺"));

    static SubItemGroup subGroup( String namespaceKey, String name, Material icon){
        return new SubItemGroup(new NamespacedKey(ChocoHills.getInstance(), namespaceKey), CH_GENERAL,new CustomItemStack(icon, name));
    }
    public static final SlimefunItemStack BLASTXEL = new SlimefunItemStack(
            "BLASTXEL",
            Material.NETHERITE_PICKAXE,
            "&7&l火谷之镐 &a1x",
            "&7用于:",
            "&f高速破坏方块",
            "",
            "&7技能:",
            "&f雷管: 3x1x3"
    );

    public static final SlimefunItemStack BLASTXEL_2 = new SlimefunItemStack(
            "BLASTXEL_2",
            Material.NETHERITE_PICKAXE,
            "&7&l火谷之镐 &b3x",
            "&7用于:",
            "&f高速破坏方块",
            "",
            "&7技能:",
            "&f雷管: 3x3x3"
    );

    public static final SlimefunItemStack BLASTXEL_3 = new SlimefunItemStack(
            "BLASTXEL_3",
            Material.NETHERITE_PICKAXE,
            "&7&l火谷之镐 &46x",
            "&7用于:",
            "&f高速破坏方块",
            "",
            "&7技能:",
            "&f雷管: 3x6x3"
    );

    public static final SlimefunItemStack CHOCO_CARBON = new SlimefunItemStack(
            "CHOCO_CARBON",
            Material.BASALT,
            "&e&l火谷碳",
            "&f隐蔽于火谷中的碳",
            ""
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

    public static final SlimefunItemStack AYANSHARD = new SlimefunItemStack(
            "AYANSHARD",
            Material.AMETHYST_SHARD,
            "&e&l火谷碎片",  ""
    );

    public static final SlimefunItemStack GHOSTINGGOO = new SlimefunItemStack(
            "GHOSTINGGOO",
            Material.MAGENTA_DYE,
            "&e&l鬼之粘液",
            "&f一只被困在粘液里的鬼",
            "&f却从未挣脱过"
    );

    public static final SlimefunItemStack CHOCO_INGOT = new SlimefunItemStack(
            "CHOCO_INGOT",
            Material.GOLD_INGOT,
            "&e&l虫火谷锭",  ""
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
            " &f下: 原版容器: &6输入"
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

    public static final SlimefunItemStack EGGPENSIVE = new SlimefunItemStack(
            "EGGPENSIVE",
            Material.EGG,
            "&f火谷蛋",
            ""
    );

    public static final SlimefunItemStack EGG_COOKER = new SlimefunItemStack(
            "EGG_COOKER",
            Material.SMOKER,
            "&e烹蛋机",
            "&7用于",
            "&f将洞穴蛋",
            "&f转化为火谷蛋",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(20)
    );

    public static final SlimefunItemStack MENARDZ_SMOKER = new SlimefunItemStack(
            "MENARDZ_SMOKER",
            Material.CAMPFIRE,
            "&e梅纳兹烟熏机",
            "&7",
            "&7用于:",
            "&7烟熏物品"

    );

    public static final SlimefunItemStack TINAPANG_ITLOG = new SlimefunItemStack(
            "TINAPANG_ITLOG",
            Material.EGG,
            "&f洞穴蛋",
            ""
    );


    public static final SlimefunItemStack ARFWOOFERITE = new SlimefunItemStack(
            "ARFWOOFERITE",
            Material.ANCIENT_DEBRIS,
            "&4&l下界合金生成器",
            "&7用于",
            "&f无限生产下界合金锭",
            "",
            "&7产量: &f1 &7下界合金锭",
            "&7速率: &f5 &7min",
            "&7搭建:",
            "&f在生成器上方放置一个箱子"
    );

    public static final SlimefunItemStack ARFBON = new SlimefunItemStack(
            "ARFBON",
            Material.BASALT,
            "&8&l煤炭生成器",
            "&7用于:",
            "&f无限生产煤炭",
            "&7产量: &f64 &7煤炭",
            "&7速率: &f30 &7s",
            " ",
            "&7搭建:",
            "&f在生成器上方放置一个箱子"
    );

    public static final SlimefunItemStack AYANCLUSTER = new SlimefunItemStack(
            "AYANCLUSTER",
            Material.AMETHYST_BLOCK,
            "&5&l紫水晶簇生成器",
            "&7用于:",
            "&f无限生产紫水晶簇",
            "&7产量: &f16 &7紫水晶簇",
            "&7速率: &f2 &7min",
            " ",
            "&7搭建:",
            "&f在生成器上方放置一个箱子"
    );

    public static final SlimefunItemStack DRTGOO = new SlimefunItemStack(
            "DRTGOO",
            Material.BUBBLE_CORAL_BLOCK,
            "&d&l奇怪的下界粘液生成器",
            "&7用于:",
            "&f无限生产奇怪的下界粘液",
            "&7产量: &f8 &7奇怪的下界粘液",
            "&7速率: &f3 &7min",
            " ",
            "&7搭建:",
            "&f在生成器上方放置一个箱子"
    );

    public static final SlimefunItemStack REMI_DIAS = new SlimefunItemStack(
            "REMI_DIAS",
            Material.DIAMOND_ORE,
            "&f钻石生成器",
            "&7用于:",
            "&f无限生产钻石",
            "&7产量: &f1 &7钻石",
            "&7速率: &f15 &7min",
            " ",
            "&7搭建:",
            "&f在生成器上方放置一个箱子"
    );
}
