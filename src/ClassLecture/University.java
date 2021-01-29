package ClassLecture;
import java.util.ArrayList;

public class University {

        private ArrayList<Integer> studentIds;
        public University(){
            studentIds = new ArrayList<Integer>();
        }
        public ArrayList<Integer> getIDs(){
            return  studentIds;
        }
        public void addId(int id){
            studentIds.add(id);

        }
        public void print(){
            for (int i: studentIds)
                System.out.println(i+" ");
            System.out.println();
        }
    }
