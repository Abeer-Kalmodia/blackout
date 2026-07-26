# BLACKOUT

> **Hide the display. Not your experience.**

---

# Product Features

| Property | Value |
|-----------|-------|
| Project | BLACKOUT |
| Document | Product Features |
| Version | 1.0.0 |
| Status | Draft |
| Author | Abeer Kalmodia |
| Related Documents | PROJECT_VISION.md, PRODUCT_PHILOSOPHY.md, PRODUCT_BRIEF.md |
| Last Updated | 27 July 2026 |

---

# Purpose

This document defines every feature planned for BLACKOUT Version 1.

Each feature includes:

- Purpose
- User value
- Functional requirements
- UX requirements
- Acceptance criteria
- Future improvements

Only approved features belong in this document.

---

# Feature Categories

```
Core Features
    │
    ├── Overlay System
    ├── Overlay Controls
    ├── Burn-in Protection
    └── Brightness

Experience Features
    │
    ├── Widget
    ├── Quick Settings Tile
    ├── Notification
    └── Animations

Insights
    │
    ├── Statistics
    ├── Sessions
    └── Battery Estimates

Settings
    │
    ├── Overlay
    ├── Accessibility
    ├── Appearance
    └── Behavior
```

---

# Core Features

---

# 1. AMOLED Black Overlay

## Goal

Hide the display while allowing the current application to continue running.

## User Benefit

- Reduced distractions
- Improved privacy
- Reduced OLED power usage
- Comfortable night use

## Functional Requirements

- One-tap activation
- Full-screen overlay
- Pure black background
- Support portrait and landscape
- Support multi-window where possible

## UX Requirements

- Activation <150 ms
- Fade animation
- No visible flicker

## Acceptance Criteria

- Covers entire display
- Current app remains active
- Overlay dismisses correctly

---

# 2. Floating Exit Button

## Goal

Provide an easy way to exit BLACKOUT.

## Functional Requirements

- Draggable
- Snap to screen edges
- Single tap to dismiss
- Remember last position

## UX Requirements

- Small
- Non-intrusive
- Smooth movement

## Acceptance Criteria

- Always accessible
- Never blocks important content
- Position persists

---

# 3. Burn-in Protection

## Goal

Prevent static OLED burn-in.

## Functional Requirements

- Slowly move overlay elements
- Configurable interval
- Low CPU usage

## Acceptance Criteria

- Movement is subtle
- No noticeable battery impact

---

# 4. Brightness Reduction

## Goal

Reduce perceived brightness while BLACKOUT is active.

## Functional Requirements

- Optional
- Adjustable
- Restore original brightness on exit

## Acceptance Criteria

- Restores previous value
- No permanent system changes

---

# Experience Features

---

# 5. Home Screen Widget

## Goal

Launch BLACKOUT without opening the application.

## Functional Requirements

- One-tap activation
- Dynamic icon
- Material 3 style

## Acceptance Criteria

- Launches in one tap

---

# 6. Quick Settings Tile

## Goal

Allow activation directly from Android Quick Settings.

## Functional Requirements

- Toggle overlay
- Active state indicator

## Acceptance Criteria

- Updates instantly
- Syncs with app state

---

# 7. Persistent Notification

## Goal

Allow users to control BLACKOUT while active.

## Functional Requirements

- Exit button
- Current status
- Optional clock

## Acceptance Criteria

- Always visible while service runs
- Removed immediately after exit

---

# 8. Overlay Clock

## Goal

Display time while the screen is hidden.

## Functional Requirements

- Optional
- 12/24-hour support
- Adjustable position

## Acceptance Criteria

- Minimal battery impact
- Readable on OLED displays

---

# Statistics

---

# 9. Usage Statistics

## Goal

Provide insight into usage.

## Functional Requirements

- Daily usage
- Weekly usage
- Monthly usage
- Total sessions

## Acceptance Criteria

- Accurate tracking
- Stored locally

---

# 10. Battery Estimate

## Goal

Estimate battery savings.

## Functional Requirements

- Estimate based on session length
- Device-independent calculation

## Acceptance Criteria

- Clearly marked as estimate

---

# Settings

---

# 11. Overlay Settings

## Options

- Enable fade animation
- Overlay opacity (future)
- Exit gesture
- Auto start

---

# 12. Accessibility Settings

## Options

- Larger controls
- High contrast
- Haptic feedback

---

# 13. Appearance

## Options

- Material You support
- Dynamic colors
- AMOLED mode

---

# Version 1 Feature Matrix

| Feature | Priority | Version |
|----------|----------|----------|
| Black Overlay | Critical | 1.0 |
| Floating Button | Critical | 1.0 |
| Notification | Critical | 1.0 |
| Widget | High | 1.0 |
| Quick Tile | High | 1.0 |
| Burn-in Protection | High | 1.0 |
| Brightness | Medium | 1.0 |
| Clock | Medium | 1.0 |
| Statistics | Medium | 1.0 |
| Battery Estimate | Low | 1.0 |

---

# Future Features

The following are intentionally postponed.

- Pocket Mode
- Face Down Detection
- Sleep Timer
- Gesture Controls
- Material You customization
- Smart Suggestions
- Wear OS support
- Automation
- Plugin System

These features will only be considered after Version 1 is stable.

---

# Feature Approval Rules

A feature may be added only if it:

- Supports the product vision.
- Improves the primary user experience.
- Does not significantly increase complexity.
- Maintains performance.
- Respects user privacy.
- Works offline whenever possible.

---

# Related Documents

- PROJECT_VISION.md
- PRODUCT_PHILOSOPHY.md
- PRODUCT_BRIEF.md
- TARGET_USERS.md
- ROADMAP.md
- PRD.md

---

# Revision History

| Version | Date | Author | Changes |
|----------|------|--------|---------|
| 1.0.0 | 27 Jul 2026 | Abeer Kalmodia | Initial draft |

---

_End of Document_