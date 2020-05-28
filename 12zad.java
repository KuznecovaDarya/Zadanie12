import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.print("Задание 1\n");
    Scanner bb = new Scanner(System.in);
    String s = bb.nextLine();
    int rez=0;
    for (int i=(s.length()-1); i>-1; i--)
    {
      char smb = s.charAt(i);
      char smb2=' ';
      if(i!=0) smb2 = s.charAt(i-1);
      if (smb=='I') rez=rez+1;
      else if (smb=='V') 
      {
        if (smb2=='I') 
        {
          rez=rez+4;
          i--;
        }
        else rez=rez+5;
      }
      else if (smb=='X') 
      {
        if (smb2=='I') 
        {
          rez=rez+9;
          i--;
        }
        else rez=rez+10;
      }
      else if (smb=='L') 
      {
        if (smb2=='X') 
        {
          rez=rez+40;
          i--;
        }
        else rez=rez+50;
      }
      else if (smb=='C') 
      {
        if (smb2=='X') 
        {
          rez=rez+90;
          i--;
        }
        else rez=rez+100;
      }
      else if (smb=='D') 
      {
        if (smb2=='C') 
        {
          rez=rez+400;
          i--;
        }
        else rez=rez+500;
      }
      else if (smb=='M') 
      {
        if (smb2=='C') 
        {
          rez=rez+900;
          i--;
        }
        else rez=rez+1000;
      }
    }
    System.out.print("="+rez);
    System.out.print("\nЗадание 2\nВведи число для проверки на палиндром: ");
    Scanner in = new Scanner(System.in);
    String n = in.nextLine();
    String reverse = new StringBuffer(n).reverse().toString();
    if (n.equals(reverse) == true)
    {
    System.out.println("Число является палиндромом");
    }
    else if (n.equals(reverse) == false) 
    {
      System.out.println("Число не является палиндромом");
    }
  }
}