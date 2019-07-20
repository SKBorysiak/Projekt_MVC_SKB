package pl.sda.mvc.view;

import lombok.Data;
import pl.sda.mvc.model.GiantModel;
@Data
public class GiantView {

    public void displayGiant(GiantModel giant){
        System.out.println(giant);

    }
}
