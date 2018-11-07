package PatternMaker;

public class CrossStitchWigglePattern extends Pattern {
    //xXxXxXxXxX
    boolean needleJam = (Math.random() < 0.05d);
    @Override
    public void stitchCombo() {
        SmallCrossStitch smallX = new SmallCrossStitch();
        LargeCrossStitch largeX = new LargeCrossStitch();
        if (needleJam) {
            for (int i = 0; i < 2; i++) {
                smallX.sew();
                largeX.sew();
            }
            smallX.sew();
        } else {
            for (int i = 0; i < 5; i++) {
                smallX.sew();
                largeX.sew();
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
