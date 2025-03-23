Here’s a visually appealing and detailed `README.md` for your **Sierpinski Triangle** repository. I’ve included emojis and structured the content to make it engaging and informative:

---

# 🎨 Sierpinski Triangle Generator 🖼️

This repository contains a Java implementation of a **Sierpinski Triangle** generator using **Java Swing**. The program allows users to visualize the fractal by specifying the recursion depth (degree) and choosing custom colors for the triangle. It’s a great example of combining **recursive algorithms** with **graphical user interfaces (GUIs)**.

---

## 🎯 Overview

The **Sierpinski Triangle** is a famous fractal pattern that demonstrates **recursion** and **self-similarity**. This Java program provides an interactive GUI where users can:
- Set the recursion depth (degree) of the triangle.
- Choose custom colors for the triangle.
- Visualize the fractal in real-time.

The program is built using **Java Swing** for the GUI and implements a recursive algorithm to draw the triangle.

---

## ✨ Features
- **Customizable Recursion Depth**: Set the degree of the Sierpinski Triangle.
- **Color Customization**: Choose two colors to create a gradient effect.
- **Interactive GUI**: Built using Java Swing for a seamless user experience.
- **Real-Time Rendering**: The triangle updates dynamically based on user input.

---

## 🛠️ How It Works

The program consists of two main classes:
1. **`Driver`**: Manages the GUI and user interactions.
   - Initializes buttons, text fields, and the drawing panel.
   - Handles user input for degree and color selection.
2. **`TrianglePanel`**: Handles the drawing of the Sierpinski Triangle.
   - Uses recursion to draw the fractal.
   - Implements color interpolation for a gradient effect.

---

## 🚀 Getting Started

### 📋 Prerequisites
- **Java Development Kit (JDK) 8 or later**.
- An IDE (e.g., IntelliJ, Eclipse) or a terminal to run the program.

### 📥 Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/mjak1385/SierpinskiTriangle.git
   ```
2. Navigate to the project directory:
   ```bash
   cd SierpinskiTriangle
   ```

---

## 🕹️ Running the Program
1. Compile the Java files:
   ```bash
   javac *.java
   ```
2. Run the program:
   ```bash
   java Driver
   ```
3. Use the GUI to:
   - Enter the recursion depth (degree) in the text field.
   - Click **"Draw"** to render the triangle.
   - Click **"Select Colors"** to choose custom colors.

---

## 🗂️ Project Structure

Here’s an overview of the Java files in the repository:

### 🎮 `Driver.java`
- Manages the GUI and user interactions.
- Handles button clicks for drawing and color selection.

### 🎨 `TrianglePanel.java`
- Handles the drawing of the Sierpinski Triangle.
- Uses recursion to generate the fractal.
- Implements color interpolation for a gradient effect.

---

## 🖼️ Example Output

Here’s what the program looks like in action:

1. **Default View**:
   - Degree: `1`
   - Colors: Blue and Red.

2. **Custom View**:
   - Degree: `4`
   - Colors: Green and Yellow.

---

## 🤝 Contributing

Contributions are welcome! If you'd like to contribute, please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes.
4. Submit a pull request.

---

Enjoy exploring the beauty of fractals! 🎉 If you have any questions or suggestions, feel free to open an issue or reach out to the contributors. 😊
