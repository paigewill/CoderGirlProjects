package patternMaker;


public class BlockyBaublePattern extends Pattern {
    //[]--o--[]--o--[]--o--

    public BlockyBaublePattern() {
    }

    @Override
    public void stitchCombo() {
        this.needleJam = (Math.random() < 0.10d);
        if (needleJam) {
            for (int i = 0; i < 1; i++) {
                this.stitches[5].sew();
                for (int j = 0; j < 2; j++) {
                    this.stitches[0].sew();
                }
                this.stitches[3].sew();
                for (int j = 0; j < 2; j++) {
                    this.stitches[0].sew();
                }
                for (int j = 0; j < 1; j++) {
                    this.stitches[5].sew();
                    for (int k = 0; k < 2; k++) {
                        this.stitches[0].sew();
                    }
                    this.stitches[3].sew();
                }
            }
        } else {
                for (int i = 0; i < 3; i++) {
                    this.stitches[5].sew();
                    for (int j = 0; j < 2; j++) {
                        this.stitches[0].sew();
                    }
                    this.stitches[3].sew();
                    for (int j = 0; j < 2; j++) {
                        this.stitches[0].sew();
                    }
                }
            }
    }
    public String toString() {
        return "Blocky Bauble Pattern";
    }
    public static void main(String[] args) {
        BlockyBaublePattern stitchIt = new BlockyBaublePattern();
        stitchIt.stitchCombo();
    }

}
