package chat.mural.core

import org.junit.Assert.*
import org.junit.Test

class SessionLimitsTest {
    @Test fun voiceIdleEndsAfterThirtySeconds() {
        assertFalse(SessionLimits.endsForInactivity(voice = true, idleSeconds = 29.0))
        assertTrue(SessionLimits.endsForInactivity(voice = true, idleSeconds = 30.0))
        assertTrue(SessionLimits.endsForInactivity(voice = true, idleSeconds = 31.0))
    }

    @Test fun typedSessionsIgnoreIdleTimeout() {
        assertFalse(SessionLimits.endsForInactivity(voice = false, idleSeconds = 600.0))
    }
}
