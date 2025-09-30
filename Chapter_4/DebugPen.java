    class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }

    public static void main(String[] args) {
        DebugPen pen1 = new DebugPen();
        System.out.println("Pen1 Color: " + pen1.getColor() + ", Point: " + pen1.getPoint());

        DebugPen pen2 = new DebugPen("blue", "medium");
        System.out.println("Pen2 Color: " + pen2.getColor() + ", Point: " + pen2.getPoint());
    }
}
