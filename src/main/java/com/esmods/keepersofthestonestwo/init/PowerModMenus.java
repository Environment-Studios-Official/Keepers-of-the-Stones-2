
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.esmods.keepersofthestonestwo.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesWaterMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesVacuumMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesTornadoMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesTimeMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSunMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSpaceMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesSoundMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesShadowMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesRainMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesPlantsMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesOceanMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMoonMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesMetalMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesLightningMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesLightMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesLavaMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesIceMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesFireMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesEtherMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesEnergyMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesEarthMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesCrystalMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesCreationMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesAnimalsMenu;
import com.esmods.keepersofthestonestwo.world.inventory.WheelAbilitiesAirMenu;
import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart4Menu;
import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart3Menu;
import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart2Menu;
import com.esmods.keepersofthestonestwo.world.inventory.KeepersBoxGUIPart1Menu;
import com.esmods.keepersofthestonestwo.world.inventory.BatteryChargerGUIMenu;
import com.esmods.keepersofthestonestwo.PowerMod;

public class PowerModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PowerMod.MODID);
	public static final RegistryObject<MenuType<WheelAbilitiesFireMenu>> WHEEL_ABILITIES_FIRE = REGISTRY.register("wheel_abilities_fire", () -> IForgeMenuType.create(WheelAbilitiesFireMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesAirMenu>> WHEEL_ABILITIES_AIR = REGISTRY.register("wheel_abilities_air", () -> IForgeMenuType.create(WheelAbilitiesAirMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesWaterMenu>> WHEEL_ABILITIES_WATER = REGISTRY.register("wheel_abilities_water", () -> IForgeMenuType.create(WheelAbilitiesWaterMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesEarthMenu>> WHEEL_ABILITIES_EARTH = REGISTRY.register("wheel_abilities_earth", () -> IForgeMenuType.create(WheelAbilitiesEarthMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesEtherMenu>> WHEEL_ABILITIES_ETHER = REGISTRY.register("wheel_abilities_ether", () -> IForgeMenuType.create(WheelAbilitiesEtherMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesLightningMenu>> WHEEL_ABILITIES_LIGHTNING = REGISTRY.register("wheel_abilities_lightning", () -> IForgeMenuType.create(WheelAbilitiesLightningMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesSoundMenu>> WHEEL_ABILITIES_SOUND = REGISTRY.register("wheel_abilities_sound", () -> IForgeMenuType.create(WheelAbilitiesSoundMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesCrystalMenu>> WHEEL_ABILITIES_CRYSTAL = REGISTRY.register("wheel_abilities_crystal", () -> IForgeMenuType.create(WheelAbilitiesCrystalMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesLavaMenu>> WHEEL_ABILITIES_LAVA = REGISTRY.register("wheel_abilities_lava", () -> IForgeMenuType.create(WheelAbilitiesLavaMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesIceMenu>> WHEEL_ABILITIES_ICE = REGISTRY.register("wheel_abilities_ice", () -> IForgeMenuType.create(WheelAbilitiesIceMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesRainMenu>> WHEEL_ABILITIES_RAIN = REGISTRY.register("wheel_abilities_rain", () -> IForgeMenuType.create(WheelAbilitiesRainMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesTornadoMenu>> WHEEL_ABILITIES_TORNADO = REGISTRY.register("wheel_abilities_tornado", () -> IForgeMenuType.create(WheelAbilitiesTornadoMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesOceanMenu>> WHEEL_ABILITIES_OCEAN = REGISTRY.register("wheel_abilities_ocean", () -> IForgeMenuType.create(WheelAbilitiesOceanMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesPlantsMenu>> WHEEL_ABILITIES_PLANTS = REGISTRY.register("wheel_abilities_plants", () -> IForgeMenuType.create(WheelAbilitiesPlantsMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesAnimalsMenu>> WHEEL_ABILITIES_ANIMALS = REGISTRY.register("wheel_abilities_animals", () -> IForgeMenuType.create(WheelAbilitiesAnimalsMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesMetalMenu>> WHEEL_ABILITIES_METAL = REGISTRY.register("wheel_abilities_metal", () -> IForgeMenuType.create(WheelAbilitiesMetalMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesLightMenu>> WHEEL_ABILITIES_LIGHT = REGISTRY.register("wheel_abilities_light", () -> IForgeMenuType.create(WheelAbilitiesLightMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesShadowMenu>> WHEEL_ABILITIES_SHADOW = REGISTRY.register("wheel_abilities_shadow", () -> IForgeMenuType.create(WheelAbilitiesShadowMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesVacuumMenu>> WHEEL_ABILITIES_VACUUM = REGISTRY.register("wheel_abilities_vacuum", () -> IForgeMenuType.create(WheelAbilitiesVacuumMenu::new));
	public static final RegistryObject<MenuType<BatteryChargerGUIMenu>> BATTERY_CHARGER_GUI = REGISTRY.register("battery_charger_gui", () -> IForgeMenuType.create(BatteryChargerGUIMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesEnergyMenu>> WHEEL_ABILITIES_ENERGY = REGISTRY.register("wheel_abilities_energy", () -> IForgeMenuType.create(WheelAbilitiesEnergyMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesSunMenu>> WHEEL_ABILITIES_SUN = REGISTRY.register("wheel_abilities_sun", () -> IForgeMenuType.create(WheelAbilitiesSunMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesMoonMenu>> WHEEL_ABILITIES_MOON = REGISTRY.register("wheel_abilities_moon", () -> IForgeMenuType.create(WheelAbilitiesMoonMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesSpaceMenu>> WHEEL_ABILITIES_SPACE = REGISTRY.register("wheel_abilities_space", () -> IForgeMenuType.create(WheelAbilitiesSpaceMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesTimeMenu>> WHEEL_ABILITIES_TIME = REGISTRY.register("wheel_abilities_time", () -> IForgeMenuType.create(WheelAbilitiesTimeMenu::new));
	public static final RegistryObject<MenuType<WheelAbilitiesCreationMenu>> WHEEL_ABILITIES_CREATION = REGISTRY.register("wheel_abilities_creation", () -> IForgeMenuType.create(WheelAbilitiesCreationMenu::new));
	public static final RegistryObject<MenuType<KeepersBoxGUIPart1Menu>> KEEPERS_BOX_GUI_PART_1 = REGISTRY.register("keepers_box_gui_part_1", () -> IForgeMenuType.create(KeepersBoxGUIPart1Menu::new));
	public static final RegistryObject<MenuType<KeepersBoxGUIPart2Menu>> KEEPERS_BOX_GUI_PART_2 = REGISTRY.register("keepers_box_gui_part_2", () -> IForgeMenuType.create(KeepersBoxGUIPart2Menu::new));
	public static final RegistryObject<MenuType<KeepersBoxGUIPart3Menu>> KEEPERS_BOX_GUI_PART_3 = REGISTRY.register("keepers_box_gui_part_3", () -> IForgeMenuType.create(KeepersBoxGUIPart3Menu::new));
	public static final RegistryObject<MenuType<KeepersBoxGUIPart4Menu>> KEEPERS_BOX_GUI_PART_4 = REGISTRY.register("keepers_box_gui_part_4", () -> IForgeMenuType.create(KeepersBoxGUIPart4Menu::new));
}
