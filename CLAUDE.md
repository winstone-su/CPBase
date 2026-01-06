# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

CPBase (从平Android Base库) - An Android base library project. Contains AAR dependencies in `lib/` directory intended for JitPack publishing.

## Build Commands

```bash
# Build the project
./gradlew build
```

## Architecture

- Single module Android application (`app/`)
- Namespace: `com.cp.base`
- Min SDK 28, Target SDK 36
- Kotlin with JVM target 11
- Uses Gradle Version Catalog (`gradle/libs.versions.toml`)

## Dependencies

AAR files in `lib/` directory:
- `cpsdk.cpbase.v1.0.0.aar`
- `cpsdk.cpcomm.v1.0.2.9.aar`

These are intended to be published to JitPack for remote dependency usage.
