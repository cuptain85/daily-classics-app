# Public Release Checklist

This is the release gate for Daily Classics. A passing CI build alone is not a public-store release.

## App and gameplay
- [ ] Install the release candidate on multiple physical Android devices and screen sizes.
- [ ] Complete several Sudoku puzzles; verify uniqueness, date changes, notes, clear, undo/redo, and persistence after force-close/restart.
- [ ] Play several Crossword dates; inspect every generated grid for clue quality, connected entries, valid numbering, and answer correctness; verify date-specific persistence.
- [ ] Play complete Spades matches, including bidding, legal follow-suit play, trump handling, scoring, bags, and match completion.
- [ ] Play complete Klondike games with Draw 1 and Draw 3; verify stock recycling, tableau runs, empty columns, foundations, undo/hint behavior if present, and persistence.
- [ ] Check back navigation, rotation, process death, accessibility labels, text scaling, contrast, and touch target sizes.
- [ ] Fix crashes, broken controls, placeholder screens, and misleading controls.

## Release engineering
- [ ] Choose the final application name, launcher icon, screenshots, and store listing.
- [ ] Set final version name and monotonically increasing version code.
- [ ] Configure a protected Android release-signing key; store signing credentials securely, never in Git.
- [ ] Build and verify a signed release APK/AAB; test installation and upgrade from the prior release.
- [ ] Keep debug and release artifacts clearly distinguished.
- [ ] Review dependencies, licenses, and third-party notices.
- [ ] Confirm target SDK and Google Play policy requirements at release time.

## Privacy and store compliance
- [ ] Host the privacy policy at a stable public URL and verify that it matches the actual shipped app.
- [ ] Complete the Play Console Data safety form and content rating questionnaire accurately.
- [ ] Confirm whether Android backup behavior matches the privacy disclosures.
- [ ] Provide a support/contact route and review process for public bug reports.

## Final sign-off
- [ ] All CI checks pass on the exact release commit.
- [ ] Manual device test results are recorded.
- [ ] No known release-blocking bugs remain.
- [ ] Release notes and rollback plan are ready.
