package chat.mural.core

/** Shared session duration policy used by the native clients. */
object SessionLimits {
    /** Close a quiet voice channel after this many idle seconds so AI minutes stop accruing. */
    const val IDLE_VOICE_SECONDS = 30.0

    fun endsForInactivity(voice: Boolean, idleSeconds: Double): Boolean =
        voice && idleSeconds >= IDLE_VOICE_SECONDS
}
