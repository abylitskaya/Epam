import org.omg.CORBA.COMM_FAILURE;

import static java.lang.System.exit;

public class Complex {
    private final double re;
    private final double im;

    public Complex(double real, double imag) {
        this.re = real;
        this.im = imag;
    }

    public Complex(double real) {
        this.re = real;
        this.im = 0;
    }

    public Complex(String c) {
        String complex = "[0-9]+(\\.[0-9][0-9]?)?.[0-9]+(\\.[0-9][0-9]?)?i";
        double a = 0, b = 0;

        if (c.matches(complex)) {
            String[] parts = c.replace("i", "").split("[-+]");

            if (parts.length == 2) {
                a = Double.parseDouble(parts[0]);
                b = Double.parseDouble(parts[1]);
            } else {
                System.out.println("Invalid number!");
                exit(1);
            }
        } else {
            a = Double.parseDouble(c);
            b = 0;
        }

        this.re = a;
        this.im = b;
    }

    public double re() { return re; }
    public double im() { return im; }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

    public Complex plus(Complex b) {
        Complex a = this;
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex(real, imag);
    }

    public Complex minus(Complex b) {
        Complex a = this;
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex(real, imag);
    }

    public Complex times(Complex b) {
        Complex a = this;
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Complex(real, imag);
    }

    public Complex degree(Complex b) {
        Complex a = this;
        if (a.im() == 0 && b.im() == 0) {
            return new Complex(Math.pow(a.re(), b.re()));
        } else {
            System.out.println("Not supported yet!");
            exit(1);
        }
        return new Complex(0);
    }

    public Complex root(Complex b) {
        Complex a = this;
        if (a.im() == 0 && b.im() == 0) {
            return new Complex(Math.pow(b.re(), 1 / a.re()));
        } else {
            System.out.println("Not supported yet!");
            exit(1);
        }
        return new Complex(0);
    }

    public Complex remainder(Complex B) {
        Complex A = this;
        if (A.im() == 0 && B.im() == 0) {
            double a = A.re(), b = B.re();
            double remainder = a;
            while (a > b) {
                a = a - b;
            }
            return new Complex(remainder);
        } else {
            System.out.println("Not supported yet!");
            exit(1);
        }
        return new Complex(0);
    }

    public Complex scale(double alpha) {
        return new Complex(alpha * re, alpha * im);
    }

    public Complex reciprocal() {
        double scale = re*re + im*im;
        return new Complex(re / scale, -im / scale);
    }

    public Complex divides(Complex b) {
        Complex a = this;
        return a.times(b.reciprocal());
    }

    public boolean equals(Object x) {
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Complex that = (Complex) x;
        return (this.re == that.re) && (this.im == that.im);
    }

}