// A TwistCap is an interface that defines the behavior of a twist cap.
// It's an abstract thing that can be implemented anywhere, not in a hierarchical way.
public interface TwistCap {

    // Default attributes and methods.
    // All variables in an interface are public, static, and final. (Therefore they need to be initialized).
    String capDescription = "Twist Cap";

    // All methods in an interface are assumed to be abstract.
    // Which means methods cannot have bodies in interfaces, they can only be defined.
    // It is up to the inheriting class to make use of the class.
    // What's important is that all TwistCap bottles need to have that method.
    void twistOffCap();
    void twistOnCap();
}
