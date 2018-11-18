package patternMaker;

public class Pattern {
    protected Stitch[] stitches;
    protected boolean needleJam = false;

    public Pattern() {
        this.stitches = new Stitch[7];
        stitches[0] = new ShortLineStitch();
        stitches[1] = new SmallCrossStitch();
        stitches[2] = new LargeCrossStitch();
        stitches[3] = new CircleStitch();
        stitches[4] = new FillStitch();
        stitches[5] = new BlockStitch();
        stitches[6] = new ZigZagStitch();
    }

    public void stitchCombo() {

    }
}
