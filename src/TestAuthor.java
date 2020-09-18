public class TestAuthor {
    public static void main(String[] args){
        Author a1=new Author("akimenkovartem@yandex.ru","Artem Akimenkov",'m');
        Author a2=new Author("sadshmidt@yandex.ru","Julia Shmidt", 'w');
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
