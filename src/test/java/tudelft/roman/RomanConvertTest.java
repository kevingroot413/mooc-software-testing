package tudelft.roman;

public class RomanConvertTest {

    private RomanConvert roman = new RomanConvert();

    public void main(String[] args) {

        int A = roman.convert("IVXLCDM");
        System.out.println(A);
    }

    //TC_1: I=1; V=5; X=10; L=50; C=100; D=500; M=1000
    //TC_2: IV=4; IX=9; XL=40; XC=90; CD=400; CM=900
    //TC_3: VI=6; XI=11; LI=51; CI=101; DI=501; MI=1001
    //TC_4: XV=15; LV=55; CV=105; DV=505; MV=1005
    //TC_5: LX=60; CX=110; DX=510; MX=1010
    //TC_6: CL=150; DL=550; ML=1050
    //TC_7: DC=600; MC=1100
    //TC_8: MD=1500
    //TC_9: Try a non-roman number VX; VL; LC; LD; DM; A; B
    //TC_10: Try all roman numbers in once from low to high
    //TC_11: Try all roman numbers in once from high to low

}
