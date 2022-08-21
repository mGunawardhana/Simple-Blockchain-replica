/*
 * Developed by - mGunawardhana
 * Contact email - mrgunawardhana27368@gmail.com
 * what's app - 071 - 9043372
 */

import java.util.Arrays;

public class Block {
    private int previousHash;
    private String data;
    private int Hash;

    public Block(String data,int previousHash){
        this.data=data;
        this.previousHash=previousHash;

        /* ---- creating blockChain ---- */

        this.Hash = Arrays.hashCode(new Integer[]{data.hashCode(),previousHash});

    }
}
