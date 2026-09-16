import Foundation

/// Shared session duration policy used by the native clients.
public enum SessionLimits {
    /// Close a quiet voice channel after this many idle seconds so AI minutes stop accruing.
    public static let idleVoiceSeconds: Double = 30

    public static func endsForInactivity(voice: Bool, idleSeconds: Double) -> Bool {
        voice && idleSeconds >= idleVoiceSeconds
    }
}
