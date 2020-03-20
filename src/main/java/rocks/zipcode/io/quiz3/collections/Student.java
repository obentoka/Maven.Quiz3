package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;

    public Student() {
        labs = new LinkedList<>();
    }

    public Student(List<Lab> labs) {
        for(Lab i : labs){
            i.setStatus(LabStatus.INCOMPLETE);
            this.labs.add(i);
        }
    }

    public Lab getLab(String labName) {
        for(Lab i : labs){
            if(i.labName.equals(labName))
                return i;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if(labs.size() == 0)
            throw new UnsupportedOperationException();
        else
            getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        StringBuilder retString = new StringBuilder();
        for (int i = labs.size()-1; i >= 0 ; i--) {
            String s = String.format("%s > %s", labs.get(i).labName, labs.get(i).labStatus);
            retString.append(s);
            if(i != 0)
                retString.append("\n");
        }
        return retString.toString();
    }
}
