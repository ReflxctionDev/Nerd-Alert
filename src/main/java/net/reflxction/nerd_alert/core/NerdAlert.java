/*
 * * Copyright 2018 github.com/ReflxctionDev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.reflxction.nerd_alert.core;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;

import java.io.File;

/**
 * ReflxctionDev presents: The most useless mod founded on earth, and let me honest I have no idea why do I spend my time doing such things
 * <p>
 * Sponsored by: The Impurity Hypixel Guild
 */
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class NerdAlert {

    // Config to save data
    private Configuration config;

    // boolean value if the mod is enabled
    private static boolean isEnabled;

    /**
     * Initialize variables here
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        config = new Configuration(new File("config/nerd-alert.cfg"));
        isEnabled = getConfig().get("Enabled", "Enabled", true).getBoolean();
    }

    /**
     * Register events here
     */
    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    /**
     * Register commands here
     */
    @EventHandler
    public void serverStart(FMLServerStartedEvent event) {

    }

    /**
     * Config of the mod
     *
     * @return Config of the mod
     */
    private Configuration getConfig() {
        return config;
    }

    /**
     * If the mod is enabled
     *
     * @return boolean if the mod is enabled
     */
    public static boolean isEnabled() {
        return isEnabled;
    }

}
