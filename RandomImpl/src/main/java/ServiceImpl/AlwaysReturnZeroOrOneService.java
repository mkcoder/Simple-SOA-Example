package ServiceImpl;

import Service.IRandom;

import java.util.Random;

/**
 * Created by muhammadk on 26-May-16.
 */
public class AlwaysReturnZeroOrOneService implements IRandom{
    public int random() {
        return (new Random().nextInt() % 2 == 0 ? 0 : 1);
    }
}
