package SoftServe.CodeWars.BuildingBlocks;

public class Block {
    private int width;
    private int length;
    private int height;

    public Block(int[] arrOfBlockParam){
        width =  arrOfBlockParam[0];
        length = arrOfBlockParam[1];
        height = arrOfBlockParam[2];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getVolume(){
        return length * width * height;
    }

    public int getSurfaceArea(){
        return 2 * (length * width + length * height + width * height);
    }
}
