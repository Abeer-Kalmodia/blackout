# BLACKOUT

> **Hide the display. Not your experience.**

---

# Design Specification

| Property | Value |
|-----------|-------|
| Project | BLACKOUT |
| Document | Design Specification |
| Version | 1.0.0 |
| Status | Draft |
| Author | Abeer Kalmodia |
| Last Updated | 27 July 2026 |

---

# Purpose

This document defines BLACKOUT's complete visual identity and user experience.

It establishes design principles, reusable components, interaction patterns, spacing, typography, animations, and accessibility requirements.

Every screen and every UI component should follow this document.

---

# Table of Contents

1. Design Philosophy
2. Visual Identity
3. Color System
4. Typography
5. Icons
6. Layout
7. Spacing
8. Components
9. Navigation
10. Motion
11. Accessibility
12. Screen Specifications
13. Design Rules

---

# 1. Design Philosophy

BLACKOUT follows one simple philosophy:

> **Reduce everything that does not help the user accomplish their goal.**

The application should feel:

- Minimal
- Premium
- Fast
- Calm
- Native

BLACKOUT should never compete for the user's attention.

---

# 2. Visual Identity

The design language is inspired by:

- Material Design 3
- Nothing OS
- Pixel UI

The interface should feel modern while remaining familiar to Android users.

Design characteristics:

- Large typography
- Rounded corners
- Generous whitespace
- Few colors
- Smooth animations
- Clear hierarchy

---

# 3. Color System

## Primary Colors

| Role | Hex |
|------|------|
| Background | #000000 |
| Surface | #111111 |
| Card | #1B1B1B |
| Divider | #2C2C2C |

---

## Text Colors

| Role | Hex |
|------|------|
| Primary | #FFFFFF |
| Secondary | #B3B3B3 |
| Disabled | #6E6E6E |

---

## Semantic Colors

| Role | Hex |
|------|------|
| Success | #22C55E |
| Warning | #F59E0B |
| Error | #EF4444 |

No gradients.

No unnecessary colors.

Pure black should remain the dominant visual element.

---

# 4. Typography

The application uses Material 3 typography.

| Style | Usage |
|--------|-------|
| Display Large | Splash Screen |
| Headline Large | Page Title |
| Headline Medium | Section Titles |
| Title Large | Cards |
| Body Large | Main Content |
| Body Medium | Secondary Content |
| Label Large | Buttons |

Text should never be centered unless it serves as the primary focus.

---

# 5. Icons

Use **Material Symbols Rounded** exclusively.

Icons should:

- Represent actions
- Be consistent
- Never replace text when text improves clarity

Avoid decorative icons.

---

# 6. Layout

The application uses a single-column layout.

Maximum content width should remain comfortable for one-handed use.

Every screen should follow:

```
Top App Bar

↓

Primary Content

↓

Secondary Content

↓

Bottom Navigation
```

No hamburger menu.

No navigation drawer.

---

# 7. Spacing System

BLACKOUT follows an **8dp spacing system**.

| Value | Usage |
|--------|------|
| 4dp | Tiny spacing |
| 8dp | Small spacing |
| 16dp | Standard spacing |
| 24dp | Section spacing |
| 32dp | Large spacing |
| 48dp | Hero spacing |
| 64dp | Screen spacing |

Spacing should remain consistent throughout the application.

---

# 8. Components

## Buttons

Primary

- Filled
- Large
- Rounded

Secondary

- Outlined

Danger

- Filled Red

Text

- Low priority actions

---

## Cards

Cards contain grouped information.

Requirements:

- Large corner radius
- Comfortable padding
- Minimal elevation

---

## Switches

Used only for binary settings.

Avoid checkboxes whenever possible.

---

## Dialogs

Dialogs should ask only important questions.

Avoid confirmation dialogs unless an action is destructive.

---

## Bottom Sheets

Preferred over dialogs when presenting multiple actions.

---

# 9. Navigation

BLACKOUT contains only three destinations.

```
Home

↓

Statistics

↓

Settings
```

Navigation should always remain visible.

Users should never become lost.

---

# 10. Motion

Animations communicate state changes.

They should never exist purely for decoration.

## Timing

| Speed | Duration |
|--------|----------|
| Fast | 150 ms |
| Normal | 250 ms |
| Slow | 350 ms |

Animations should:

- Fade
- Scale
- Slide

Avoid:

- Bounce
- Overshoot
- Flashy transitions

---

# 11. Accessibility

Minimum touch target:

48dp

Minimum contrast ratio:

4.5:1

Support:

- Screen readers
- Large fonts
- Dynamic text scaling
- High contrast

Accessibility is part of the initial design, not an afterthought.

---

# 12. Screen Specifications

## Splash Screen

Purpose:

Introduce BLACKOUT quickly.

Contents:

- Logo
- App Name

Maximum duration:

1 second

---

## Home

Purpose:

Start BLACKOUT.

Contains:

- Start Button
- Current Status
- Quick Actions
- Last Session

---

## Statistics

Purpose:

Display usage insights.

Contains:

- Daily Usage
- Weekly Usage
- Total Sessions
- Estimated Battery Savings

---

## Settings

Purpose:

Configure application behavior.

Contains:

- Overlay
- Accessibility
- Appearance
- About

---

## Overlay Screen

Purpose:

Hide the display.

Contains:

- Black Background
- Optional Clock
- Floating Exit Button

Nothing else.

---

# 13. Design Rules

Every screen must satisfy the following:

✓ One primary action

✓ One purpose

✓ Consistent spacing

✓ Consistent typography

✓ Consistent animations

✓ Consistent colors

✓ Accessible touch targets

✓ Minimal visual noise

---

# Things We Will Never Do

- Show advertisements
- Add decorative animations
- Use unnecessary gradients
- Overload settings
- Use inconsistent spacing
- Introduce unnecessary permissions
- Prioritize appearance over usability

---

# Design Checklist

Before a screen is approved, verify:

- [ ] Matches Design Philosophy
- [ ] Follows 8dp Grid
- [ ] Uses approved typography
- [ ] Uses approved colors
- [ ] Meets accessibility requirements
- [ ] Has one primary action
- [ ] Can be understood in under 10 seconds

---

# Related Documents

- PROJECT_VISION.md
- PRODUCT_PHILOSOPHY.md
- FEATURES.md
- PRD.md

---

# Revision History

| Version | Date | Author | Changes |
|----------|------|--------|---------|
| 1.0.0 | 27 Jul 2026 | Abeer Kalmodia | Initial draft |

---

_End of Document_