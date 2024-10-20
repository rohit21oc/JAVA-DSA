package Arrays;

public class linearSearch {
    public static int linearSerch(int number[],int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number [] = {10,20,50,46,90,100};
        int key = 46;
        int index = linearSerch(number, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is at index "+ index);
        }

    }
}
