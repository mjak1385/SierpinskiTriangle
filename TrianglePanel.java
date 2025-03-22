import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The TrianglePanel class is a Swing GUI designed to display a Sierpinski triangle.
 * It extends the JPanel class to provide a dedicated area and painting the traingles.
 * The class encapsulates the logic for drawing the Sierpinski triangle based on gvien parameters
 * such as degree and colors.
 * 
 * @author (Mohammadjavad Aghaeipour)
 * @version (15/12/2023)
 */

// Panel class for drawing the Sierpinski Triangle
class TrianglePanel extends JPanel {
    private Color color1;  // First color for the triangle
    private Color color2;  // Second color for the triangle
    private int degree;    // Depth of the recursive function call of the Sierpinski Triangle

    // Constructor to initialize colors and degree
    public TrianglePanel(Color color1, Color color2, int degree) {
        this.color1 = color1;
        this.color2 = color2;
        this.degree = degree;
    }

    // Setter method to update the degree
    public void setDegree(int degree) {
        this.degree = degree;
    }

    // Setter method to update both colors
    public void setColors(Color color1, Color color2) {
        this.color1 = color1;
        this.color2 = color2;
    }

    // Override paintComponent to draw the Sierpinski Triangle
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawSierpinski(g, degree, color1, color2, getWidth() / 2, getHeight() / 2, getWidth() / 2);
    }

    // Recursive method to draw the Sierpinski Triangle
    private void drawSierpinski(Graphics g, int degree, Color color1, Color color2, int x, int y, int size) {
        if (degree == 0) {
            // Base case: Draw a triangle at the specified position with the intermediate color
            int[] xPoints = {x - size / 2, x + size / 2, x};
            int[] yPoints = {y + size / 2, y + size / 2, y - size / 2};
            Polygon triangle = new Polygon(xPoints, yPoints, 3);
            g.setColor(getIntermediateColor(color1, color2, degree));
            g.fillPolygon(triangle);
        } else {
            // Draw the main triangle
            int newSize = size / 2;
            int[] xPoints = {x - newSize, x + newSize, x};
            int[] yPoints = {y + newSize, y + newSize, y - newSize};
            Polygon triangle = new Polygon(xPoints, yPoints, 3);
            g.setColor(getIntermediateColor(color1, color2, degree));
            g.fillPolygon(triangle);

            // Recursive calls for the three sub-triangles
            drawSierpinski(g, degree - 1, color1, color2, x - newSize / 2, y + newSize / 2, newSize);
            drawSierpinski(g, degree - 1, color1, color2, x + newSize / 2, y + newSize / 2, newSize);
            drawSierpinski(g, degree - 1, color1, color2, x, y - newSize / 2, newSize);
        }
    }

    // Method to calculate the intermediate color based on the degree
    private Color getIntermediateColor(Color color1, Color color2, int degree) {
        float ratio = (float) degree / this.degree;
        int red = (int) (color1.getRed() * (1 - ratio) + color2.getRed() * ratio);
        int green = (int) (color1.getGreen() * (1 - ratio) + color2.getGreen() * ratio);
        int blue = (int) (color1.getBlue() * (1 - ratio) + color2.getBlue() * ratio);
        return new Color(red, green, blue);
    }
}