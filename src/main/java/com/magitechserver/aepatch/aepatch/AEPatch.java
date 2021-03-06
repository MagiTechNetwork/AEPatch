package com.magitechserver.aepatch.aepatch;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ModMetadata;

@Mod(
        modid = AEPatch.MOD_ID,
        name = AEPatch.MOD_NAME,
        version = AEPatch.VERSION
)
public class AEPatch extends DummyModContainer {

    public static final String MOD_ID = "AEPatch";
    public static final String MOD_NAME = "AEPatch";
    public static final String VERSION = "1.0-SNAPSHOT";

    public AEPatch() {
        super(new ModMetadata());
        ModMetadata metadata = getMetadata();
        metadata.authorList.add("Eufranio");
        metadata.name = "AEPatch";
        metadata.modId = "AEPatch";
        metadata.version = "1.0";
    }
}