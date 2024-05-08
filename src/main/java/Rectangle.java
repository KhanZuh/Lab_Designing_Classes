public class Rectangle {
    //    Properties
    private int length;
    private int width;

    //    constructor
    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;

    }

    // methods

    public int area() {
        return this.length * this.width;
    }

    // renamed isRectangle to isSquare for readability
    public boolean isSquare () {
        if(this.length == this.width) {
            return true;
        } else return false;
        // or do this:
         // return this.length == this.width; //(logical operators --> READ UP)
    }
}
