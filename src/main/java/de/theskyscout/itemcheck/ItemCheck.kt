package de.theskyscout.itemcheck

import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.enchantments.EnchantmentTarget
import org.bukkit.inventory.ItemStack
import org.bukkit.material.SpawnEgg

class ItemCheck constructor(itemStack: ItemStack) {
    val itemStack = itemStack
    val unobtainable = listOf(Material.COMMAND_BLOCK, Material.END_PORTAL_FRAME, Material.BEDROCK, Material.STRUCTURE_BLOCK, Material.STRUCTURE_VOID, Material.END_GATEWAY, Material.PLAYER_HEAD, Material.PLAYER_WALL_HEAD, Material.PETRIFIED_OAK_SLAB, Material.SPAWNER, Material.FARMLAND, Material.NETHER_PORTAL, Material.CHORUS_PLANT, Material.KNOWLEDGE_BOOK, Material.BEDROCK,
    Material.ALLAY_SPAWN_EGG, Material.AXOLOTL_SPAWN_EGG, Material.BAT_SPAWN_EGG, Material.BEE_SPAWN_EGG, Material.BLAZE_SPAWN_EGG, Material.CAT_SPAWN_EGG, Material.CAVE_SPIDER_SPAWN_EGG, Material.CHICKEN_SPAWN_EGG, Material.COD_SPAWN_EGG, Material.COW_SPAWN_EGG, Material.CREEPER_SPAWN_EGG, Material.DONKEY_SPAWN_EGG, Material.DROWNED_SPAWN_EGG ,Material.ELDER_GUARDIAN_SPAWN_EGG,
    Material.ENDERMAN_SPAWN_EGG, Material.ENDERMITE_SPAWN_EGG, Material.ENDER_DRAGON_SPAWN_EGG, Material.EVOKER_SPAWN_EGG, Material.FOX_SPAWN_EGG, Material.FROG_SPAWN_EGG, Material.GHAST_SPAWN_EGG, Material.GLOW_SQUID_SPAWN_EGG, Material.GOAT_SPAWN_EGG, Material.GOAT_SPAWN_EGG, Material.HOGLIN_SPAWN_EGG, Material.HORSE_SPAWN_EGG, Material.HUSK_SPAWN_EGG, Material.IRON_GOLEM_SPAWN_EGG, Material.LLAMA_SPAWN_EGG,
    Material.MAGMA_CUBE_SPAWN_EGG, Material.MULE_SPAWN_EGG, Material.MOOSHROOM_SPAWN_EGG, Material.OCELOT_SPAWN_EGG, Material.PANDA_SPAWN_EGG, Material.PARROT_SPAWN_EGG, Material.PHANTOM_SPAWN_EGG, Material.PIG_SPAWN_EGG, Material.PIGLIN_SPAWN_EGG, Material.PIGLIN_BRUTE_SPAWN_EGG, Material.PILLAGER_SPAWN_EGG, Material.POLAR_BEAR_SPAWN_EGG, Material.PUFFERFISH_SPAWN_EGG, Material.RABBIT_SPAWN_EGG, Material.RAVAGER_SPAWN_EGG, Material.SALMON_SPAWN_EGG, Material.SHEEP_SPAWN_EGG, Material.SHULKER_SPAWN_EGG, Material.SILVERFISH_SPAWN_EGG, Material.SKELETON_SPAWN_EGG,
    Material.SKELETON_HORSE_SPAWN_EGG, Material.SLIME_SPAWN_EGG, Material.SNOW_GOLEM_SPAWN_EGG, Material.SPIDER_SPAWN_EGG, Material.SQUID_SPAWN_EGG, Material.STRAY_SPAWN_EGG, Material.STRIDER_SPAWN_EGG, Material.TADPOLE_SPAWN_EGG, Material.TRADER_LLAMA_SPAWN_EGG, Material.TROPICAL_FISH_SPAWN_EGG, Material.TURTLE_SPAWN_EGG, Material.VEX_SPAWN_EGG, Material.VILLAGER_SPAWN_EGG, Material.VINDICATOR_SPAWN_EGG, Material.WANDERING_TRADER_SPAWN_EGG,
    Material.WARDEN_SPAWN_EGG, Material.WITCH_SPAWN_EGG, Material.WITHER_SPAWN_EGG, Material.WITHER_SKELETON_SPAWN_EGG, Material.WOLF_SPAWN_EGG, Material.ZOGLIN_SPAWN_EGG, Material.ZOMBIE_SPAWN_EGG, Material.ZOMBIE_HORSE_SPAWN_EGG, Material.ZOMBIE_VILLAGER_SPAWN_EGG, Material.ZOMBIFIED_PIGLIN_SPAWN_EGG,Material.PANDA_SPAWN_EGG, Material.CAT_SPAWN_EGG, Material.WANDERING_TRADER_SPAWN_EGG
        )
    val valuable = listOf(Material.IRON_BARS, Material.IRON_INGOT, Material.IRON_BLOCK, Material.GOLD_INGOT, Material.GOLD_BLOCK, Material.GOLDEN_APPLE, Material.DIAMOND, Material.DIAMOND_BLOCK, Material.EMERALD, Material.EMERALD_BLOCK, Material.NETHERITE_INGOT, Material.NETHERITE_BLOCK, Material.NETHERITE_SCRAP)

    fun isUnobtainable(): Boolean {
        if(unobtainable.contains(this.itemStack.type)) return true
        return false
    }

    fun isCraftable():Boolean {
        if(Bukkit.getServer().getRecipesFor(itemStack).isNotEmpty()) return true
        return false
    }

    fun isEnchantable():Boolean {
        if(EnchantmentTarget.ALL.includes(itemStack)) return true
        return false
    }

    fun isATool():Boolean {
        if(EnchantmentTarget.TOOL.includes(itemStack)) return true
        return false
    }
    fun isArmor():Boolean {
        if(EnchantmentTarget.ARMOR.includes(itemStack)) return true
        return false
    }
    fun isAWeapon():Boolean {
        if(EnchantmentTarget.WEAPON.includes(itemStack)) return true
        return false
    }
    fun isBreakable():Boolean {
        if(EnchantmentTarget.BREAKABLE.includes(itemStack)) return true
        return false
    }
    fun isAnBlock():Boolean {
        if(itemStack.type.isBlock) return true
        return false
    }
    fun isValuable():Boolean {
        if(valuable.contains(itemStack.type)) return true
        return false
    }
}