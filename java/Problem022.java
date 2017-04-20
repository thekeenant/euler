import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem022 implements EulerSolution {
    public static void main(String[] args) {
        EulerSolution.execute(new Problem022());
    }

    @Override
    public long run() {
        String file = readFile();

        List<String> names = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < file.length(); i++) {
            char letter = file.charAt(i);

            if (Character.isAlphabetic(letter)) {
                current.append(letter);
            }
            else if (current.length() > 0) {
                names.add(current.toString());
                current = new StringBuilder();
            }
        }

        Collections.sort(names);


        int totalScore = 0;
        for (int i = 0; i < names.size(); i++) {
            totalScore += score(names.get(i), i + 1);
        }
        return totalScore;
    }

    private int score(String name, int index) {
        int score = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            int value = (int) letter - 64;
            score += value;
        }
        return score * index;
    }

    private String readFile() {
        try {
            return Files.lines(new File("problem022.txt").toPath()).findAny().orElseThrow(Exception::new);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
