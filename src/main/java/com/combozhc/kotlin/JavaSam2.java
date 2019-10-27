package com.combozhc.kotlin;

import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface JavaSam2 {

    boolean apply(@NotNull Integer id);

    default boolean isEven(@NotNull Integer id) {
        return id % 2 == 0;
    }
}
