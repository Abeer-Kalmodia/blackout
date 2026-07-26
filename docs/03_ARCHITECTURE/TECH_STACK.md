# BLACKOUT Technology Stack

> "Choose technologies that solve today's problems without limiting tomorrow's possibilities."

---

# Overview

BLACKOUT is built entirely with modern Android development technologies recommended by Google.

The project prioritizes:

- Performance
- Maintainability
- Simplicity
- Privacy
- Long-term support
- Modern Android development practices

---

# Technology Overview

| Category | Technology |
|-----------|------------|
| Language | Kotlin |
| UI Toolkit | Jetpack Compose |
| Architecture | MVVM + Clean Architecture |
| Dependency Injection | Hilt |
| Navigation | Navigation Compose |
| Local Database | Room |
| Preferences | DataStore |
| Async Programming | Kotlin Coroutines |
| Reactive Streams | StateFlow |
| Image Loading | Coil |
| Charts | Vico |
| Logging | Timber |
| Serialization | Kotlinx Serialization |
| Testing | JUnit + Espresso + Compose UI Test |
| Build System | Gradle Kotlin DSL |
| Version Control | Git + GitHub |
| CI/CD | GitHub Actions |

---

# Programming Language

## Kotlin

Reason for choosing Kotlin:

- Official Android language
- Null safety
- Coroutines support
- Concise syntax
- Excellent tooling
- Long-term Google support

Alternatives considered:

- Java
- Flutter (Dart)
- React Native

Decision:

Kotlin provides the best integration with Android APIs and Jetpack libraries.

---

# User Interface

## Jetpack Compose

Purpose:

Build the entire UI declaratively.

Benefits:

- Less boilerplate
- Better animations
- Easier state management
- Material Design 3 support
- Faster development

Modules:

- Screens
- Components
- Theme
- Navigation
- Widgets (Glance in future)

---

# Architecture

Pattern:

MVVM

Supporting Architecture:

Clean Architecture

Benefits:

- Easy testing
- Clear separation of concerns
- Reusable business logic
- Scalable project structure

---

# Dependency Injection

## Hilt

Purpose:

Provide dependencies throughout the application.

Examples:

- Repository injection
- DataStore
- Room Database
- Managers
- Services

Benefits:

- Cleaner constructors
- Easier testing
- Reduced boilerplate

---

# Navigation

Library:

Navigation Compose

Responsibilities:

- Screen navigation
- Back stack handling
- Deep links (future)

Navigation Graph:

Home

↓

Statistics

↓

Settings

Overlay is handled separately using WindowManager.

---

# Database

## Room

Purpose:

Store session history.

Tables:

Session

DailyStatistics

Future:

Achievements

Benefits:

- SQL abstraction
- Compile-time validation
- Coroutines support

---

# Preferences

## DataStore

Purpose:

Store user preferences.

Examples:

- Theme
- Clock visibility
- Overlay settings
- Battery optimization reminders
- Accessibility preferences

Reason:

Replaces SharedPreferences.

---

# Asynchronous Programming

## Kotlin Coroutines

Purpose:

Background work.

Examples:

- Database access
- Preference updates
- Statistics calculation

Benefits:

- Lightweight
- Structured concurrency
- Easy cancellation

---

# Reactive State

## StateFlow

Purpose:

Expose UI state.

Advantages:

- Lifecycle aware
- Works perfectly with Compose
- Predictable state updates

No LiveData will be used.

---

# Image Loading

## Coil

Purpose:

Load icons and images.

Reasons:

- Kotlin-first
- Lightweight
- Compose integration
- Memory efficient

---

# Charts

## Vico

Purpose:

Display usage statistics.

Examples:

- Daily usage
- Weekly activity
- Monthly trends

Reasons:

- Native Compose support
- Smooth animations
- Easy customization

---

# Logging

## Timber

Purpose:

Application logging.

Examples:

- Overlay lifecycle
- Widget actions
- Service events

Release builds:

Logging disabled.

---

# Serialization

## Kotlinx Serialization

Purpose:

Serialize application data.

Future use:

- Export statistics
- Backup settings
- Import configurations

---

# Background Components

## Foreground Service

Responsibilities:

- Overlay lifecycle
- Persistent notification
- Overlay updates

---

## BroadcastReceiver

Responsibilities:

- Boot completed
- Widget clicks
- Notification actions

---

## TileService

Responsibilities:

- Quick Settings tile

---

## App Widget

Responsibilities:

- One-tap BLACKOUT activation

Future implementation:

Jetpack Glance

---

# Material Design

## Material Design 3

Features:

- Dynamic colors (optional)
- Typography system
- Elevation
- Accessibility
- Modern components

BLACKOUT will default to a custom AMOLED theme while remaining compatible with Material 3.

---

# Build System

## Gradle Kotlin DSL

Reasons:

- Type safety
- Better IDE support
- Official recommendation
- Easier maintenance

---

# Testing

## Unit Testing

Framework:

JUnit

Purpose:

Business logic testing.

---

## UI Testing

Framework:

Compose UI Test

Purpose:

Screen interaction testing.

---

## Instrumentation

Framework:

Espresso

Purpose:

Device-level testing.

---

# Version Control

## Git

Branch Strategy:

main

↓

develop

↓

feature/*

↓

release/*

↓

hotfix/*

Repository:

GitHub

---

# Continuous Integration

## GitHub Actions

Future Workflow:

Build

↓

Unit Tests

↓

Lint

↓

APK Generation

↓

Release

---

# Code Quality

Tools:

ktlint

Detekt

Purpose:

- Consistent formatting
- Static analysis
- Maintainable code

---

# Documentation

Documentation Format:

Markdown

Stored in:

docs/

Design resources:

design/

---

# Design Tools

Primary:

Figma

Prototype:

HTML + CSS

Purpose:

Rapid UI experimentation before Compose implementation.

---

# IDE

Primary IDE:

Android Studio

Secondary:

Visual Studio Code

---

# Minimum Requirements

| Item | Value |
|------|-------|
| Minimum SDK | Android 10 (API 29) |
| Target SDK | Latest Stable |
| Language | Kotlin |
| Java Version | 17 |
| Compose Compiler | Latest Stable |
| Gradle | Latest Stable |

---

# External Services

Current Version:

None

No:

- Firebase
- Backend
- Analytics
- Ads
- Authentication
- Cloud Storage

BLACKOUT is completely offline.

---

# Future Technologies

Potential future additions:

- Jetpack Glance
- WorkManager
- ML Kit
- Wear OS
- Material Motion
- KSP
- Protobuf DataStore
- Baseline Profiles

These will only be introduced when they provide clear value.

---

# Technology Decisions

| Decision | Reason |
|----------|--------|
| Kotlin | Official Android language |
| Compose | Modern UI toolkit |
| MVVM | Scalable architecture |
| Hilt | Dependency injection |
| Room | Reliable local storage |
| DataStore | Modern preferences API |
| Coroutines | Efficient concurrency |
| StateFlow | Reactive UI state |
| Coil | Lightweight image loading |
| Vico | Compose-native charts |
| Timber | Structured logging |
| GitHub Actions | Automated builds and testing |

---

# Summary

BLACKOUT uses a modern, Google-recommended Android stack centered around Kotlin, Jetpack Compose, MVVM, and Clean Architecture. Every technology has been selected to maximize maintainability, performance, and long-term support while keeping the application lightweight, privacy-first, and fully offline.