public class SingletonPatternDemo {
    public static void main(String[] args) {

        // illegal construct
        //compile time error: the constructor singleObject() is not visible
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
