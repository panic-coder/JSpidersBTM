
class TestKeshab
{
public static void main(String[] names) throws Exception
{
try{
System.out.println(names[0]);
System.out.println(names[1]);
}
catch(ArrayIndexOutOfBoundsException e){
e.printStackTrace();
}
}
}