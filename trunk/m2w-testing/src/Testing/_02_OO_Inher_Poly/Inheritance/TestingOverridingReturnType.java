/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Testing._02_OO_Inher_Poly.Inheritance;

/**
 * 1. overriding return type can't use auto-boxing.
 * @author ruobo
 * @date Jul 23, 2011
 */
public class TestingOverridingReturnType {
    
}

class $SuperWithNumberReturn{
    Number go(){
        return 1;
    }
    Integer go1(){
        return 1;
    }
}

class $SubWithPrimReturn extends $SuperWithNumberReturn{
//    @Override //fail
//    int go(){
//        return 1;
//    }
//    int go1(){
//        return 1;
//    }
}

class $SubWithWrapperReturn extends $SuperWithNumberReturn{
    @Override
    public Integer go(){
        return 1;
    }
}


