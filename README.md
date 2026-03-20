# Fruit Basket App

> A beautifully designed Android app to explore and discover fruit combinations — with live search, smooth navigation and a stunning UI built in Kotlin.

![Platform](https://img.shields.io/badge/Platform-Android-3DDC84?logo=android&logoColor=white)
![Language](https://img.shields.io/badge/Language-Kotlin-7F52FF?logo=kotlin&logoColor=white)
![Build](https://img.shields.io/badge/Build-Gradle-02303A?logo=gradle&logoColor=white)
![Release](https://img.shields.io/badge/Release-v1.0-22C55E?logo=github&logoColor=white)
![APK](https://img.shields.io/badge/APK-Download_Now-F97316?logo=android&logoColor=white)

---

## Download & Install

**Direct APK download — no Play Store needed:**

[Download Fruit Basket App v1.0](https://github.com/mohithshuka/FruitBasketApp/releases/tag/v1.0)

**Installation steps:**
1. Download the APK from the link above
2. Open the APK on your Android phone
3. Enable **"Install from Unknown Sources"** if prompted
4. Tap Install and enjoy

---

## Features

- **Splash screen** — smooth branded launch experience
- **Welcome screen** → **Home navigation** — clean onboarding flow
- **Live search bar** — filter fruits instantly as you type
- **Settings dropdown menu** — quick access to app preferences
- **Beautiful fruit combo cards** — visually rich fruit combination displays
- **Responsive layouts** — looks great on all Android screen sizes

---

## App Flow

```
Launch
  │
  ▼
Splash Screen
  │
  │  auto navigate
  ▼
Welcome Screen
  │
  │  user continues
  ▼
Home Screen
  ├── Live Search Bar
  │     └── filter fruit combos instantly
  ├── Fruit Combo Cards
  │     └── browse beautiful combinations
  └── Settings Menu
        └── app preferences
```

---

## Project Structure

```
FruitBasketApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/          # Kotlin source files
│   │       ├── res/           # Layouts, drawables, strings
│   │       └── AndroidManifest.xml
│   └── build.gradle.kts
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## Tech Stack

| Layer | Technology | Purpose |
|-------|-----------|---------|
| Language | Kotlin | Core app logic |
| UI | XML Layouts | Screen design |
| Build | Gradle (Kotlin DSL) | Dependency management |
| Navigation | Android Navigation | Screen transitions |
| Search | Live filter logic | Real-time search |
| Platform | Android SDK | Mobile runtime |

---

## Getting Started (Build from Source)

### Prerequisites

- Android Studio (latest)
- Android SDK 24+
- JDK 17+

### 1. Clone the repository

```bash
git clone https://github.com/mohithshuka/FruitBasketApp.git
```

### 2. Open in Android Studio

- Open Android Studio
- Click **"Open"**
- Select the `FruitBasketApp` folder
- Wait for Gradle sync to complete

### 3. Run the app

- Connect an Android device or start an emulator
- Click the **Run** button (green play icon)
- App launches on your device

### 4. Build APK

```
Build → Build Bundle(s) / APK(s) → Build APK(s)
```

APK will be generated at:
```
app/build/outputs/apk/debug/app-debug.apk
```

---

## Screens Overview

| Screen | Description |
|--------|-------------|
| Splash | Branded launch screen with app logo |
| Welcome | Onboarding screen for first-time users |
| Home | Main screen with fruit combo cards |
| Search | Live search filters cards as you type |
| Settings | App preferences dropdown menu |

---

## Releases

| Version | Date | Notes |
|---------|------|-------|
| v1.0 | Nov 2025 | Initial release |

---

## Roadmap

- [ ] Add fruit nutrition information
- [ ] Favourite/bookmark fruit combos
- [ ] Dark mode support
- [ ] Share fruit combos via social media
- [ ] Add fruit combo rating system
- [ ] Publish to Google Play Store

---

## Key Learnings

- Kotlin's concise syntax makes Android development faster and safer than Java
- Live search filtering with `TextWatcher` gives instant user feedback
- Splash screen with `Handler` + `postDelayed` creates smooth app launch flow
- `RecyclerView` with custom adapters handles large lists efficiently
- Gradle Kotlin DSL (`build.gradle.kts`) gives type-safe build configuration

---

## Author

**Mohith Shuka**
GitHub: [@mohithshuka](https://github.com/mohithshuka)

---

## License

MIT

---

> If you found this project useful, consider giving it a star!
