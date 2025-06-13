package d250613.member_project.main;

import java.util.Scanner;

import d250612.member_project.service.UserService_ArrayList_version;
import d250612.member_project.ui.MemberUi;

public class MainClass {
    public static void main(String[] args) {
        UserService_ArrayList_version.loadFromFile();
        Scanner scanner = new Scanner(System.in);       
        MemberUi.drawUI(scanner);

    }
}
