public class RevisionQ2 {
    public static void printArrayLength(int[] array){
        int length=array.length;
        System.out.println(length);
}
public static void main(String[] args){
    int[] sampleArray={1,2,3,4,5,6};
    printArrayLength(sampleArray);

    int[] emptyArray={};
            printArrayLength(emptyArray);

            int[] anotherarray={10,20,30};
            printArrayLength(anotherarray);


    }
}
