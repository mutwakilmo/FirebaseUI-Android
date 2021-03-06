package com.firebase.ui.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/**
 * Convenience class for checking argument conditions.
 */
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
public final class Preconditions {

    @NonNull
    public static <T> T checkNotNull(@Nullable T o) {
        if (o == null) throw new IllegalArgumentException("Argument cannot be null.");
        return o;
    }

    public static void assertNull(@Nullable Object object, @NonNull String message) {
        if (object != null) {
            throw new RuntimeException(message);
        }
    }

    public static void assertNonNull(@Nullable Object object, @NonNull String message) {
        if (object == null) {
            throw new RuntimeException(message);
        }
    }
}
