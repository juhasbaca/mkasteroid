#!/usr/bin/env python3
from PIL import Image, ImageDraw

# Define icon sizes for different densities
icon_sizes = {
    'mdpi': 48,
    'hdpi': 72,
    'xhdpi': 96,
    'xxhdpi': 144,
    'xxxhdpi': 192
}

# Create icons for each density
for density, size in icon_sizes.items():
    # Create a new image with a green background
    img = Image.new('RGB', (size, size), color='#3DDC84')
    draw = ImageDraw.Draw(img)

    # Draw a simple checkmark
    padding = size // 6
    line_width = max(2, size // 20)

    # Draw checkmark
    points = [
        (padding * 2, size // 2),
        (size // 2 - padding // 2, size - padding * 2),
        (size - padding, padding * 2)
    ]
    draw.line(points[:2], fill='white', width=line_width)
    draw.line(points[1:], fill='white', width=line_width)

    # Save for ic_launcher
    img.save(f'app/src/main/res/mipmap-{density}/ic_launcher.png')
    img.save(f'app/src/main/res/mipmap-{density}/ic_launcher_round.png')
    print(f'Created icons for {density}')

# Create the foreground icon (108x108)
img = Image.new('RGBA', (108, 108), color=(0, 0, 0, 0))
draw = ImageDraw.Draw(img)

# Draw a simple list icon
padding = 20
line_width = 6

# Draw three list items
for i in range(3):
    y = 30 + i * 25
    # Checkbox
    draw.rectangle([padding, y, padding + 15, y + 15], outline='white', width=3)
    # Line
    draw.line([(padding + 25, y + 7), (108 - padding, y + 7)], fill='white', width=4)

img.save('app/src/main/res/mipmap-xxxhdpi/ic_launcher_foreground.png')
print('Created foreground icon')
