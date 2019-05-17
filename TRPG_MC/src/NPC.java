import java.util.Scanner;

public class NPC extends Players{
    public NPC (String _name){
        this.name = _name;
    }


    @Override
    void makeStat() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("str 입력");
        str = scanner.nextInt();

        System.out.print("str 입력");
        con = scanner.nextInt();

        System.out.print("str 입력");
        siz = scanner.nextInt();

        System.out.print("str 입력");
        intel = scanner.nextInt();

        System.out.print("str 입력");
        dex = scanner.nextInt();

        System.out.print("str 입력");
        app = scanner.nextInt();

        System.out.print("str 입력");
        edu = scanner.nextInt();
    }
}
