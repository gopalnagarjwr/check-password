class Passwd{
    public boolean valid(String pass){
        char c;
        int alpha=0;
        int num=0;
        int special=0;
        if (pass.length() >= 6 && pass.length() <= 16) {   //check length min and max
            for (int i = 0; i < pass.length(); i++) {
                c = pass.charAt(i);
                if (c >= 'A' && c <= 'Z') {   //check alphabet
                    alpha = 1;
                } else if (c >= '1' && c <= '9') {  //check number
                    num = 1;
                } else if (c >= 33 && c <= 47 || c >= 58 && c <= 64 || c >= 91 && c <= 96 || c >= 123 && c <= 126) {
                    special = 1;    //check special char
                }
            }
        }
        return (alpha==1 && num==1 && special==1);
    }
}
