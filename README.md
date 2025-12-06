# 🚀 ASTEROIDS - Retro Space Shooter

**Version: 1.2.0**

A modern recreation of the classic Asteroids arcade game with stunning visual effects, power-ups, and multiple difficulty levels. Built with vanilla JavaScript and HTML5 Canvas.

## ✨ Features

### Core Gameplay
- **Classic Asteroids mechanics** with modern enhancements
- **Four difficulty levels**: Easy, Medium, Hard, Impossible
- **Wave-based progression** with increasing challenge
- **UFO enemies** that hunt the player and drop power-ups (multiple UFOs in Impossible mode!)
- **Combo system** with multipliers up to 10x

### Power-Ups
- 🛡️ **Shield** - Absorbs one hit
- 🔫 **Triple Shot** - Fire three bullets at once (10s duration)
- ⚡ **Rapid Fire** - Increased fire rate (10s duration)

### Visual Effects
- 🎨 **Enhanced thrust particles** with 5 color variations
- ⭐ **Border glow effects** on special events (UFO kills, combos, wave completion)
- 🌟 **Impact sparks** at bullet-asteroid collision points
- 💫 **Power-up spawn animations** with teleportation effects
- 🔊 **Mute indicator** with fade animations
- 📊 **Visual combo multiplier** near ship
- 🎵 **Shoot cooldown indicator** with pulsing ring

### Game Features
- **High score tracking** (localStorage)
- **Statistics display** (accuracy, asteroids destroyed, UFOs killed)
- **Smooth animations** with delta time
- **Screen shake** on explosions
- **Particle effects** throughout
- **Sound effects** (procedurally generated)
- **Arrow key navigation** for menus

## 🎮 Controls

### In-Game
- **← →** - Rotate ship
- **↑** - Thrust
- **Space** - Shoot
- **P** - Pause
- **M** - Toggle mute
- **H** - Help screen

### Menu Navigation
- **↑ ↓** - Select difficulty
- **1/E** - Easy difficulty
- **2/M** - Medium difficulty
- **3/H** - Hard difficulty
- **4/I** - Impossible difficulty
- **Enter** - Start game / Play again
- **Esc** - Return to main menu

## 🚀 How to Play

1. **Open `index.html`** in a modern web browser
2. **Select difficulty** using arrow keys or number keys
3. **Press Enter** to start
4. **Destroy asteroids** to earn points
5. **Watch for UFOs** - they drop power-ups!
6. **Build combos** by destroying enemies quickly (within 3 seconds)
7. **Complete waves** to progress and earn bonuses

## 🎯 Scoring

- Small asteroid: **100 points**
- Medium asteroid: **50 points**
- Large asteroid: **20 points**
- Small UFO: **200 points**
- Large UFO: **100 points**
- Wave completion: **Wave # × 500 bonus**
- Combo multiplier: **Up to 10x!**

## 🌟 Special Mechanics

### Combo System
- Destroy enemies within 3 seconds of each other to build combos
- Each consecutive kill increases your multiplier (max 10x)
- Combo breaks if 3 seconds pass without a kill
- Visual indicator shows your current multiplier above the ship
- Border glows purple/red for high combos (5+)

### Wave System
- Waves increase in difficulty with more asteroids
- Wave 1: 3 asteroids
- Wave 2-5: 3 + (wave - 1) asteroids
- Wave 6+: 7 + (wave - 6) × 2 asteroids (max 12)
- Screen border glows green when wave is completed

### UFO Behavior
- Spawns periodically during gameplay
- Small UFOs (Wave 3+) are faster and more accurate
- UFOs shoot at the player with varying accuracy based on difficulty
- Screen border glows pink/red when UFO is destroyed

