import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Recursion {

    protected static Tokenizer t = new Tokenizer();
    static String str = "";

    public static void readData(String datafile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(datafile));
        String line;
        line = bufferedReader.readLine();
        t.storeTokenizableString(line.trim());
        boolean result = program();
        System.out.println(result);

    }

    public static boolean program() {
        StringBuilder check = new StringBuilder();
        check.append(t.getCurrentToken());
        for (int i = 1; i < 9; i++) {
            check.append(t.getNextToken());
        }
        if (!check.toString().equals("procedure")) {
            return false;
        }
        else {
            if (!letter()) {
                return false;
            } else if (letter()) {
                t.getNextToken();
                while (letterDigit()) {
                    t.getNextToken();
                }
                StringBuilder check2 = new StringBuilder();
                check2.append(t.getNextToken());
                for (int j = 1; j < 5; j++) {
                    check2.append(t.getNextToken());
                }
                if (!check2.equals("begin")) {
                    return false;
                } else {
                    if (!stmtList()) {
                        return false;
                    } else {
                        StringBuilder check10 = new StringBuilder();
                        check10.append(t.getCurrentToken());
                        for (int h = 1; h < 4; h++) {
                            check10.append(t.getNextToken());
                        }
                        if (!check10.equals("end;")) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                }
            }

        }
    }


        public static boolean stmtList () {
            if (stmt()) {
                while (!stmt()) {

                }
                return true;
            } else {
                return false;
            }
        }

        public static boolean stmt () {
            if (assign() || If()) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean assign () {
            if (var()) {
                StringBuilder check3 = new StringBuilder();
                if (!t.getCurrentToken().equals(":")) {
                    return false;
                } else {
                    check3.append(t.getCurrentToken());
                    check3.append(t.getNextToken());
                    if (!check3.equals(":=")) {
                        return false;
                    } else {
                        if (expr()) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }

        public static boolean var () {
            if (letter()) {
                t.getNextToken();
                while (letterDigit()) {
                    t.getNextToken();
                }
                return true;

            } else {
                return false;
            }
        }

        public static boolean expr () {
            if (term()) {
                if (!t.getNextToken().equals(";")) {
                    while (!t.getCurrentToken().equals(";")) {
                        if (op()) {
                            t.getNextToken();
                            if (term()) {

                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                } else {
                    return true;
                }
            }
            return false;
        }

        public static boolean If () {
            StringBuilder check5 = new StringBuilder();
            check5.append(t.getCurrentToken());
            for (int l = 1; l < 3; l++) {
                check5.append(t.getNextToken());
            }
            if (!check5.equals("if(")) {
                return false;
            } else {
                if (!bool()) {
                    return false;
                } else {
                    StringBuilder check6 = new StringBuilder();
                    check6.append(t.getCurrentToken());
                    for (int a = 1; a < 6; a++) {
                        check6.append(t.getNextToken());
                    }
                    if (!check6.equals(") then")) {
                        return false;
                    } else {
                        StringBuilder check7 = new StringBuilder();
                        check7.append(t.getCurrentToken());
                        for (int s = 1; s < 3; s++) {
                            check7.append(t.getNextToken());
                        }
                        if (check7.equals(" en")) {
                            check7.append(t.getCurrentToken());
                            for (int d = 2; d < 7; d++) {
                                check7.append(t.getNextToken());
                            }
                            if (check7.equals(" endif;")) {
                                return true;
                            } else {
                                return false;
                            }
                        } else {
                            if (check7.equals(" el")) {
                                check7.append(t.getCurrentToken());
                                for (int d = 2; d < 5; d++) {
                                    check7.append(t.getNextToken());
                                }
                                if (check7.equals(" else")) {
                                    if (stmtList()) {
                                        StringBuilder check8 = new StringBuilder();
                                        check8.append(t.getCurrentToken());
                                        for (int f = 1; f < 7; f++) {
                                            check8.append(t.getNextToken());
                                        }
                                        if (check8.equals(" endif;")) {
                                            return true;
                                        } else {
                                            return false;
                                        }
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        public static boolean bool () {
            if (!var()) {
                return false;
            } else {
                StringBuilder check4 = new StringBuilder();
                check4.append(t.getCurrentToken());
                if (check4.equals("=")) {
                    if (Int()) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    check4.append(t.getNextToken());
                    if (check4.equals("!=")) {
                        if (Int()) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }

        public static boolean term () {
            if (var() || Int()) {
                return true;
            } else {
                return false;
            }
        }


        public static boolean letter () {
            Pattern p1 = Pattern.compile("([a-z]*)\\w+");
            //Pattern p2 = Pattern.compile("[a-z]+([A-z]*)\\w+");
            Matcher m1 = p1.matcher(t.getCurrentToken());
            if (!m1.matches()) {
                return false;
            } else {
                return true;
            }
        }
        public static boolean digit () {
            Pattern p1 = Pattern.compile("\\d+");
            Matcher m1 = p1.matcher(t.getCurrentToken());
            if (!m1.matches()) {
                return false;
            } else {
                return true;
            }
        }

        public static boolean letterDigit () {
            if (letter() || digit()) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean Int () {
            if (!digit()) {
                return false;
            } else {
                while (digit()) {
                    t.getNextToken();
                }
                return true;
            }
        }

        public static boolean op () {
            Pattern p = Pattern.compile("([\\+|\\-|\\*|\\/])");
            Matcher m = p.matcher(t.getCurrentToken());
            if (m.matches()) {
                return true;
            } else {
                return false;
            }
        }

    }

