public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer && temperature >= 25 && temperature <= 45){
            summer = true;
        }else if (!summer && temperature >=25 && temperature <=35){
            summer = true;
        }else{
            summer = false;
        }
        return summer;
    }
}
