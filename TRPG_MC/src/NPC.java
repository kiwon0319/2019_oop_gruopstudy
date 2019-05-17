import java.util.Scanner;

public class NPC  extends  Playaers {

    public NPC (String _name) { this.name = _name; }

    @Override
    void makeStat() {
        Scanner scan = new Scanner(System.in);

        System.out.print("\n힘  입력 >> "); str = scan.nextInt();
        System.out.print("\n건강 입력 >> "); con = scan.nextInt();
        System.out.print("\n크기 입력 >> "); siz = scan.nextInt();
        System.out.print("\n지능 입력 >> "); intel = scan.nextInt();
        System.out.print("\n민첩 입력 >> "); dex = scan.nextInt();
        System.out.print("\n외모 입력 >> "); app = scan.nextInt();
        System.out.print("\n교육 입력 >> "); edu = scan.nextInt();
    }


}
