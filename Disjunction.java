import java.util.Map;
import java.util.HashMap;
public class Disjunction {
    //private boolean [] values;
    private HashMap <String, Boolean> map;
    private int len;
    private int ind;
    public Disjunction(int ind, int len, boolean[] arr) {
        this.len = len;
        this.ind = ind;
        this.map = new HashMap<>(this.len);
        //this.values = new boolean[this.len];
        for (int i = 0; i < this.len; ++i) {
            //this.values[i] = arr[i];
            this.map.put("x" + (i + 1), arr[i]);
        }
    }
    public void setValues(int n, String[] val) {
        for (int i = 0; i < n; ++i) {
            this.map.put(val[i], true);
        }
        this.len = this.map.size();
    }
    public int getInd() {
        return ind + 1;
    }
    public boolean calculate() {
        boolean res = true;
        for (int i = 0; i < this.len; ++i) {
            res = res && this.map.get("x" + (i + 1));
        }
        return res;
    }
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < this.len - 1; ++i) {
            res.append("x" + (i + 1) + " V ");
        }
        res.append("x" + this.len + "\n");
        for (int i = 0; i < this.len - 1; ++i) {
            if (this.map.get("x" + (i + 1))) {
                res.append("true V ");
            }
            else {
                res.append("false V ");
            }
        }
        if (this.map.get("x" + this.len)) {
            res.append("true");
        }
        else {
            res.append("false");
        }
        return res.toString();
    }
}
