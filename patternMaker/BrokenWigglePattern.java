package patternMaker;

public class BrokenWigglePattern extends Pattern {
    //xXxXxXxXxX

    @Override
    public void stitchCombo() {
        this.needleJam = (Math.random() < 0.40d);
        if (this.needleJam) {
            for (int i = 0; i < 2; i++) {
                this.stitches[1].sew();
                this.stitches[2].sew();
            }
            this.stitches[1].sew();
        } else {
            for (int i = 0; i < 5; i++) {
                this.stitches[1].sew();
                this.stitches[2].sew();
            }
        }
    }
    public String toString() {
        return "Broken Wiggle Pattern";
    }
    public static void main(String[] args) {
        BrokenWigglePattern stitchIt = new BrokenWigglePattern();
        stitchIt.stitchCombo();
    }

}
