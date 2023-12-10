package dev.tildejustin.loaderversioning;

import net.fabricmc.loader.impl.game.minecraft.McVersionLookup;
import java.util.*;
import java.nio.file.*;

public class Manual {
    public static void main(String[] args) {
        List<Path> list = Collections.emptyList();
        Arrays.asList(args).forEach(version -> System.out.println(McVersionLookup.getVersion(list, null, version).getNormalized()));
    }
}

