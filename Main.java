package LAB7.LAB7;

public class Main {
    public static void main(String[] args) {
        System.out.print("\n PRINT STATIC METHOD PUT UP \n");
        ChristmasTree.printStaticPutUP();

        ChristmasTree tree = new ChristmasTree();

        ChristmasTree tree1 = new ChristmasTree(180, "Chine", 122, "Plastic");

        ChristmasTree tree2 = new ChristmasTree(180, "Chine", 122, "Plastic",
                "white", 2021, "102cm", "Contemporary",
                "Palm", 12, "LED");

        System.out.print("\n PRINT TREE \n");
        System.out.println(tree);

        System.out.print("\n PRINT TREE 1 \n");
        System.out.println(tree1);

        System.out.print("\n PRINT TREE 2 \n");
        System.out.println(tree2);

        System.out.print("\n PRINT PUT UP \n");
        tree.printPutUP();

        System.out.print("\n RESET VALUES \n");
        tree2.resetValues(200, "Ukraine", 200, "Plastic",
                "Green", 2021, "120cm", "Contemporary",
                "Palm", 10, "LED");

        System.out.println(tree2);

    }


}
