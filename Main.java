import java.util.*;
public class Main{
    public static void main(String[] args){
        LinkedList<String> colors=new LinkedList<>();
//TO ADD ELEMENTS IN LINKED LIST USING"add()"
          colors.add("white");
          colors.add("blue");
          colors.add("green");
          colors.add("red");
          colors.add("grey");
          //TO ADD AN PARTICULAR ELEMENT IN FIRST POSITION OF LINKEDLIST USING addFirst()
          colors.addFirst("black");
          System.out.println(colors);
        //TO ADD AN PARTICULAR ELEMENT IN LAST POSITION OF LINKEDLIST USING addLast()
        colors.addLast("brown");
        System.out.println(colors);
        //TO GET THE FIRST POSITION ELEMENT OF THE LINKEDLIST USING getFirst()
        System.out.println(colors.getFirst());
        //TO GET THE LAST POSITION ELEMENT OF THE LINKEDLIST USING getLast()
        System.out.println(colors.getLast());
        //TO REMOVE THE FIRST ELEMENT IN THE LINKEDLIST USING removeFirst()
        colors.removeFirst();
        System.out.println(colors);
        //TO REMOVE THE LAST ELEMENT IN THE LINKEDLIST USING removeLast()
        colors.removeLast();
        System.out.println(colors);
        //TO GETTHE SIZE OF THE LINKEDLIST USING size()
        System.out.println(colors.size());
        //TO CHECK PARTICULAR ELEMENT USING contains()
        if(colors.contains("brown")){
            System.out.println("yes");
        }
        else {
            System.out.println("no");

        }
        //ACCESSING EACH ELEMENTS USING for each loop
        for(String val:colors){
            System.out.print(val+" ");

        }
        //ACCESSING EACH ELEMENTS USING for loop
        for(int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }

    }
}