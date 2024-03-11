public class list {

    public static String[] model = new String[10];
    public static void main(String[] args) {
        testShowList();
    }

    public static void showList(){
        for (var i=0; i<model.length; i++){
            var todo = model[i];
            var no = i+1;

            if (todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }
    /* test show list */
    public static void testShowList(){
        model[0] = "show list 1";
        model[1] = "show list 2";
        showList();
    }

    public static void addList(String todo){
        //add to array is null

    }

    public static void deleteList(){

    }
/* view */
    public static void viewShowList(){

    }
    public static void viewAddList(){

    }

    public static void viewDeleteList(){

    }
}
