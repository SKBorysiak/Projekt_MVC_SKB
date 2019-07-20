package pl.sda.mvc.controller;

import lombok.Data;
import pl.sda.mvc.model.Fatigue;
import pl.sda.mvc.model.GiantModel;
import pl.sda.mvc.model.Health;
import pl.sda.mvc.view.GiantView;

@Data
public class GiantController {

    private GiantModel giant;
    private GiantView view;
    private Health health;
    private Fatigue fatigue;



    public GiantController(GiantModel giant, GiantView view) {
        this.giant = giant;
        this.view = view;
    }

    public  void updateView(){
        this.view.displayGiant(this.giant);
    }
    public void setHealth(Health health) {
        this.giant.setHealth(health);
    }
   public  void  setFatigue(Fatigue fatigue){
     this.giant.setFatigue(fatigue);
   }




}
