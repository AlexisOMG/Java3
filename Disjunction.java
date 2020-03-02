public class Disjunction {
    private boolean [] values;
    private int len;
    private int ind;
    public Disjunction(int ind, int len, boolean[] arr) {
        this.len = len;
        this.ind = ind;
        this.values = new boolean[this.len];
        for (int i = 0; i < this.len; ++i) {
            this.values[i] = arr[i];
        }
    }

    public int getInd() {
        return ind + 1;
    }
    public boolean calculate() {
        boolean res = true;
        for (int i = 0; i < this.len; ++i) {
            res = res && this.values[i];
        }
        return res;
    }
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < this.len - 1; ++i) {
            if (this.values[i]) {
                res.append("true V ");
            }
            else {
                res.append("false V ");
            }
        }
        if (this.values[this.len - 1]) {
            res.append("true");
        }
        else {
            res.append("false");
        }
        return res.toString();
    }
}
