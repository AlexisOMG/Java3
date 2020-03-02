public class Test {
    public static void main(String[] args) {
        SetOfDisjunction test = new SetOfDisjunction(3);
        test.initDis(0, 3, new boolean[]{true, true, true});
        test.initDis(1, 4, new boolean[]{true, false, true, true});
        test.initDis(2, 4, new boolean[]{true, true, true, true});
        for (Disjunction i: test) {
            System.out.println(i.getInd() + " object: " + i);
        }
        test.initDis(1, 4, new boolean[]{true, true, true, true});
        System.out.println("Edited:");
        for (Disjunction j: test) {
            System.out.println(j.getInd() + " object: " + j);
        }
    }
}
