public class DictionaryBasedCompression {
  public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch |= 32;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
    public String RemovePunctuations(String str){
        str = str.replaceAll("\\p{Punct}","");
        return str;
    }
  public static void main(String[] args){

    }
}
