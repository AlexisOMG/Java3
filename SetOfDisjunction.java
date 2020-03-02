import java.util.Iterator;

public class SetOfDisjunction implements Iterable<Disjunction> {
    private int size;
    private Disjunction[] arr;
    public SetOfDisjunction(int size) {
        this.size = size;
        this.arr = new Disjunction[this.size];
    }

    public Iterator<Disjunction> iterator() {
        return new DisjunctionIterator();
    }
    public void initDis(int ind, int n, boolean[] val) {
        this.arr[ind] = new Disjunction(ind, n, val);
    }
    public void setDis(int ind, int n, String[] val) {
        this.arr[ind].setValues(n, val);
    }
    private class DisjunctionIterator implements Iterator<Disjunction> {
        private int ind;
        public DisjunctionIterator() {
            this.ind = 0;
            while (this.ind < size && !arr[ind].calculate()) ind++;
        }
        public boolean hasNext() {
            return this.ind < size;
        }
        public Disjunction next() {
            int i = ind;
            ind++;
            while (this.ind < size && !arr[ind].calculate()) ind++;
            return arr[i];
        }
    }
}
