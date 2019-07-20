package pl.sda.mvc.model;


public enum Health {

    HEALTHY("helathy"), DEAD("dead");

    private String title;

    Health(String title){
        this.title=title;
    }
}
