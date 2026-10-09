package sealedClass;

public sealed interface TwoDShape extends Shape permits Circle, Rectangle, Triangle {

}
