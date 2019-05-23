package Lesson_8;

public class Plants {
	private Type type;
	private Color color;
	private int size;

	public Plants (String type, String color, int size) throws ColorException, TypeException {
	      Color c = colorStrToEnum(color);
	      Type t = typeStrToEnum(type);
	      this.size = size;
	      this.type = t;
	      this.color = c;
	}

	private Color colorStrToEnum(String color) throws ColorException {
		switch (color.toLowerCase()) {
		case "blue":
			return Color.Blue;
		case "red":
			return Color.Red;
		case "white":
			return Color.White;
		default:
			throw new ColorException("Input only color blue, red or white");
		}
	}

	private Type typeStrToEnum(String type) throws TypeException {
		switch (type.toLowerCase()) {
		case "rose":
			return Type.Rose;
		case "snowdrop":
			return Type.Snowdrop;
		case "chamomile":
			return Type.Chamomile;
		default:
			throw new TypeException("Input only type rose, snowdrop or chamomile");
		}
	}

	public enum Color {
		White, Red, Blue
	};

	public enum Type {
		Rose, Snowdrop, Chamomile
	};

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Plants [type=" + type + ", color=" + color + ", size=" + size + "]";
	}

	public static void main(String[] args) {
		try {
		      Plants pl = new Plants("rotse", "blue", 5);
		      System.out.println(pl);
		   } catch (ColorException | TypeException e) {
		      System.err.println(e.getMessage() + "\n");
		      //e.printStackTrace();
		   }
		
	try {
	      Plants pl = new Plants("rose", "blhue", 5);
	      System.out.println(pl);
	   } catch (ColorException | TypeException e) {
	      System.err.println(e.getMessage() + "\n");
	      //e.printStackTrace();
	   }
	try {
	      Plants pl = new Plants("rodfse", "blhue", 5);
	      System.out.println(pl);
	   } catch (ColorException | TypeException e) {
	      System.err.println(e.getMessage() + "\n");
	      //e.printStackTrace();
	   }
	}
}

