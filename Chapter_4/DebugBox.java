class DebugBox
{
    private int width;
    private int length;
    private int height;

    DebugBox()
    {
        length = 1;
        width = 1;
        height = 1;
    }

    DebugBox(int width, int length, int height)
    {
        this.width = width;
        this.length = length;  
        this.height = height;  
    }

    void showData()
    {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    double getVolume()
    {
        double vol = length * width * height;
        return vol;
    }

    public static void main(String[] args)
    {
        DebugBox box1 = new DebugBox();  
        DebugBox box2 = new DebugBox(3, 4, 5);

        box1.showData();
        box2.showData();

        System.out.println("Volume of box1: " + box1.getVolume());
        System.out.println("Volume of box2: " + box2.getVolume());
    }
}
