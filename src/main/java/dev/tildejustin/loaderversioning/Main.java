package dev.tildejustin.loaderversioning;

import net.fabricmc.loader.impl.game.minecraft.McVersionLookup;
import py4j.GatewayServer;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        // app is now the gateway.entry_point
        GatewayServer server = new GatewayServer(app);
        server.start();
    }

    @SuppressWarnings("unused")
    public String normalizedVersion(String minecraftVersion) {
        return McVersionLookup.getVersion(Collections.emptyList(), null, minecraftVersion).getNormalized();
    }
}
