import java.util.Scanner;

class review1_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        int[] note = {500, 200, 100, 50, 20, 10, 5, 2, 1}; //cac to tien co menh gia khac nhau
        int[] count_note = new int[note.length]; //moi 1 phan tu trong array tuong ung voi so to tien voi menh gia tuong ung voi array note

        int i = 0; //index cho arrday note va count_note do ca 2 array co chung length
        while(amount > 0){ //cu tru amount di 1 so tien khi ma amount van con tien => lon hon 0k
            if(amount >= note[i]){
                amount -= note[i];
                count_note[i] += 1;
            } else{
                i++;
            }
        }
        
        //print ra so note
        for(int j = 0; j < count_note.length; j++){
            System.out.println(count_note[j] + " of " + note[j] + "k");
        }
    }
}