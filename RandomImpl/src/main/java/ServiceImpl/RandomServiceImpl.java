package ServiceImpl;
import Service.IRandom;

import java.util.Random;

public class RandomServiceImpl implements IRandom {
    public int random() {
        Random r = new Random();
        int ri = r.nextInt();
        while ( ri < 0 ) ri = r.nextInt();
        return ri;
    }
}
