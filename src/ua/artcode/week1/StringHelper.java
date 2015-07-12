package ua.artcode.week1;

// folder -> package
// file ->   class -> method

// groups methods, container for methods
public class StringHelper {

    // im creator
    // signature, how to use, it for user
    public static String processAndCutNames(String names){
        char[] arr = names.toCharArray();
        String[] parts = splitBySeparator(arr, ',');

        // parts
        String[] numsParts = new String[parts.length];
        String[] nameParts = new String[parts.length];


        String resForRet = "";
        for (int i = 0; i < parts.length && parts[i] != null; i++) {
            String[] numAndName =
                    splitBySeparator(parts[i].toCharArray(),'-');
            String num = numAndName[0];
            String name = numAndName[1];
            int intNum = Integer.parseInt(num);
            if(intNum % 2 != 0){
                resForRet = resForRet + name + ",";
            }
        }

        return resForRet;
    }

    public static String processAndCutNamesWithStrMeth(String names){
        char[] arr = names.toCharArray();
        String[] parts = names.split(",");

        // parts
        String[] numsParts = new String[parts.length];
        String[] nameParts = new String[parts.length];


        String resForRet = "";
        for (int i = 0; i < parts.length && parts[i] != null; i++) {
            String[] numAndName = parts[i].split("-");
            String num = numAndName[0];
            String name = numAndName[1];
            int intNum = Integer.parseInt(num);
            if(intNum % 2 != 0){
                resForRet = resForRet + name + ",";
            }
        }

        return resForRet;
    }

    public static String[] splitBySeparator(char[] arr, char separator){
        String[] parts = new String[arr.length];
        int current = 0;
        int start = 0;
        int end = 0;

        while(start <= arr.length){
            // prepare ranges
            end = defineStartEnd(arr, start, separator); // indexOf
            String part = getPart(arr,start,end); // substring

            // write into arr
            parts[current] = part;
            current++;
            start = end + 1;//way
        }
        return parts;
    }

    public static String[] splitBySeparatorWithStrMeth(String seq, char separator){
        String[] parts = new String[seq.length()];
        int current = 0;
        int start = 0;
        int end = 0;

        while(start <= seq.length()){
            // prepare ranges
            end = seq.indexOf(separator, start); // indexOf
            String part = seq.substring(start,end); // substring

            // write into arr
            parts[current] = part;
            current++;
            start = end + 1;//way
        }
        return parts;
    }

    public static String getPart(char[] arr, int start, int end){
        String part = "";
        // build name using start end
        for (int j = start; j < end; j++) {
            char ch = arr[j];
            part = part + ch;
        }

        return part;
    }

    // indexOf
    public static int defineStartEnd(char[] arr, int start, char separator){
        for (int i = start; i < arr.length; i++) {
            if(arr[i] == separator){
                return i;
            }
        }

        return arr.length;
    }


}
