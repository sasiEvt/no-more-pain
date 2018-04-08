package evt.co.il.nomorepain;

/**
 * Created by sasi on 5 Nov 2017.
 */

public class whatNow {

    int NumFlowQ,NumResult,thePic; // the number in the logarims flow  and the num of pic in R
    Boolean askORresultT; // if true we arrived to answer if fakse we need ask more qution ( in NumFlowQ)
    String Qution,re1,re2,re3,re4; // the data for the result of all q and r

    public int getNumFlowQ() {
        return NumFlowQ;
    }

    public void setNumFlowQ(int numFlowQ) {
        NumFlowQ = numFlowQ;
    }

    public int getNumResult() {
        return NumResult;
    }

    public void setNumResult(int numResult) {
        NumResult = numResult;
    }

    public int getThePic() {
        return thePic;
    }

    public void setThePic(int thePic) {
        this.thePic = thePic;
    }

    public Boolean getAskORresultT() {
        return askORresultT;
    }

    public void setAskORresultT(Boolean askORresultT) {
        this.askORresultT = askORresultT;
    }

    public String getQution() {
        return Qution;
    }

    public void setQution(String qution) {
        Qution = qution;
    }

    public String getRe1() {
        return re1;
    }

    public void setRe1(String re1) {
        this.re1 = re1;
    }

    public String getRe2() {
        return re2;
    }

    public void setRe2(String re2) {
        this.re2 = re2;
    }

    public String getRe3() {
        return re3;
    }

    public void setRe3(String re3) {
        this.re3 = re3;
    }

    public String getRe4() {
        return re4;
    }

    public void setRe4(String re4) {
        this.re4 = re4;
    }

    public whatNow(int numFlowQ, int numResult, int thePic, Boolean askORresultT, String qution, String re1, String re2, String re3, String re4) {
        NumFlowQ = numFlowQ;
        NumResult = numResult;
        this.thePic = thePic;
        this.askORresultT = askORresultT;
        Qution = qution;
        this.re1 = re1;
        this.re2 = re2;
        this.re3 = re3;
        this.re4 = re4;
    }
}
