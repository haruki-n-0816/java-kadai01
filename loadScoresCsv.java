import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;

class loadScoresCsv{
    public static void main(String[] args) {

        String id;
        String name;
        String score;
        
        // パスを適切に設定してください
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(".", "java-kadai01", "scores.csv"))) {
            var line = "";
            while ((line = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",",false);

                // 整形
                id = st.nextToken() + ",";
                name = st.nextToken() + ",";
                score = st.nextToken() + ",";

                // 出力
                System.out.printf("%-6s%-9s%-7s%s", id, name, score, st.nextToken());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}