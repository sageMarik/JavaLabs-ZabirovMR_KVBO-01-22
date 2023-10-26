package Circle;

public class Circle {
    double radius;
    double diametr;

    // Init
    Circle(double radius) {
        this.radius = radius;
        this.diametr = this.radius * 2;
        System.out.println("[+] Circle object was created");
    }

    // Radius getter
    double get_radius() {
        return this.radius;
    }

    // Radius setter
    void set_radius(double radius) {
        this.radius = radius;
        this.diametr = this.radius * 2;
        System.out.println("[+] Radius " + this.radius + " was setted");
    }

    // Area getter
    double get_area() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Circle radius: " + this.radius + ", diametr: " + this.diametr;
    }
}
