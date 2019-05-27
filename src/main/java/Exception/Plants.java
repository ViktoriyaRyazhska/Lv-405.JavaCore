package SoftServe.Exception;

public class Plants {
    private int size;
    private Type type;
    private Color color;

     Plants(String type, String color, int size) throws ColorException, TypeException{
        this.type = getType(type);
        this.color = getColor(color);
        this.size = size;
    }

    public enum Type{
        ROSE,
        LILY,
        ANEMONE
    }

    public enum Color{
        RED,
        BLUE,
        GREEN
    }

    private static Color getColor(String color) throws ColorException{
        switch (color.toLowerCase()){
            case"red": return Color.RED;
            case"blue": return Color.BLUE;
            case"green": return Color.GREEN;
            default: throw new ColorException("Incorrect color name");
        }
    }

    private static Type getType(String type) throws TypeException{
        switch (type.toLowerCase()){
            case"rose": return Type.ROSE;
            case"lily": return Type.LILY;
            case"anemone": return Type.ANEMONE;
            default: throw new TypeException("Incorrect type name");
        }

    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
