import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Driver class is the main controller for the Sierpinski Triangle Swing GUI.
 * It implements the ActionListener interface to manage button events based on the user interactions.
 * The class initializes buttons, text fields, and a custom panel for paiting the Sierpinski triangle. 
 * It allows users to set the degree of the triangle and choose colors. 
 *
 * @author (Mohammadjavad Aghaeipour)
 * @version (15/12/2023)
 */
class Driver implements ActionListener {
    private JFrame frame;
    private JTextField degreeField;
    private TrianglePanel trianglePanel;

    public Driver() {
        // Create the main JFrame
        frame = new JFrame();
        frame.setTitle("Sierpinski Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create text field for entering degree
        degreeField = new JTextField("Enter Degree");

        // Create buttons for drawing and selecting colors
        JButton drawButton = new JButton("Draw");
        JButton colorButton = new JButton("Select Colors");

        // Create the TrianglePanel with default colors and degree
        trianglePanel = new TrianglePanel(Color.BLUE, Color.RED, 1);

        // ActionListener for degreeField
        degreeField.addActionListener(this);
        
        // ActionListener for drawButton
        drawButton.addActionListener(this);

        // ActionListener for colorButton using Override 
        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseColors(); // call chooseColors() to select colors using JColorChooser
            }
        });

        // Create a control panel to hold UI components
        JPanel controlPanel = new JPanel();
        controlPanel.add(degreeField);
        controlPanel.add(drawButton);
        controlPanel.add(colorButton);

        // Add the control panel and the TrianglePanel to the frame
        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(trianglePanel, BorderLayout.CENTER);

        // Set frame size and make it visible
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Method to choose colors using JColorChooser
    private void chooseColors() {
        Color color1 = JColorChooser.showDialog(frame, "Choose Color 1", trianglePanel.getForeground());
        Color color2 = JColorChooser.showDialog(frame, "Choose Color 2", trianglePanel.getForeground());

        // If colors are selected, update the TrianglePanel and repaint
        if (color1 != null && color2 != null) {
            trianglePanel.setColors(color1, color2);
            trianglePanel.repaint();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse the degree from the text field
            int degree = Integer.parseInt(degreeField.getText());
            
            // Set the new degree for the SierpinskiTrianglePanel and repaint
            trianglePanel.setDegree(degree);
            trianglePanel.repaint();
        } catch (NumberFormatException ex) {
            // Show an error message if the input is a negative integer           
            JOptionPane.showMessageDialog(frame,"Enter a positive integer or 0 for the degree.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args)
    {
        Driver app = new Driver(); // create our application
    }
}

