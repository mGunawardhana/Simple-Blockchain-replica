/*
 * Developed by - mGunawardhana
 * Contact email - mrgunawardhana27368@gmail.com
 * what's app - 071 - 9043372
 */

import com.sun.org.apache.xml.internal.security.algorithms.implementations.SignatureDSA;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Block> blockChainList = new ArrayList<>();

    public static void main(String[] args) {


        /* ---- Introducing genesis Block ---- */
        Block genesis = new Block("mGunawardhana's BlockChain", 0);
        blockChainList.add(genesis);

        /* ---- Introducing first block ---- */
        //TODO: check out this line if you have an any error
        Block blockA = new Block("Block One here", blockChainList.get(0).hashCode());
        blockChainList.add(blockA);

        Block blockB = new Block("Block two here", blockChainList.get(blockChainList.size() - 1).hashCode());
        blockChainList.add(blockB);

        Block blockC = new Block("Block three here", blockChainList.get(blockChainList.size() - 1).hashCode());
        blockChainList.add(blockC);

        Block blockD = new Block("Block four here", blockChainList.get(blockChainList.size() - 1).hashCode());
        blockChainList.add(blockD);

        Block blockE = new Block("Block five here", blockChainList.get(blockChainList.size() - 1).hashCode());
        blockChainList.add(blockE);

        Block blockF = new Block("Block six here", blockChainList.get(blockChainList.size() - 1).hashCode());
        blockChainList.add(blockF);

        Block blockG = new Block("Block Seven here", blockChainList.get(blockChainList.size() - 1).hashCode());
        blockChainList.add(blockG);

        Block blockH = new Block("Block Eight here", blockChainList.get(blockChainList.size() - 1).hashCode());
        blockChainList.add(blockH);

        Block blockI = new Block("Block Nine here", blockChainList.get(blockChainList.size() - 1).hashCode());
        blockChainList.add(blockI);

        Block blockJ = new Block("Block Ten here", blockChainList.get(blockChainList.size() - 1).hashCode());
        blockChainList.add(blockJ);


        System.out.println("===============================================================");
        System.out.println("|        - Welcome to mGunawardhana's Blockchain Sample -     |");
        System.out.println("===============================================================");

        for (Block block : blockChainList) {
            System.out.println("|    " + block + "   ");
        }

        System.out.println("===============================================================");

    }
}
