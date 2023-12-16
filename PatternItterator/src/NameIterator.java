

// Gerer les ittérations - verifier sil ya un prochaine ittérateur ensuite le retourner

 class NameIterator implements Iterator {
        
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
    int index;
 
       @Override
       public boolean hasNext() {
       
          if(index < names.length){
             return true;
          }
          return false;
       }
 
       @Override
       public Object next() {
       
          if(this.hasNext()){
             return names[index++];
          }
          return null;
       }		
    }
