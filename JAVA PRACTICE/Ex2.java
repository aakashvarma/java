class Ex2{
    public static void main(String[] args){
        try{
            int i = Integer.parseInt(args[0]);
            System.out.println(i);
        }
        // catch(NumberFormatException e){
        //     System.out.println(e);
        // }
        finally{}
        System.out.println("Exception caught");
    }
}