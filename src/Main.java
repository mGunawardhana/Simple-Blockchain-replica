/*
 * Developed by - mGunawardhana
 * Contact email - mrgunawardhana27368@gmail.com
 * what's app - 071 - 9043372
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Block> blockChainList = new ArrayList<>();

        /* ---- Introducing genesis Block ---- */
        Block genesis = new Block("Heap Zip BlockChain",0);
        blockChainList.add(genesis);

        /* ---- Introducing first block ---- */
        Block blockX = new Block("Hello",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);





    }
}
