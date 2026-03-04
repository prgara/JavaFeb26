package march03;

public class Main {

   static String x ;
    public static void main(String[] args) {
        int y;
        Entity entity = new Entity();
        entity.prod= "Chair";
        entity.price = 50;
        entity.display();
//        System.out.println(x);

        int[] demo = new int[3];
        demo[0] = 10; // 0
        demo[1] = 20; // 1
        demo[2] = 30;// 2
        System.out.println(demo.length);


        for(int i=0; i<=demo.length-1;i++){
            System.out.println(demo[i]);
        }

        String[] arr2 = new String[2];
        arr2[0] = "Hello";
        arr2[1] = "World";

        for (int ele : demo){
            System.out.println(ele + " ");
        }
        System.out.println();

        for(String ele  : arr2 ){
            System.out.print(ele + " ");
        }


        String[] arr = {"Hello","World","from","Array"};

        for (String ele: arr){
            System.out.println(ele);
        }



    }


}
