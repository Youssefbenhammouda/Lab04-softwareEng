package problem2.after;

import java.util.ArrayList;
import java.util.List;

public class Laptop {

    public static class  Builder{
        private final String cpu;
        private  int ramGb = 8, ssdGb = 128;
        private  boolean gpu =false, backlitKeyboard=false;
        private final List<String> accessories = new ArrayList<>();
        public Builder(String cpu){
            this.cpu = cpu;

        }

        public Builder ram(int ramGb){
            this.ramGb = ramGb;
            return this;
        }

        public Builder ssd(int ssdGb) {
            this.ssdGb = ssdGb;
            return this;
        }

        public Builder gpu() {
            this.gpu = true;
            return this;
        }

        public Builder backlitKeyboard() {
            this.backlitKeyboard = true;
            return this;
        }

        public Builder accessory(String accessoryString){
            accessories.add(accessoryString);
            return this;
        }

        public Laptop build(){
            if(!(ramGb >= 4 && ramGb <=64) ) throw new IllegalStateException("Ram size must be between 4 and 64 GB.");
            if(ssdGb <128) throw new IllegalStateException("Ssd must be atleast 128 GB.");

            return new Laptop(this);
        }
    }


    private final String cpu;
    private final  int ramGb, ssdGb;
    private final  boolean gpu, backlitKeyboard;
    private final  List<String> accessories ;
    Laptop(Builder builder){

        cpu = builder.cpu;
        ramGb= builder.ramGb;
        ssdGb=builder.ssdGb;
        gpu=builder.gpu;
        backlitKeyboard=builder.backlitKeyboard;
        accessories=builder.accessories;


    }

    public String getCpu() {
        return cpu;
    }

    public int getRamGb() {
        return ramGb;
    }

    public int getSsdGb() {
        return ssdGb;
    }

    public boolean isGpu() {
        return gpu;
    }

    public boolean isBacklitKeyboard() {
        return backlitKeyboard;
    }

    public List<String> getAccessories() {
        return List.copyOf(accessories);
    }

    @Override
    public String toString(){
        return String.format("Laptop[cpu=%s, ram=%dGB, ssd=%dGB, gpu=%b, backlit=%b, accessories=[%s]]",
                cpu,ramGb,ssdGb,gpu,backlitKeyboard,String.join(", ",accessories)
                );
    }
}
