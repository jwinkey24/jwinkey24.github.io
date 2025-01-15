import javax.swing.JOptionPane;

public class AreaCalculator {
    public static void main(String[] args) {
        String[] shapes = {"Circle", "Rectangle", "Triangle"};
        
        String selectedShape = (String) JOptionPane.showInputDialog(
            null,
            "Select a shape to calculate area:",
            "Area Calculator",
            JOptionPane.QUESTION_MESSAGE,
            null,
            shapes,
            shapes[0]
        );
        
        if (selectedShape != null) {
            switch (selectedShape) {
                case "Circle":
                    calculateCircleArea();
                    break;
                case "Rectangle":
                    calculateRectangleArea();
                    break;
                case "Triangle":
                    calculateTriangleArea();
                    break;
            }
        }
    }
    
    private static void calculateCircleArea() {
        String radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle:");
        try {
            double radius = Double.parseDouble(radiusStr);
            double area = Math.PI * radius * radius;
            JOptionPane.showMessageDialog(null,
                String.format("The area of the circle is: %.2f square units", area));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
        }
    }
    
    private static void calculateRectangleArea() {
        String lengthStr = JOptionPane.showInputDialog("Enter the length of the rectangle:");
        String widthStr = JOptionPane.showInputDialog("Enter the width of the rectangle:");
        try {
            double length = Double.parseDouble(lengthStr);
            double width = Double.parseDouble(widthStr);
            double area = length * width;
            JOptionPane.showMessageDialog(null,
                String.format("The area of the rectangle is: %.2f square units", area));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers!");
        }
    }
    
    private static void calculateTriangleArea() {
        String baseStr = JOptionPane.showInputDialog("Enter the base of the triangle:");
        String heightStr = JOptionPane.showInputDialog("Enter the height of the triangle:");
        try {
            double base = Double.parseDouble(baseStr);
            double height = Double.parseDouble(heightStr);
            double area = 0.5 * base * height;
            JOptionPane.showMessageDialog(null,
                String.format("The area of the triangle is: %.2f square units", area));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers!");
        }
    }
}
