import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;

public class HelloTests {

    public static int WIDTH = 800;
    public static int HEIGHT = 800;
    private static BufferedImage image;
    private static Graphics2D g;

    public static void main(String[] args) {
/*
        Form form = new Form();
        form.pack();
        form.setSize(900,600);
        form.setVisible(true);
*/
/*
        char table[][] = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = ' ';
            }
        }
        for (int i = 0; i < 4; i++) {
            table[i + 1][i] = 'X';
        }
        //check(table);
        */
    }

    static boolean check(char[][] table) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(check_t(table,0,table[i][j], i, j, 0)) {
                    System.out.println(table[i][j] + " - wins.");
                    return true;
                    //return table[i][j] + " - wins.";
                }
            }
        }
        return false;
        //return "No one - wins.";
    }

    static boolean check_t(char[][] table, int length, char t, int i, int j, int dir) {
        if(length == 4) return true;
        if(i >= 5 || i < 0 || j >= 5 || j < 0) return false;
        if(t == table[i][j] && table[i][j] != ' ') length++;

        switch (dir) {
            case 0:
                return check_t(table, length, table[i][j], 1 + i, j, 1)||check_t(table, length, table[i][j], i, 1 + j, 2)
                        ||check_t(table, length, table[i][j], i - 1, j,3)||check_t(table, length, table[i][j], i, j - 1,4)
                        ||check_t(table, length, table[i][j], 1 + i, 1 + j,5)||check_t(table, length, table[i][j], 1 + i, j - 1,6)
                        ||check_t(table, length, table[i][j], i - 1, j - 1,7)||check_t(table, length, table[i][j], i - 1, 1+j,8);

            case 1:
                return check_t(table, length, table[i][j], ++i, j, dir);

            case 2:
                return check_t(table, length, table[i][j], i, ++j, dir);

            case 3:
                return check_t(table, length, table[i][j], --i, j, dir);

            case 4:
                return check_t(table, length, table[i][j], i, --j, dir);

            case 5:
                return check_t(table, length, table[i][j], ++i, ++j, dir);

            case 6:
                return check_t(table, length, table[i][j], ++i, --j, dir);

            case 7:
                return check_t(table, length, table[i][j], --i, --j, dir);

            case 8:
                return check_t(table, length, table[i][j], --i, ++j, dir);


            default: return false;
        }

    }

    static boolean check_input(char[][] table) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(table[i][j] == 'x' | table[i][j] == 'X' | table[i][j] == 'o' | table[i][j] == 'O' | table[i][j] == ' ') {}
                else return false;
            }
        }
        return true;
    }

}