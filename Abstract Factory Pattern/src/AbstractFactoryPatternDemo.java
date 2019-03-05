public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get normal shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of Shape Rounded Rectangle
        Shape rshape = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        rshape.draw();
        //get an object of Shape Rounded Square
        Shape rSshape = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        rSshape.draw();
        // get rounded shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        // get an object of shape rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape3.draw();
        //get an object of shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of shape square
        shape4.draw();

    }
}
