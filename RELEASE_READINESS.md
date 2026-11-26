# Release Readiness

**Status: Not ready for public Google Play release.** This checklist is maintained as the app is hardened and tested.

## Automated verification

- [x] GitHub Actions workflow runs JVM unit tests, Android lint, debug APK assembly, and release APK assembly.
- [x] Project targets Android 16 (API 36), the current minimum target for new Google Play submissions.
- [x] Regression coverage for daily puzzle determinism, crossword grid structure, Klondike card/deck/save invariants, Spades legal plays, trick winners, partnership scoring, and Nil bids.
- [ ] Confirm the latest workflow run completes successfully after the current code changes.
- [ ] Review all lint warnings and resolve release-relevant findings.
- [ ] Produce and inspect a signed Android App Bundle (AAB), not just an unsigned APK.

## Game and device testing

Run on at least one current Android phone and one smaller/older supported device (API 26+ where practical).

- [ ] Home screen: all four game tiles and Settings open correctly; layout works in portrait and landscape/window resizing.
- [ ] Sudoku: daily puzzle is stable for a date, previous/next date navigation works, fixed clues cannot be changed, notes/clear/check/undo/redo work, and solved state is correct.
- [ ] Crossword: clue list scrolls, selecting a clue scrolls it into view and selects its answer, cell selection switches Across/Down correctly, letters/erase/save/check work, and completed puzzle is detected.
- [ ] Spades: all 52 cards are dealt once, seating/teams are correct, bidding and Nil scoring are correct, players must follow suit, spades cannot be led before broken unless void, tricks and bags score correctly, and match completion/restart work.
- [ ] Solitaire: Draw 1 and Draw 3, stock recycle, legal/illegal moves, multi-card runs, foundation moves, undo/redo, hints, new deal, saved state, and win detection work.
- [ ] Background/foreground, process death, and device restart do not corrupt saved progress.
- [ ] TalkBack, text scaling, touch target sizes, and color contrast are reviewed.

## Monetization and privacy

- [ ] Integrate Google Mobile Ads using test IDs first; use production IDs only after the publisher's AdMob account is configured.
- [ ] Integrate Google Play Billing for the one-time, non-consumable `remove_ads` product at $0.99.
- [ ] Verify purchase acknowledgement, restore/re-query after reinstall, and ad suppression for purchased users.
- [ ] Enforce the agreed placement policy: no full-screen ads during active play; interstitials only at game-entry transitions and natural game-completion breaks; conservative frequency caps; small banners never cover controls.
- [ ] Add the appropriate consent/privacy messaging and update the privacy policy to accurately describe ad SDK data collection and sharing.
- [ ] Complete Google Play Data safety, ads declaration, content rating, target audience, and app access declarations truthfully.

## Store and release operations

- [ ] Confirm the developer's Google Play Console account and app ownership.
- [ ] Configure the Play Store listing, screenshots, feature graphic, app icon, short/full descriptions, and support contact.
- [ ] Configure the in-app product in Play Console and test with licensed tester accounts.
- [ ] Configure secure release signing; keep the upload key private and backed up.
- [ ] Complete internal testing, fix all reported issues, then run a closed test if required for the developer account.
- [ ] Review Play Console pre-launch report and policy status before production rollout.

## External setup required before production monetization

The app code can be prepared with test configurations, but live monetization cannot be verified until the publisher supplies/configures the AdMob app ID and ad-unit IDs and the Play Console product `remove_ads`. Never commit private signing keys or credentials to the repository.
