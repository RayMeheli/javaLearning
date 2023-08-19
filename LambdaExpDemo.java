package Java8;

public class LambdaExpDemo {
    public static void main(String args[]){
//        Drawable drawable=new Drawable() {
//
//            @Override
//            public void draw(int width){
//
//                System.out.println("drawing "+width );
//            }
//        };
//        drawable.draw(5);

        Drawable drawable1 = (width) ->{ System.out.println("drawing "+width );
    return width;
        };
       int width= drawable1.draw(10);
        System.out.println(">>>>>>>>>>>>>>>>>> " + width);
    }




}
