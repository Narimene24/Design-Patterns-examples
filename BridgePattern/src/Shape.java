

// Créons maintenant une classe Shape abstraite qui consiste en une référence (pont) à l' objet Color :



public abstract class Shape {
    protected Color color;   
    //standard constructors
    
    public Shape(Color color) {
        this.color = color;
    }

     public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    abstract public String draw();

   
}
