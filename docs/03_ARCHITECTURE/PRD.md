# Product Requirements Document (PRD)

**Project:** BLACKOUT  
**Version:** 1.0  
**Status:** Draft  
**Author:** Abeer Kalmodia  
**Last Updated:** July 2026

---

# 1. Executive Summary

BLACKOUT is a lightweight Android utility that allows users to temporarily hide their phone's display while keeping the currently running application active.

Unlike locking the device, BLACKOUT places a nearly black overlay over the screen, allowing audio playback, navigation, downloads, calls, timers, and other ongoing tasks to continue without interruption.

The product is designed to be:

- Minimal
- Privacy-first
- Offline-first
- Battery-conscious
- Fast
- Reliable

The primary objective is to reduce unnecessary screen usage while preserving the user's current experience.

---

# 2. Problem Statement

Many Android users consume media that does not require the display to remain visible.

Examples include:

- Listening to podcasts
- Listening to music
- Watching long YouTube videos while only needing audio
- Navigation
- Long downloads
- Voice calls
- Meditation
- Audiobooks

Turning the display off usually pauses or interrupts the experience depending on the application.

Users need a simple way to hide the display while allowing the current application to continue operating normally.

---

# 3. Vision

To become the simplest and most reliable Android utility for reducing unnecessary screen usage without interrupting the user's current activity.

---

# 4. Product Goals

## Primary Goals

- Hide the display without distracting the user
- Keep the current application running
- Extremely low battery usage
- Simple one-tap activation
- Modern Android experience
- Offline operation

---

## Secondary Goals

- Home screen widget
- Quick Settings tile
- Usage statistics
- Beautiful UI
- Accessibility

---

# 5. Non Goals

BLACKOUT will not become:

- A media player
- A launcher
- A lock screen replacement
- A battery optimizer
- A task manager
- A screen recorder
- A video player

Its purpose is singular:

Hide the display.

---

# 6. Target Audience

Primary Users

- Podcast listeners
- Music listeners
- Students
- Travelers
- Professionals
- Drivers (passengers only where legally appropriate)
- People wanting to reduce screen time

Secondary Users

- Developers
- Power users
- Accessibility users

---

# 7. User Personas

### Persona 1

Music Listener

"I only need the audio."

Pain Points

- Screen stays on
- Accidental touches
- Battery drain

Desired Outcome

Hide the display instantly.

---

### Persona 2

Student

"I listen to lectures while commuting."

Desired Outcome

Save battery without stopping playback.

---

### Persona 3

Minimalist

"I don't want distractions."

Desired Outcome

Pure black screen.

---

# 8. User Stories

### Core

As a user,

I want to hide the display,

so I can continue listening without viewing the screen.

---

As a user,

I want one tap activation,

so I don't need to navigate settings.

---

As a user,

I want to stop BLACKOUT quickly,

so I can immediately return to the application.

---

### Widgets

As a user,

I want a widget,

so I can activate BLACKOUT from my home screen.

---

### Quick Settings

As a user,

I want a Quick Settings tile,

so activation takes one swipe.

---

### Statistics

As a user,

I want usage statistics,

so I understand my listening habits.

---

# 9. Functional Requirements

## Home

Must provide:

- Current status
- Start button
- Quick actions
- Usage summary

---

## Overlay

Must:

- Cover the display
- Use AMOLED black
- Support exit
- Display optional clock

---

## Statistics

Must show:

- Daily usage
- Weekly usage
- Session history
- Battery estimate

---

## Settings

Must allow:

- Overlay options
- Clock toggle
- Theme options
- Permissions
- About

---

## Widget

Must:

- Activate BLACKOUT
- Display current status

---

## Quick Settings Tile

Must:

- Toggle BLACKOUT
- Show current state

---

# 10. Non Functional Requirements

Performance

- Overlay launch <250 ms

Memory

- <120 MB

APK Size

- <15 MB

Cold Start

- <800 ms

Battery

- Minimal background work

Offline

- Fully functional

---

# 11. Success Metrics

Activation Time

<2 seconds

Crash Rate

<0.5%

App Size

<15 MB

Battery Impact

Negligible

User Satisfaction

Easy to use in under 5 seconds.

---

# 12. MVP Scope

Included

- Overlay
- Foreground service
- Widget
- Quick Tile
- Statistics
- Settings

Not Included

- Cloud sync
- Accounts
- Themes beyond AMOLED
- AI features
- Automation
- Wear OS

---

# 13. Future Scope

Potential additions

- Scheduled BLACKOUT
- Wear OS
- Material You
- Tablet optimization
- Automation
- Plugin API
- Desktop companion
- Backup & restore

---

# 14. Risks

## Technical

- Manufacturer restrictions
- Battery optimization
- Overlay compatibility
- Android version differences

---

## Product

- User confusion
- Permission denial
- Background service limitations

---

# 15. Assumptions

- Users understand overlay permissions.
- Foreground services remain supported.
- Android overlay APIs continue to be available.

---

# 16. Out of Scope

- Root-only functionality
- Video playback controls
- Internet services
- Ads
- User accounts
- Social features

---

# 17. Milestones

## Sprint 0

Planning

Documentation

Design

---

## Sprint 1

Android Project

Compose Setup

Navigation

---

## Sprint 2

Foreground Service

Overlay Engine

---

## Sprint 3

Widget

Quick Settings Tile

---

## Sprint 4

Statistics

Settings

Persistence

---

## Sprint 5

Optimization

Testing

Bug Fixes

---

## Sprint 6

Release Candidate

Play Store Assets

Launch

---

# 18. Acceptance Criteria

The MVP is complete when:

- User can activate BLACKOUT with one tap.
- Overlay appears within 250 ms.
- Current application continues running.
- Foreground service remains stable.
- Widget works correctly.
- Quick Settings tile works.
- Statistics update automatically.
- No internet connection is required.
- All core features function on supported Android devices.

---

# 19. Product Principles

1. Simplicity over complexity.
2. Privacy over analytics.
3. Performance over unnecessary features.
4. Offline by default.
5. One primary purpose.
6. Respect Android platform guidelines.
7. Every feature must justify its existence.

---

# 20. Conclusion

BLACKOUT is intentionally focused on solving one problem exceptionally well: allowing users to hide their display while continuing their current activity. Every feature, design decision, and technical choice should reinforce this goal while maintaining a fast, private, lightweight, and reliable Android experience.