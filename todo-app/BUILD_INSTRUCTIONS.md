# Android To-Do App - Build Instructions

## Overview
This is a simple Android To-Do list application that allows users to:
- Add new tasks
- Mark tasks as complete (with strikethrough)
- Delete tasks

## Building the APK

### Option 1: Using Docker (Recommended)

If you have Docker installed, simply run:

```bash
chmod +x build-apk.sh
./build-apk.sh
```

The APK will be generated at: `app/build/outputs/apk/debug/app-debug.apk`

### Option 2: Using Gradle Wrapper (Manual)

#### Prerequisites:
1. **Java JDK 17 or higher**
   - Download from: https://adoptium.net/
   - Set JAVA_HOME environment variable

2. **Android SDK**
   - Download Android Studio: https://developer.android.com/studio
   - Or download Command Line Tools: https://developer.android.com/studio#command-tools
   - Set ANDROID_HOME environment variable
   - Install required packages:
     ```bash
     sdkmanager "platform-tools" "platforms;android-33" "build-tools;33.0.0"
     ```

#### Build Steps:

1. Open terminal in the `todo-app` directory

2. Make gradlew executable (Linux/Mac):
   ```bash
   chmod +x gradlew
   ```

3. Build the APK:
   ```bash
   ./gradlew assembleDebug
   ```

   On Windows:
   ```cmd
   gradlew.bat assembleDebug
   ```

4. Find your APK at:
   ```
   app/build/outputs/apk/debug/app-debug.apk
   ```

### Option 3: Using Android Studio

1. Open Android Studio
2. Click "Open an Existing Project"
3. Navigate to the `todo-app` directory and open it
4. Wait for Gradle sync to complete
5. Go to **Build > Build Bundle(s) / APK(s) > Build APK(s)**
6. Once built, click "locate" to find your APK

## Installing the APK

### On Physical Device:
1. Enable "Install from Unknown Sources" in device settings
2. Transfer the APK to your device
3. Tap the APK file to install

### On Emulator:
1. Drag and drop the APK onto the emulator window
2. Or use: `adb install app-debug.apk`

## App Features

- **Add Task**: Type in the text field and click "Add Task"
- **Complete Task**: Tap the checkbox to mark as complete (strikethrough)
- **Delete Task**: Click the red "Delete" button to remove a task

## Troubleshooting

### Gradle build fails:
- Ensure ANDROID_HOME is set correctly
- Run: `./gradlew clean` then try building again
- Check that you have Android SDK Platform 33 installed

### Docker build fails:
- Ensure Docker daemon is running
- Check internet connection for downloading dependencies

### APK won't install:
- Enable "Install from Unknown Sources" or "Install Unknown Apps"
- Ensure the APK is not corrupted (re-build if necessary)

## Project Structure

```
todo-app/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/todoapp/
│   │       │   ├── MainActivity.java       # Main activity
│   │       │   ├── TodoTask.java          # Task model
│   │       │   └── TaskAdapter.java       # List adapter
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   ├── activity_main.xml  # Main layout
│   │       │   │   └── task_item.xml      # Task item layout
│   │       │   └── values/
│   │       │       ├── strings.xml
│   │       │       ├── colors.xml
│   │       │       └── styles.xml
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## Requirements

- **Minimum SDK**: Android 5.0 (API 21)
- **Target SDK**: Android 13 (API 33)
- **Build Tools**: 33.0.0
- **Java**: 1.8

## License

This is a sample project for educational purposes.
