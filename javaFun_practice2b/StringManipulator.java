public class StringManipulator{
    public String trimAndConcat(String st1, String st2){
        return st1.trim()+st2.trim();
    }
    public Integer getIndexOrNull(String str2, char ch2){
        int idx = str2.indexOf(ch2);
        if(idx == -1){
            return null;
        } else{
        return idx;
        }
    }
    public Integer getIndexOrNull(String str3, String str4){
        int idx = str3.indexOf(str4);
        if(idx == -1){
            return null;
        } else {
            return idx;
        }
    }
    public String concatSubstring(String st5, int i1, int i2, String st6){
        String substr = st5.substring(i1, i2);
        return substr.concat(st6);
    }

}