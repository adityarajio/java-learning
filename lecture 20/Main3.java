import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException{
        // InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();
        System.out.println(name);
    }
}

/*
1. Aditya
2. OS Buffer (65, 100, 105, 116, 121, 97)
3. System.in (InputStream) recieves bytes
4. InputStreamReader --> stream of bytes into stream of characters
('a', 'd'. 'i', 't', 'y', 'a')
5. BufferedReader --> readLine --> Aditya --> name
6. Aditya -> O/P
*/