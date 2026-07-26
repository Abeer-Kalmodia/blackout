# BLACKOUT Architecture

> "Simple for the user. Sophisticated under the hood."

---

# Overview

BLACKOUT follows a **Clean Architecture** with the **MVVM (Model–View–ViewModel)** pattern.

The application is designed to be:

- Modular
- Testable
- Maintainable
- Scalable
- Battery Efficient
- Offline First

Every layer has a single responsibility and communicates only with adjacent layers.

---

# Architecture Goals

## Primary Goals

- High performance
- Low battery consumption
- Clean codebase
- Easy feature expansion
- Modern Android practices
- Fully Kotlin
- Jetpack Compose only

---

## Non-Goals

BLACKOUT intentionally does NOT include:

- User accounts
- Cloud synchronization
- Remote servers
- Advertisements
- Analytics SDKs
- Tracking libraries

The application should remain lightweight and privacy focused.

---

# Architecture Diagram

```

┌──────────────────────────┐
│        User              │
└────────────┬─────────────┘
│
▼
┌──────────────────────────┐
│     Jetpack Compose UI   │
└────────────┬─────────────┘
│
▼
┌──────────────────────────┐
│       ViewModel          │
└────────────┬─────────────┘
│
▼
┌──────────────────────────┐
│      Repository          │
└──────┬───────────┬───────┘
│           │
▼           ▼
Room      DataStore

```

---

# Layer Responsibilities

## 1. Presentation Layer

Responsible for:

- UI
- Navigation
- Animations
- User interactions
- State collection

Contains:

- Compose Screens
- Components
- Theme
- Navigation Graph

Never performs business logic.

---

## 2. ViewModel Layer

Responsible for:

- UI state
- Business rules
- Event handling
- Validation

The ViewModel communicates only with repositories.

No Android UI code belongs here.

---

## 3. Repository Layer

Acts as the single source of truth.

Responsibilities:

- Read/write settings
- Retrieve statistics
- Store sessions
- Coordinate local storage

Future repositories can be added without changing the UI.

Example:

```

SettingsRepository

StatisticsRepository

OverlayRepository

```

---

## 4. Data Layer

Contains all local storage.

Uses:

- Room Database
- DataStore Preferences

The UI never accesses storage directly.

---

# Project Structure

```

app/

src/main/java/io/abeerkalmodia/blackout/

├── ui/
│
├── navigation/
│
├── theme/
│
├── screens/
│   ├── home/
│   ├── statistics/
│   ├── settings/
│   └── overlay/
│
├── components/
│
├── viewmodel/
│
├── repository/
│
├── database/
│
├── datastore/
│
├── service/
│
├── receiver/
│
├── widget/
│
├── tile/
│
├── utils/
│
└── di/

```

---

# Navigation Architecture

Navigation uses:

Jetpack Navigation Compose

```

Home

↓

Statistics

↓

Settings

↓

Overlay

```

Overlay is not a normal screen.

It is displayed using WindowManager.

---

# Overlay Architecture

```

User taps START

↓

ViewModel

↓

OverlayManager

↓

Foreground Service

↓

WindowManager

↓

Overlay Window

```

The overlay exists independently of the activity.

---

# Foreground Service

The foreground service is responsible for:

- Keeping BLACKOUT alive
- Managing overlay lifecycle
- Displaying persistent notification
- Listening for quick actions

The service should do as little work as possible.

---

# Overlay Manager

Responsibilities:

- Create overlay
- Remove overlay
- Update overlay
- Change opacity
- Handle animations

No UI business logic should exist here.

---

# Widget Architecture

Home Screen Widget

↓

BroadcastReceiver

↓

Repository

↓

Foreground Service

↓

OverlayManager

---

# Quick Settings Tile

```

Quick Tile

↓

TileService

↓

Repository

↓

Foreground Service

↓

Overlay

```

---

# Data Flow

```

User

↓

UI Event

↓

ViewModel

↓

Repository

↓

DataStore / Room

↓

StateFlow

↓

Compose UI

```

One directional data flow.

---

# State Management

Uses:

- MutableStateFlow
- StateFlow
- collectAsState()

No LiveData.

---

# Dependency Injection

Framework:

Hilt

Injected components include:

- Repositories
- Database
- Preferences
- Managers

Benefits:

- Easier testing
- Better modularity
- Cleaner constructors

---

# Database

Room

Tables:

Session

```

id

startTime

endTime

duration

batterySaved

```

DailyStatistics

```

date

totalDuration

sessionCount

```

---

# Preferences

Stored using DataStore.

Examples:

- AMOLED Mode
- Show Clock
- Theme
- Widget Enabled
- Battery Optimization Reminder

---

# Background Components

## Foreground Service

Runs overlay.

---

## Broadcast Receivers

Handles:

- Boot Completed
- Widget clicks
- Notification actions

---

## Tile Service

Provides Quick Settings tile.

---

## App Widget

Allows activation from Home Screen.

---

# Error Handling

Every repository returns:

- Success
- Loading
- Error

No exceptions should reach the UI.

---

# Logging

Uses:

Timber

Logs include:

- Overlay state
- Widget events
- Service lifecycle

Debug logs disabled in release builds.

---

# Performance Goals

Cold start

< 800 ms

Memory

< 120 MB

Overlay launch

< 250 ms

Animation

60 FPS

APK Size

< 15 MB

---

# Security

BLACKOUT stores data locally.

No internet connection required.

No user accounts.

No tracking.

No advertising SDK.

Minimal permissions only.

---

# Scalability

Future modules can include:

- Automation
- Scheduled blackout
- Plugin API
- Cloud backup
- Wear OS
- Desktop Companion

Current architecture already supports expansion.

---

# Design Principles

The project follows:

- SOLID
- DRY
- KISS
- Separation of Concerns
- Single Source of Truth
- Unidirectional Data Flow

---

# Future Improvements

Possible future enhancements:

- Multi-window support
- Dynamic Material You colors
- AI battery estimation
- Plugin system
- Tablet optimization
- Wear OS companion
- Desktop synchronization

---

# Architecture Summary

| Layer | Responsibility |
|----------|----------------|
| UI | Display information |
| ViewModel | Business logic |
| Repository | Data coordination |
| Room | Session storage |
| DataStore | User preferences |
| Foreground Service | Overlay lifecycle |
| OverlayManager | Overlay window |
| Widget | Quick access |
| Tile Service | Quick Settings integration |

---

# Final Notes

BLACKOUT is designed to remain lightweight, privacy-first, and offline by default.

The architecture prioritizes maintainability, modularity, and long-term scalability while keeping runtime overhead low. Every new feature should integrate into the existing layers rather than bypassing them, preserving a clean separation of concerns throughout the project.
