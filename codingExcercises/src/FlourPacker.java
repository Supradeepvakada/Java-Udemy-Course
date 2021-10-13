public class FlourPacker {
    public static boolean canPack ( int bigCount, int smallCount, int goal){
        if ( bigCount >=0 && smallCount >=0 && goal >=0) {

            int bigCountValue = 5;
            int smallCountValue = 1;

            for (int i = 0; i <= bigCount; i++)
                for (int j = 0; j <= smallCount; j++)
                    if (goal == (i * bigCountValue) + (j * smallCountValue))
                        return true;
        }
        return false;
    }
}