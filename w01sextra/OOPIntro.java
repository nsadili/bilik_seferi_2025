class OOPIntro {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(3);
        p1.setY(5);

        System.out.println(p1.toString());
        p1.translate(2, -2);
        System.out.println(p1.toString());
    }
}

class Point {
    float x; // field
    float y; // field

    // getter or accessor methods
    float getX() {
        return x;
    }

    float getY() {
        return y;
    }

    // setter or modifier
    void setX(float newX) {
        x = newX;
    }

    void setY(float newY) {
        y = newY;
    }

    void translate(float dX, float dY) {
        x += dX;
        y += dY;
    }

    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }
}

// Perviz, Gulmira, Muraz, Nuraddin, Arzu

// name
// age
// height
// weigth
// colorOfEyes
// gender

// functionality
// walk()
// eat()
// speak()
// breath()
// jump()