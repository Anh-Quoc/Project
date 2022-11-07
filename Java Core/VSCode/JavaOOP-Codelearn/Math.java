class Math {
    public  static double PI = 3.14;
    
    public int abs(int x){        
        return x < 0 ? (-1 * x) : x;
    }
    
    public int add(int x , int y){
        return x + y;        
    }
    
    public int subtract(int x , int y){
        return x - y;
    }
    
    public int min(int x , int y){
        return x < y ? x : y;
    }
    
    public int max(int x , int y){
        return x > y ? x : y;
    }
    
    public int pow(int x , int y){
        int gt = x;
        for(int i = 0 ; i < y ; ++i){
            gt *= x;
        }
        return gt;
    }
}