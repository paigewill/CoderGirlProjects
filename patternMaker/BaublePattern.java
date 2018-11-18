package patternMaker;

public class BaublePattern extends Pattern {
    //--o--o--o--o--o
    @Override
    public void stitchCombo() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                this.stitches[0].sew();
            }
            this.stitches[3].sew();
        }
    }
    public String toString() {
        return "Bauble Pattern";
    }
    public static void main(String[] args) {
        BaublePattern stitchIt = new BaublePattern();
        stitchIt.stitchCombo();
    }
}
