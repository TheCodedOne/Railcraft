/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2016
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/

package mods.railcraft.common.plugins.misc;

import net.minecraftforge.fml.common.Loader;

import java.util.Arrays;

/**
 * Created by CovertJaguar on 8/5/2016 for Railcraft.
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public enum Mod {
    THAUMCRAFT("Thaumcraft"),
    FORESTRY("forestry"),
    IC2("IC2"),
    IC2_CLASSIC("IC2-Classic-Spmod");

    public final String modId;

    Mod(String modId) {
        this.modId = modId;
    }

    public boolean isLoaded() {
        return Loader.isModLoaded(modId);
    }

    public static boolean areLoaded(Mod... mods) {
        return Arrays.stream(mods).allMatch(m -> Loader.isModLoaded(m.modId));
    }

}
