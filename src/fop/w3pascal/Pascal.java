package fop.w3pascal;

class Pascal extends MiniJava {
    // Function for computing the first n rows of Pascal's triangle.
    public static int[][] pascal(int n) {

int [][] b  = new int [n][n];
for (int i=0; i<n;i++)
{
    b[i][0] =1;
    b[i][i] = 1;
    for(int j=1;j<i;j++)
        b[i][j] = b[i-1][j-1] + b[i-1][j];
}
return b;
    }

    public static void main(String[] args) {
       int n=read("Please insert number of rows:");
       int [][] a = pascal(n);
       int i=1;
       for (int k=0;k<n;k++)
       {
           writeConsole("n=");
           writeConsole(k);
           writeConsole("\t");
           for(int j=0;j<i;j++)
           {  writeConsole(a[k][j]);
            writeConsole("\t");}
           i++;
          if(k!=n-1) write("");

       }


    }
}
