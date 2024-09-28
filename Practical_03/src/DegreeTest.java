class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am undergraduate");
    }
}

class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am a postgraduate");
    }
}

public class DegreeTest {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Undergraduate undergraduate = new Undergraduate(); // Fixed typo here
        Postgraduate postgraduate = new Postgraduate();

        degree.getDegree();
        undergraduate.getDegree();
        postgraduate.getDegree();
    }
}
