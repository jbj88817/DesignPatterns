package us.bojie.design.principle.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName, String address) {
        userName ="bo";
        address="san jose";
    }

    private void updateUserName(String userName) {
        userName ="bo";
    }

    private void updateUserAddress(String address) {
        address ="san jose";
    }
}
