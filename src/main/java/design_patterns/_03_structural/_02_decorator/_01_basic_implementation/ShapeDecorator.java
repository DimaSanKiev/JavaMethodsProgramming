package design_patterns._03_structural._02_decorator._01_basic_implementation;

/**
 * Created by carmichael on 2016-03-12.
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
