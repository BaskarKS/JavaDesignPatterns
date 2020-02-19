package com.baskarks.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellFontDetailsFactory {
    Map<Integer, CellFontDetails> cache;
    public CellFontDetailsFactory() {
        cache = new HashMap<>();
    }

    public CellFontDetails getCellFontDetails(String fontFamily,
                                              int fontSize,
                                              boolean isBold) {
        int hashKey = Objects.hash(fontFamily, fontSize, isBold);
        if (!cache.containsKey(hashKey))
            cache.put(hashKey, new CellFontDetails(fontFamily,
                                    fontSize, isBold));
        return cache.get(hashKey);
    }
}
