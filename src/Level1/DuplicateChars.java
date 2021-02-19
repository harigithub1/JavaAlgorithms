package Level1;

public class DuplicateChars {
public static void main(String args[]){
    System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");

    String a = "abcddd";
char[] b = new char[a.length()];
for(int i = 0;i<a.length();i++){
    b[i]=a.charAt(i);
}
}


}
