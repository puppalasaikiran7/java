import java.sql.SQLOutput;

public class strings {
    public static void main(String[] args) {
        //strings are immutable that means it cannot be chaneged

        String name = "saikiran";
        System.out.println(name);

        //methods in string

        //lenght()
        String str= "harry";
        System.out.println(str.length());

        //toLowerCase()
        String lower="HARRY";
        System.out.println(lower.toLowerCase());

        //toUpperCase
        String upper="harry";
        System.out.println(upper.toUpperCase());

        //trim
        String trimming = "  harry  ";
        System.out.println(trimming);
        System.out.println(trimming.trim());

        //substring
        String sub="i am saikiran";
        System.out.println(sub.substring(0)); //by default the value will be 0
        System.out.println(sub.substring(3,8));

        //replace
        String replacing="harry";
        System.out.println(replacing.replace('r','p'));

        //startswith
        String starting="harry";
        System.out.println(starting.startsWith("ha"));

        //endswith
        String ending="harry";
        System.out.println(ending.endsWith("ha"));

        //charAt
        String chara="harry";
        System.out.println(chara.charAt(3));

        //indexOf
        String index="harry";
        System.out.println(index.indexOf("rry"));

        //lastIndexOf
        String laindex="harryrry";
        System.out.println(laindex.lastIndexOf("rry"));

        //equalsIgnoreCase ( this will ignore the case sensitive of the string)
        String equal="harry";
        System.out.println(equal.equalsIgnoreCase("HARRY"));



    }
}