### Difficulty Levels
- **Easy**: Slower asteroids, less accurate UFOs, 4 lives, 30% power-up drop rate
- **Medium**: Standard speed, balanced UFO accuracy, 3 lives, 20% power-up drop rate
- **Hard**: Fast asteroids, very accurate UFOs, 2 lives, 15% power-up drop rate, faster ship turning
- **Impossible**: 🔥 **THE ULTIMATE CHALLENGE** 🔥
  - 1.7x faster asteroids than standard
  - 1.3x more asteroids per wave
  - **2 UFOs active simultaneously!**
  - 90% UFO accuracy (very precise!)
  - UFOs spawn every 10-15 seconds
  - Only 2 lives - stay sharp!
  - 12% power-up drop rate
  - Faster ship turning speed (you'll need it!)

## 🛠️ Technical Details

### Built With
- Pure HTML5
- Vanilla JavaScript (ES6+)
- HTML5 Canvas API
- Web Audio API

### Performance
- Optimized collision detection with safe array handling
- Particle limit: 500 max
- Asteroid limit: 100 max
- UFO bullet limit: 50 max
- Try-catch error handling to prevent crashes
- Delta time for smooth 60 FPS gameplay

### Browser Compatibility
- Chrome/Edge (recommended)
- Firefox
- Safari
- Any modern browser with Canvas and Web Audio support

## 🎨 Visual Design

- **Retro-futuristic aesthetic** with neon colors
- **Particle systems** for explosions and thrust
- **Glow effects** and shadows for depth
- **Smooth animations** and transitions
- **Dynamic visual feedback** for all game events

## 📱 Responsive

The game automatically scales to fit your screen while maintaining aspect ratio (max 1200×800).

## 🔧 Development

### File Structure
```
mkasteroid/
├── index.html          # Main game file (single-file architecture)
└── README.md          # This file
```

### Code Organization
- Game configuration and constants
- Game state management
- Utility functions
- Audio system
- Particle system
- Screen effects
- Game entities (Ship, Bullet, Asteroid, UFO, Powerup)
- Background rendering
- Collision detection
- Game initialization
- Update/render loops
- Input handling

### Safety Features
- Array modification safety (no splice during forEach)
- Object count limits to prevent memory issues
- Error boundaries with try-catch
- Respawn retry limits
- Off-screen bullet removal

## 🐛 Known Issues

- None currently! The game has been thoroughly debugged and optimized.

## 📝 Version History

### Current Version
- ✅ Fixed game freeze issues
- ✅ Added 7 epic visual improvements
- ✅ Redesigned ship graphics
- ✅ Added arrow key navigation
- ✅ Implemented clickable social media links
- ✅ Added comprehensive safety measures

### Previous Fixes
- Fixed collision detection bug causing freezes
- Fixed projectile wrapping (now disappear off-screen)
- Added particle and object limits
- Implemented error handling throughout

## 👨‍💻 Credits

Created using **Claude Code (vibe coding)** by **Marcin Krupiński**

- [TikTok](https://www.tiktok.com/@ai.marcin)
- [Instagram](https://www.instagram.com/krupinskiai)

## 📄 License

This is a portfolio project. Feel free to learn from the code, but please provide attribution if you use it.

## 🎮 Tips for High Scores

1. **Master the combo system** - Keep killing within 3 seconds
2. **Prioritize UFOs** - They give big points and drop power-ups
3. **Use power-ups strategically** - Shield before risky moves, rapid fire for waves
4. **Break large asteroids early** - Don't let them split near you
5. **Keep moving** - Never stop, the screen wraps around
6. **Practice on Easy** - Learn the mechanics before tackling Hard mode

## 🚀 Future Enhancements (Potential)

- Leaderboard system
- Additional power-ups
- Boss fights
- Multiple ship types
- Achievements system
- Mobile touch controls
- Multiplayer mode

## 📋 Changelog

### v1.1.0 (Current)
- ⚡ **Performance optimizations** - Removed expensive shadowBlur effects from frequently drawn objects
- 🎯 **Improved rendering** - Cached time calculations for better frame rate
- 🔧 **Reduced particle creation** - Optimized thrust particles (30% spawn rate)
- 📊 **Version display** - Added version number to start and help screens
- 🏆 **Stable performance** - Game maintains smooth FPS during long play sessions

### v1.0.0
- 🎮 Initial release with core gameplay
- 🐛 Fixed critical collision detection bugs causing game freezes
- 🎨 Added 7 visual improvements (combo indicators, impact sparks, border glow, etc.)
- 📖 Added comprehensive in-game help screen (H key)
- 🚀 Arrow key navigation for difficulty selection
- 🎨 Redesigned ship with detailed graphics
- 🔗 Added social media links
- 💾 High score tracking with localStorage

---

**Enjoy the game! 🎮✨**

Press **H** in-game for help!
