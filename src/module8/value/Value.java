package module8.value;

public class Value {
    private int parameter;
    private int value;

    Value(int parameter){
        this.parameter = parameter;
    }

    Value(){

    }

    public void setVal(int value){
        this.value = value;
    }

    public boolean wasModified(){
        if(value != 0){
            return true;
        }else{
            return false;
        }
    }

    public int getVal(){
        if(value != 0){
            return value;
        }else if(parameter != 0){
            return parameter;
        }else{
            return 0;
        }
    }


}
