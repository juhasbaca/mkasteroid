#!/bin/bash

echo "======================================"
echo "Android To-Do App APK Builder"
echo "======================================"
echo ""

# Check if Docker is available
if command -v docker &> /dev/null; then
    echo "Docker found! Building APK using Docker..."
    echo ""

    # Build Docker image
    docker build -t todo-app-builder .

    # Run container and build APK
    docker run --rm -v "$(pwd):/app" todo-app-builder

    echo ""
    echo "======================================"
    echo "APK built successfully!"
    echo "Location: app/build/outputs/apk/debug/app-debug.apk"
    echo "======================================"

else
    echo "Docker not found. Please build manually:"
    echo ""
    echo "Prerequisites:"
    echo "1. Install Java JDK 17 or higher"
    echo "2. Install Android SDK (https://developer.android.com/studio)"
    echo "3. Set ANDROID_HOME environment variable"
    echo ""
    echo "Build commands:"
    echo "  ./gradlew assembleDebug"
    echo ""
    echo "Or use Android Studio:"
    echo "1. Open this project in Android Studio"
    echo "2. Go to Build > Build Bundle(s) / APK(s) > Build APK(s)"
    echo ""
    echo "======================================"
fi
