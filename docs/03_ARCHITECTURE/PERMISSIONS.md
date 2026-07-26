# BLACKOUT Permissions

> "Request only what is necessary, and only when it becomes necessary."

---

# Overview

BLACKOUT follows the **Principle of Least Privilege**.

The application requests only the permissions required for its functionality.

Permissions are requested **on demand**, not during the first launch.

If a feature does not require a permission, the permission is never requested.

---

# Permission Philosophy

BLACKOUT is designed to be:

- Privacy First
- Offline First
- Transparent
- Minimal

The application:

- Does not request unnecessary permissions
- Does not access contacts
- Does not access location
- Does not access camera
- Does not access microphone
- Does not access storage
- Does not access SMS
- Does not access phone calls

---

# Permission Summary

| Permission | Required | Requested When |
|------------|----------|----------------|
| SYSTEM_ALERT_WINDOW | Yes | User enables overlay |
| POST_NOTIFICATIONS | Android 13+ | Before starting foreground service |
| FOREGROUND_SERVICE | Yes | Automatically when service starts |
| FOREGROUND_SERVICE_MEDIA_PROJECTION | No | Not Used |
| RECEIVE_BOOT_COMPLETED | Optional | User enables auto-start |
| WAKE_LOCK | Optional | Future feature |
| VIBRATE | Optional | If haptic feedback enabled |

---

# SYSTEM_ALERT_WINDOW

Permission

```
android.permission.SYSTEM_ALERT_WINDOW
```

Purpose

Display the AMOLED black overlay above other applications.

Required

✅ Yes

Importance

Critical

Used For

- BLACKOUT overlay
- Floating controls (future)
- Overlay animations

When Requested

Only after the user taps

```
Start BLACKOUT
```

If Denied

- Overlay cannot be shown
- Other app features continue working

Play Store Justification

Required for displaying the blackout overlay over the currently running application.

---

# POST_NOTIFICATIONS

Permission

```
android.permission.POST_NOTIFICATIONS
```

Android Version

Android 13+

Purpose

Display the foreground service notification.

Required

Yes (Android 13+)

Importance

High

When Requested

Before starting the foreground service.

If Denied

Foreground service may not display notifications correctly, depending on Android version.

---

# FOREGROUND_SERVICE

Permission

```
android.permission.FOREGROUND_SERVICE
```

Purpose

Keep the overlay alive while the application is running.

Importance

Critical

Requested

Automatically by Android.

User Prompt

No runtime dialog.

---

# RECEIVE_BOOT_COMPLETED

Permission

```
android.permission.RECEIVE_BOOT_COMPLETED
```

Purpose

Restart optional BLACKOUT services after device reboot.

Required

Optional

Requested

Only if the user enables:

```
Start BLACKOUT after reboot
```

If Disabled

BLACKOUT behaves normally.

---

# WAKE_LOCK

Permission

```
android.permission.WAKE_LOCK
```

Purpose

Maintain internal timers during future automation features.

Current Version

Not required.

Future

Scheduled BLACKOUT sessions.

---

# VIBRATE

Permission

```
android.permission.VIBRATE
```

Purpose

Provide haptic feedback.

Required

No

User Setting

Optional.

---

# Permissions NOT Used

BLACKOUT intentionally avoids the following:

| Permission | Reason |
|------------|--------|
| INTERNET | No backend required |
| ACCESS_FINE_LOCATION | Not needed |
| ACCESS_COARSE_LOCATION | Not needed |
| CAMERA | Not needed |
| RECORD_AUDIO | Not needed |
| READ_CONTACTS | Not needed |
| WRITE_CONTACTS | Not needed |
| READ_SMS | Not needed |
| SEND_SMS | Not needed |
| CALL_PHONE | Not needed |
| READ_PHONE_STATE | Not needed |
| READ_EXTERNAL_STORAGE | Not needed |
| WRITE_EXTERNAL_STORAGE | Not needed |
| READ_MEDIA_IMAGES | Not needed |
| READ_MEDIA_VIDEO | Not needed |
| READ_MEDIA_AUDIO | Not needed |
| BLUETOOTH | Not needed |
| NFC | Not needed |

---

# Runtime Permission Flow

```
User

↓

Tap Start BLACKOUT

↓

Check Overlay Permission

↓

Already Granted?

      │

 ┌────┴─────┐

 │          │

Yes         No

 │          │

 │          ▼

 │    Open Settings

 │          │

 └──────► Granted

            │

            ▼

Start Foreground Service

↓

Display Overlay
```

---

# Permission Request Strategy

BLACKOUT never requests every permission during onboarding.

Instead:

Step 1

User tries a feature.

↓

Step 2

Explain why permission is needed.

↓

Step 3

Open Android permission page.

↓

Step 4

Continue immediately after approval.

---

# User Transparency

Every permission screen includes:

- Why the permission is required
- What BLACKOUT will do
- What BLACKOUT will NOT do
- A continue button
- A cancel button

---

# Accessibility Service

Current Version

Not used.

Reason

The overlay can be implemented using WindowManager without requiring an Accessibility Service.

Future

Accessibility may be considered only for optional automation features.

---

# Device Compatibility

Some manufacturers impose additional restrictions.

Examples:

- Xiaomi (MIUI)
- OPPO (ColorOS)
- vivo (Funtouch OS)
- Huawei (EMUI)

BLACKOUT will detect common restrictions and provide guidance to the user where appropriate.

---

# Battery Optimization

Some devices stop foreground services aggressively.

BLACKOUT may recommend disabling battery optimization.

This is optional.

The app continues functioning without it, although long-running overlay sessions may be less reliable on some devices.

---

# Security Principles

BLACKOUT:

- Stores all data locally
- Never uploads permission status
- Never tracks usage externally
- Never requests hidden permissions
- Never uses reflection to bypass Android security
- Never requires root access

---

# Google Play Compliance

BLACKOUT follows Google Play policies by:

- Requesting permissions only when needed
- Clearly explaining permission usage
- Respecting user denial
- Providing degraded functionality when possible
- Avoiding unnecessary access to device resources

---

# Future Permissions

Potential future features may require:

| Permission | Feature |
|------------|---------|
| SCHEDULE_EXACT_ALARM | Scheduled BLACKOUT sessions |
| REQUEST_IGNORE_BATTERY_OPTIMIZATIONS | Long-running overlay sessions |
| FOREGROUND_SERVICE_SPECIAL_USE | If future Android versions require specialized foreground service categories |

These permissions will only be introduced if they become necessary.

---

# Permission Matrix

| Permission | Required | Runtime | Optional |
|------------|----------|---------|----------|
| SYSTEM_ALERT_WINDOW | ✅ | Settings | ❌ |
| POST_NOTIFICATIONS | ✅ (Android 13+) | Yes | ❌ |
| FOREGROUND_SERVICE | ✅ | No | ❌ |
| RECEIVE_BOOT_COMPLETED | ❌ | No | ✅ |
| WAKE_LOCK | ❌ | No | ✅ |
| VIBRATE | ❌ | No | ✅ |

---

# Summary

BLACKOUT requests the smallest possible set of permissions required to deliver its core functionality.

Permissions are requested only when needed, explained clearly to the user, and never used for purposes outside the feature that requires them. The application is designed to remain privacy-first, transparent, and compliant with modern Android and Google Play guidelines.