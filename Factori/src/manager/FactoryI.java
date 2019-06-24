
package manager;

import WithInterface.FactoryInterface;


public  class  FactoryI implements FactoryInterface{
    
    public static  enum TypeI {
        X, Y, Z;
    }
   
    
    @Override
    public void m1(){
        System.out.println("ObjectI m1");
    }
    
    @Override
    public void m2(){
        System.out.println("ObjectI m2");
    }
    
    public static Factory createObject(TypeI e){
        switch(e){
            case X: return new ObjectX();
            case Y: return new ObjectY();
            case Z: return new ObjectZ();
            default: throw new IllegalArgumentException("Tha case dosen't exist");
        }
    }
    
    
    private static class  ObjectX extends Factory{
      
        public void m1(){
            
        }
        
        
        public void m2(){
           
        }
    }
    private static class ObjectY extends Factory{
        
        
        public void m1(){
            
        }
        
        
        public void m2(){
           
        }
    }
    private static class ObjectZ extends Factory{
        
       
        public void m1(){
            
        }
        
        public void m2(){
          
        }
    }
    
}
