# Android To-Do App

A simple and clean Android application for managing your daily tasks.

## Features

- **Add Tasks**: Quickly add new tasks to your list
- **Mark as Complete**: Check off tasks with a strikethrough effect
- **Delete Tasks**: Remove tasks you no longer need
- **Clean UI**: Simple and intuitive Material Design interface

## Screenshots

The app features:
- A text input field to enter new tasks
- An "Add Task" button
- A scrollable list of tasks
- Checkboxes to mark tasks as complete
- Delete buttons for each task

## Building the APK

For detailed build instructions, see [BUILD_INSTRUCTIONS.md](BUILD_INSTRUCTIONS.md)

### Quick Start

#### Using Docker:
```bash
chmod +x build-apk.sh
./build-apk.sh
```

#### Using Gradle:
```bash
./gradlew assembleDebug
```

The APK will be located at: `app/build/outputs/apk/debug/app-debug.apk`

## Installation

1. Transfer the APK to your Android device
2. Enable "Install from Unknown Sources" in your device settings
3. Tap the APK file to install
4. Open the To-Do App and start managing your tasks!

## Technical Details

- **Language**: Java
- **Minimum SDK**: Android 5.0 (API 21)
- **Target SDK**: Android 13 (API 33)
- **UI Framework**: Android Views with Material Components
- **Architecture**: Simple MVC pattern

## Project Structure

```
app/src/main/
├── java/com/example/todoapp/
│   ├── MainActivity.java    - Main screen logic
│   ├── TodoTask.java        - Task data model
│   └── TaskAdapter.java     - List view adapter
├── res/
│   ├── layout/
│   │   ├── activity_main.xml   - Main screen layout
│   │   └── task_item.xml       - Individual task layout
│   └── values/
│       ├── strings.xml         - App strings
│       ├── colors.xml          - Color definitions
│       └── styles.xml          - App theme
└── AndroidManifest.xml      - App configuration
```

## Requirements for Building

- Java JDK 17 or higher
- Android SDK with:
  - Platform SDK 33
  - Build Tools 33.0.0
- Gradle 8.1 (handled by wrapper)

## Troubleshooting

If you encounter issues building the APK:

1. **Missing Android SDK**: Install Android Studio or download the command-line tools
2. **ANDROID_HOME not set**: Set the environment variable to your SDK location
3. **Gradle issues**: Run `./gradlew clean` and try again
4. **Docker issues**: Ensure Docker daemon is running

For more help, see the detailed [BUILD_INSTRUCTIONS.md](BUILD_INSTRUCTIONS.md)

## License

This project is provided as-is for educational purposes.

## Future Enhancements

Potential features for future versions:
- Task persistence (save tasks between app restarts)
- Task categories or tags
- Due dates and reminders
- Dark mode theme
- Task priority levels
- Search and filter functionality
