package Modules;

public class AnimatedText{
    public static void Animate_Text(String[] Text, long Repetions) throws InterruptedException {
        for(int i = 0; i < Text.length; i++){
            Thread.sleep(Repetions);
            System.out.print(Text[i]);
        }
    }
}