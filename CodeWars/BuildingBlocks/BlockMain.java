package SoftServe.CodeWars.BuildingBlocks;

public class BlockMain {
    public static void main(String[] args) {
        Block b = new Block(new int[]{4,5,6});

        System.out.println("b.getLength() = " + b.getLength());
        System.out.println("b.getWidth() = " + b.getWidth());
        System.out.println("b.getHeight() = " + b.getHeight());
        System.out.println("b.getVolume() = " + b.getVolume());
        System.out.println("b.getSurfaceArea() = " + b.getSurfaceArea());

    }
}
