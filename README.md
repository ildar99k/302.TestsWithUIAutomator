[![Build Status](https://travis-ci.org/k0shk0sh/FastHub.svg?branch=master)](https://travis-ci.org/k0shk0sh/FastHub)
[![Releases](https://img.shields.io/github/release/k0shk0sh/FastHub.svg)](https://github.com/k0shk0sh/FastHub/releases/latest) [![Slack](https://img.shields.io/badge/slack-join-e01563.svg)](http://rebrand.ly/fasthub)
[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

# [FastHub](https://github.com/k0shk0sh/FastHub/tree/master)

Yet another **open-source** GitHub client app but unlike any other app, FastHub was built from scratch.  
<!--
[<img src="https://f-droid.org/badge/get-it-on.png"
      alt="Get it on F-Droid"
      height="80">](https://f-droid.org/repository/browse/?fdid=com.fastaccess.github)
-->
[<img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png"
      alt="Download from Google Play"
      height="80">](https://play.google.com/store/apps/details?id=com.fastaccess.github)
[<img src="https://github.com/k0shk0sh/FastHub/raw/master/.github/assets/direct-apk-download.png"
      alt="Direct apk download"
      height="80">](https://github.com/k0shk0sh/FastHub/releases/latest)

## Features  
- **App**
  - Three login types (Basic Auth), (Access Token) or via (OAuth)
  - Multiple Accounts
  - Enterprise Accounts
  - Themes mode
  - Offline-mode
  - Markdown and code highlighting support
  - Notifications overview and "Mark all as read"
  - Search Users/Orgs, Repos, Issues/PRs & Code.
  - FastHub & GitHub Pinned Repos
  - Trending
  - Wiki
  - Projects
- **Repositories**
  - Browse & Read Wiki
  - Edit, Create & Delete files (commit)
  - Edit, Create & Delete files (Project Columns Cards)
  - Search Repos
  - Browse and search Repos
  - See your public, private and forked Repos
  - Filter Branches and Commits
  - Watch, star and fork Repos
  - Download releases, files and branches
- **Issues and Pull Requests**
  - Search Issues/PRs
  - Filter Issues/PRs
  - Long click to peak Issues/PRs & add comments otg.
  - Open/close Issues/PRs
  - Comment on Issues/PRs
  - Manage Issue/PR comments
  - React to comments with reactions
  - Edit Issues/PRs
  - Lock/unlock conversation in Issues/PRs
  - Assign people and add Labels and Milestones to Issues/PRs
  - Manage Milestones
  - Merge PRs
  - PRs reviews (reply, react with emojies, delete & edit comment)
  - PRs request review changes/approve & comment.
  - PRs statuses
- **Commits and Gists**
  - Search Code/Gists
  - View Gists and their files
  - Comment on Commits/Gists
  - Manage Commit/Gist comments
  - Create/Delete Gists
  - Edit Gist & Gist Files
  - React to Commit comments with reactions
  - Comment on line number in Files/Code changes.
- **Organisations**
    - Overview
    - Feeds
    - Teams & Teams repos
    - Repos
- **Users**
  - GitHub Pinned Repos 
  - Follow/Unfollow users
  - View user feeds
  - Contribution graph.
  - Search Users, Repos, Issues,Pull Requests and Code
- _**Much more...**_
  - _FastHub is actively developed. More features will come!_

## Specs / Open-source libraries:

- Minimum **SDK 21**, _but AppCompat is used all the way ;-)_
- [**Kotlin**](https://github.com/JetBrains/kotlin) all new modules starting from 2.5.3 will be written in **#Kotlin**.
- **MVP**-architecture: [**ThirtyInch**](https://github.com/grandcentrix/ThirtyInch) because its ThirtyInch.
- [**RxJava2**](https://github.com/ReactiveX/RxJava) & [**RxAndroid**](https://github.com/ReactiveX/RxAndroid) for Retrofit & background threads
- [**Retrofit**](https://github.com/square/retrofit) for constructing the REST API
- [**Requery**](https://github.com/requery/requery/) for offline-mode
- [**Stream API**](https://github.com/aNNiMON/Lightweight-Stream-API) for dealing with `Collections`
- [**ButterKnife**](https://github.com/JakeWharton/butterknife) for view binding
- [**Android State**](https://github.com/evernote/android-state) for saving instance states
- [**Lombok**](https://projectlombok.org/) for getters and setters
- [**Material-BottomNavigation**](https://github.com/sephiroth74/Material-BottomNavigation) for `BottomBar` tabs
- [**Glide**](https://github.com/bumptech/glide) for loading images
- [**commonmark**](https://github.com/atlassian/commonmark-java) for _Markdown_ conversion to html
- [**Toasty**](https://github.com/GrenderG/Toasty) for displaying error/success messages
- [**ShapedImageView**](https://github.com/gavinliu/ShapedImageView) for round avatars
- [**Material-About-Library**](https://github.com/daniel-stoneuk/material-about-library) for the about screen
- [**Fabric**](https://fabric.io/kits/android/crashlytics) analytics & crash reporting.
- [**Lottie**](https://github.com/airbnb/lottie-android) for animations
- **Android Support Libraries**, the almighty ;-)

## License

> Copyright (C) 2017 Kosh.  
> Licensed under the [GPL-3.0](https://www.gnu.org/licenses/gpl.html) license.  
> (See the [LICENSE](https://github.com/k0shk0sh/FastHub/blob/master/LICENSE) file for the whole license text.)