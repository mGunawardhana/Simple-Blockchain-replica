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

    public Block(String data, int previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.Hash = Arrays.hashCode(new Integer[]{data.hashCode(), previousHash});
    }

    public Block() {
        super();
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(int previousHash) {
        this.previousHash = previousHash;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getHash() {
        return Hash;
    }

    public void setHash(int hash) {
        Hash = hash;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Block{" +
                " previousHash = " + previousHash + " " +
                ", Hash = " + Hash + " " +
                '}';
    }
}
