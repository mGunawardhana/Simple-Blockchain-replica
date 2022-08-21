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
        Block genesis = new Block("mGunawardhana's BlockChain",0);
        blockChainList.add(genesis);

        /* ---- Introducing first block ---- */
        //TODO: check out this line if you have an any error
        Block blockA = new Block("Block One here",blockChainList.get(0).hashCode());
        blockChainList.add(blockA);

        Block blockB = new Block("Block two here",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockB);

        Block blockC = new Block("Block three here",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockC);

        Block blockD = new Block("Block four here",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockD);





    }
}
