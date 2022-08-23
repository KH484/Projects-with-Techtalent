
public class Week8PT3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String Sentence = "We promptly judged antique ivory buckles for the next prize";

        // making boolean variables and making them all false
        boolean a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
        a = b = c = d = e = f = g = h = i = j = k = l = m = n = o = p = q = r = s = t = u = v = w = x = y = z = false;

        // for loop to iterate through the string
        for (int ap = 0; ap < Sentence.length(); ap++)

        {
            /*
             * Changing the sentence to lower-case and making it into individual characters.
             * Using a switch case to check against the letters in the alphabet and turning
             * the boolean value to true if it finds the letter.
             */

            switch (Sentence.toLowerCase().charAt(ap)) {
                case 'a':
                    a = true;
                    break;

                case 'b':
                    b = true;
                    break;

                case 'c':
                    c = true;
                    break;

                case 'd':
                    d = true;
                    break;

                case 'e':
                    e = true;
                    break;

                case 'f':
                    f = true;
                    break;

                case 'g':
                    g = true;
                    break;

                case 'h':
                    h = true;
                    break;

                case 'i':
                    i = true;
                    break;

                case 'j':
                    i = true;
                    break;

                case 'k':
                    i = true;
                    break;

                case 'l':
                    l = true;
                    break;

                case 'm':
                    m = true;
                    break;

                case 'n':
                    n = true;
                    break;

                case 'o':
                    o = true;
                    break;

                case 'p':
                    p = true;
                    break;

                case 'q':
                    q = true;
                    break;

                case 'r':
                    r = true;
                    break;

                case 's':
                    s = true;
                    break;

                case 't':
                    t = true;
                    break;

                case 'u':
                    u = true;
                    break;

                case 'v':
                    v = true;
                    break;

                case 'w':
                    w = true;
                    break;

                case 'x':
                    x = true;
                    break;

                case 'y':
                    y = true;
                    break;

                case 'z':
                    z = true;
                    break;
            }

            // if statement if all of the letters are present then print this or else print
            // alternative
        }
        if (a && b && c && d && e && f && g && h && i && j && k && l && m && n && o && p && q && r && s && t && u && v
                && w && x && y && z) {
            System.out.println("The sentence " + Sentence + " is a pangram");

        } else {
            System.out.println("The sentence " + Sentence + " is NOT a pangram!");
        }
    }
}
