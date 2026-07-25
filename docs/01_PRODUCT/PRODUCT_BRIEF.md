# BLACKOUT

> **Hide the display. Not your experience.**

---

# Product Brief

| Property | Value |
|-----------|-------|
| Project | BLACKOUT |
| Document | Product Brief |
| Version | 1.0.0 |
| Status | Draft |
| Author | Abeer Kalmodia |
| Related Documents | PROJECT_VISION.md, PRODUCT_PHILOSOPHY.md |
| Last Updated | 27 July 2026 |

---

# Purpose

This document provides a concise overview of BLACKOUT.

It is intended for new contributors, designers, developers, testers, and stakeholders who need to understand the project without reading the complete documentation.

Reading this document should take approximately **5–10 minutes**.

---

# Product Summary

BLACKOUT is a lightweight Android utility that allows users to temporarily hide their display while allowing the current application to continue running normally.

Instead of locking the phone or closing an application, BLACKOUT provides a clean black overlay that minimizes visual distractions while preserving the current experience.

The application is designed around simplicity, performance, privacy, and reliability.

---

# Problem Statement

Many Android users continue listening to media or using long-running applications after visual interaction is no longer required.

Examples include:

- Watching YouTube while listening.
- Listening to podcasts.
- Long voice calls.
- Navigation while the phone is inside a pocket.
- Gaming where accidental touches are undesirable.
- Using a phone in public without exposing the display.

Android provides no universal built-in experience focused specifically on temporarily hiding the display while maintaining the current application.

Existing third-party solutions often suffer from one or more of the following:

- Outdated interfaces
- Too many settings
- Advertisements
- Poor performance
- Inconsistent behavior
- Weak accessibility support

BLACKOUT aims to solve these issues.

---

# Product Goals

Version 1 focuses on one objective:

> Create the cleanest, fastest, and most reliable display privacy utility available for Android.

Supporting goals include:

- Reduce visual distractions
- Improve user privacy
- Preserve application continuity
- Maintain excellent performance
- Feel like a native Android feature

---

# Version 1 Features

## Core Features

- AMOLED Black Overlay
- Overlay Controls
- Clock Overlay
- Burn-in Protection
- Brightness Reduction

---

## Convenience Features

- Home Screen Widget
- Quick Settings Tile
- Foreground Notification
- Floating Exit Button

---

## Insights

- Daily Usage
- Weekly Usage
- Session Statistics
- Estimated Battery Savings

---

# Version 1 Exclusions

The following features are intentionally excluded:

- User Accounts
- Cloud Sync
- Internet Features
- Advertisements
- Themes
- Plugin System
- AI Features
- Automation
- Media Player
- Battery Optimizer

These exclusions keep the product focused and maintainable.

---

# Primary Users

BLACKOUT is intended for users who:

- Listen to media frequently
- Own OLED/AMOLED devices
- Prefer minimal software
- Want greater privacy in public spaces
- Appreciate polished Android utilities

Detailed personas are defined in `TARGET_USERS.md`.

---

# Technical Constraints

BLACKOUT is designed with the following constraints:

| Property | Value |
|----------|-------|
| Platform | Android |
| Minimum SDK | API 29 |
| UI | Jetpack Compose |
| Architecture | MVVM + Clean Architecture |
| Offline | Yes |
| Internet Required | No |
| License | MIT |

---

# Success Criteria

Version 1 is considered successful when users can:

- Activate BLACKOUT in a single tap.
- Continue using their current application uninterrupted.
- Exit BLACKOUT instantly.
- Understand the interface without documentation.
- Trust the application with minimal configuration.

---

# Future Vision

Future releases may introduce:

- Pocket Mode
- Face-Down Detection
- Gesture Controls
- Material You
- Sleep Timer
- Advanced Statistics

Future features must remain consistent with the philosophy defined in `PRODUCT_PHILOSOPHY.md`.

---

# Related Documents

- PROJECT_VISION.md
- PRODUCT_PHILOSOPHY.md
- TARGET_USERS.md
- FEATURES.md
- USER_STORIES.md
- PRD.md

---

# Revision History

| Version | Date | Author | Changes |
|----------|------|--------|---------|
| 1.0.0 | 27 Jul 2026 | Abeer Kalmodia | Initial draft |

---

_End of Document_