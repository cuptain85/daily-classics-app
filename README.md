# Daily Classics

**Daily Classics** is a native Android collection of familiar games, built with Kotlin and Jetpack Compose.

- **Daily Sudoku** — date-seeded 9×9 puzzles, notes, checking, undo/redo, and saved progress.
- **Daily Crossword** — date-specific 13×13 grids built from a curated bank of 13,874 English answer-and-clue entries. Across/Down selection, letter entry, checking, and saved progress.
- **Partnership Spades** — a four-player game with you and Dewey on the blue team against Huey and Louie on the red team.
- **Klondike Solitaire** — classic seven-column solitaire with Draw 1 / Draw 3 settings, scoring, and saved game state.

The home screen uses a bright blue-and-green design. Game progress and settings are stored on the device; there are no accounts or cloud-sync features.

## Project status

This repository is public and the app builds successfully in GitHub Actions. **The app is currently a preview/beta, not a finished Play Store release.** Game screens and core rules are implemented to varying degrees, but the complete experience still needs hands-on testing across Android devices, accessibility review, and final gameplay polish. In particular, verify full Spades bidding/trick flow and all Solitaire move paths before treating the app as production-ready.

## Try the Android preview

1. Open the [latest successful Android build](https://github.com/cuptain85/daily-classics-app/actions/workflows/android-build.yml).
2. Select the most recent successful run on the `main` branch.
3. Scroll to **Artifacts** and download **Daily-Classics-debug**.
4. Extract the ZIP and install the included debug APK on an Android device.

Android may ask you to allow installation from the app used to open the downloaded APK. Only install preview builds you obtained from this repository.

Debug builds are for testing and are not signed as a public distribution release.

## Build from source

Requirements:
- Android Studio with Android SDK 35
- JDK 17
- Gradle 8.11.1 (the GitHub Actions workflow installs this version)

Open the repository in Android Studio and run the `app` configuration, or run:

```bash
gradle :app:testDebugUnitTest
gradle :app:assembleDebug
```

The debug APK is written to `app/build/outputs/apk/debug/app-debug.apk`.

## Privacy

The current app does not request the Android Internet permission and has no account, advertising, analytics, or cloud-sync integration. Game progress and settings are stored locally using Android app preferences. Android device backup behavior may apply to app data according to the device's backup settings.

Read the [Privacy Policy](PRIVACY.md).

## Third-party data

The crossword clue/answer data is derived from [Open Crossword Bank](https://github.com/tamino-martinius/node-open-crossword-bank). The imported data is dedicated to the public domain under CC0-1.0. See [THIRD_PARTY_NOTICES.md](THIRD_PARTY_NOTICES.md) for details.

## Compatibility

- Android minimum: API 26 (Android 8.0)
- Target SDK: API 35
- Application ID: `com.dailyclassics.app`
- Current version: `0.1.0`

## Feedback and bug reports

Please use [GitHub Issues](https://github.com/cuptain85/daily-classics-app/issues). Include your Android version, device model, the game you were playing, and clear steps to reproduce the issue. Do not include private or sensitive information in bug reports.
