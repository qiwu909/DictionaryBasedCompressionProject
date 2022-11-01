import java.io.*;

public class datacompression {
    public datacompression(){

    }
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
    public void histogram(){

    }
    public static void main(String[] args) throws IOException {
        File a = new File("src/1.txt");
        BufferedReader read = new BufferedReader(new FileReader(a));
        datacompression x = new datacompression();
        String str = read.readLine();
        while(str!=null){
            str=x.toLowerCase(str);
            str=x.RemovePunctuations(str);
            System.out.println(str);
            str=read.readLine();
        }
        read.close();
    }
}
