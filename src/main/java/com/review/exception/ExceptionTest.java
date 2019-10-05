package com.review.exception;

public class ExceptionTest {
    public static void main(String[] args)throws CircleException {
//        int arr[]= new int[5];
//        arr[7]=10;
        /*try {
            arr[7]=5;
        } catch (ArrayIndexOutOfBoundsException e 接收Throwable的subclass產生的object) {
            System.out.println("Exception:"+e);
        }*/
        Circle test=new Circle();
        test.setRadius(0);
        test.show();
        System.out.println("Exception test");
    }
    static class CircleException extends Exception{

    }
    static class Circle{
        private double radius;
        public void setRadius(double r)throws CircleException{
            try {
                if(r<=0)
                    throw new CircleException();
                else
                    this.radius=r;
            } catch (CircleException e) {
                System.out.println(e);
            }
        }
        public void show(){
            System.out.println("Area="+Math.PI*this.radius*this.radius);
        }
    }
}
