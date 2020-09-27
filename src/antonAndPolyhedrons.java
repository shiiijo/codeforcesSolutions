import java.util.Scanner;

public class antonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for (int i=0;i<n;i++){
            String s=sc.next();
            if(s.equals("Tetrahedron")){
                c=c+4;
            }
            if(s.equals("Cube")){
                c=c+6;
            }
            if(s.equals("Octahedron"))
            {
              c=c+8;
            }  if(s.equals("Dodecahedron"))
            {
                c=c+12;
            }
            if(s.equals("Icosahedron"))
            {
                c=c+20;
            }
        }
        System.out.println(c);



    }}