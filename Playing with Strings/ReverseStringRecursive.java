public class ReverseStringRecursive {
    public static void main(String[]args){
        ReverseStringRecursive rsr = new ReverseStringRecursive();
        String blogname = "paola hernandez";
        String reverse = rsr.recursiveReverse(blogname);
        System.out.println("Reverse of paola hernandez is:"+ reverse);

    }
    public String recursiveReverse(String orig){
        if (orig.length() == 1)
            return orig;
        else
            //return orig.substring(0, orig.length()-1);
            return orig.charAt(orig.length()-1)+recursiveReverse(orig.substring(0, orig.length()-1));
    }
}
