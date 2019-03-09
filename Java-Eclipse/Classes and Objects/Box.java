class Box{
    int width = 0;
    int height = 0;
    int depth = 0;

    Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }
    public int volume(){
        return width*height*depth;
    }
        public static void main(String[] args){
        Box obj = new Box(2, 5, 6);
        System.out.println(obj.volume());
    }
}