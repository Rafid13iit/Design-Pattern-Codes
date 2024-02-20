package shapes;

public class Font extends Shape {
	public String font;

    public Font() {
    }

    public Font(Font target) {
        super(target);
        if (target != null) {
            this.font = target.font;
        }
    }

    @Override
    public Shape clone() {
        return new Font(this);
    }
    
//  @Override
//  public boolean equals(Object object2) {
//      if (!(object2 instanceof Font) || !super.equals(object2)) return false;
//      Font shape2 = (Font) object2;
//      return shape2.font == font;
//  }
}
