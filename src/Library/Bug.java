package Library;


    public class Bug extends LivingBeing{

        public Bug(){};
    
        public Bug(String name){
            this.name = name;
        }
    
        @Override
        public LivingBeing reproduction() {
            LivingBeing being = new Bug();
            return being;
        }
    
        @Override
        public void eat() {
            this.energyLevel++;
        }
    
        @Override
        public void interact(Object o) {
            System.out.println(name+" interacts with "+ o.toString());
        }
    
}
