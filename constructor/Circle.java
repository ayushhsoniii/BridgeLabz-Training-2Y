class Circle{
    double radius;
    Circle(){
        this(1.0);
    }
    Circle(double r){
        this.radius = r;
    }
    double getArea(){
        return Math.PI * radius * radius;
    }
    void display(){
        System.out.println("Area of the circle: " + getArea());
    }
}