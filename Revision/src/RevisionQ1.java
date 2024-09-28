public class RevisionQ1 {
    public static String replaceCharacters(String s,CharSequence s1,CharSequence s2){
        return s.replace(s1,s2);
    }



    public static void main(String[] args) {

        String s = "hello world,hello java ";
        String s1 = "hello";
        String s2="hi";

        String result=replaceCharacters(s,s1,s2);

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(result);
    }


}
