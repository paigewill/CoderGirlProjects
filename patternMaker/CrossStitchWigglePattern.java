package patternMaker;

public class CrossStitchWigglePattern extends Pattern {
    //xXxXxXxXxX

    public CrossStitchWigglePattern() {
    }

    @Override
    public void stitchCombo() {
        this.needleJam = (Math.random() < 0.05d);
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
        return "Cross Stitch Wiggle Pattern";
    }
    public static void main(String[] args) {
        CrossStitchWigglePattern stitchIt = new CrossStitchWigglePattern();
        stitchIt.stitchCombo();
    }
}
