
package manager;


public abstract  class Factory {
    
     public static enum Types{
        X, Y, Z;
    }
    
    public abstract void m1();
    public abstract  void m2();
    
    public static Factory createObject(Types e){
        switch(e){
            case X: return new ObjectX();
            case Y: return new ObjectY();
            case Z: return new ObjectZ();
            default: throw new IllegalArgumentException("Tha case dosen't exist");
        }
    }
    
    private static class  ObjectX extends Factory{
        @Override
        public void m1(){
            System.out.println("ObjectX m1");
        }
        
        @Override
        public void m2(){
            System.out.println("ObjectX m2");
        }
    }
    private static class ObjectY extends Factory{
        
        @Override
        public void m1(){
            System.out.println("ObjectY m1");
        }
        
        @Override
        public void m2(){
            System.out.println("ObjectY m2");
        }
    }
    private static class ObjectZ extends Factory{
        
        @Override
        public void m1(){
            System.out.println("ObjectZ m1");
        }
        @Override
        public void m2(){
            System.out.println("ObjectZ m2");
        }
    }
    
}
