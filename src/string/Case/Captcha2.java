package string.Case;

import java.util.Random;

public class Captcha2 {
    public static void main(String[] args) {
        String captcha = generateCaptcha();
        System.out.println(captcha);
    }

    public static String generateCaptcha() {
        StringBuilder captcha = new StringBuilder();

        Random random = new Random();
        // 生成四个随机字母（包括大小写）
        for (int i = 0; i < 4; i++) {
            char randomChar;
            if (random.nextBoolean()) {
                // 生成大写字母
                randomChar = (char) (random.nextInt(26) + 'A');
            } else {
                // 生成小写字母
                randomChar = (char) (random.nextInt(26) + 'a');
            }
            captcha.append(randomChar);
        }
        // 生成一个随机数字
        int randomDigit = random.nextInt(10);
        captcha.append(randomDigit);

        return shuffleString(captcha.toString());
    }

    public static String shuffleString(String input) {
        char[] characters = input.toCharArray();
        Random random = new Random();

        for (int i = 0; i < characters.length; i++) {
            int randomIndex = random.nextInt(characters.length);
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }

        return new String(characters);
    }
}