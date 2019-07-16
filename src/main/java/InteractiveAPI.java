public interface InteractiveAPI {
    DisplayAPI getDisplay();
    void showInfo(String messageId);
    void showInfo(String messageId, String messageData);
    void showCustomInfo(String message);
    void showError(String fieldName, String messageId, String messageData);
    void showError(String fieldName, String messageId);
    void showCustomError(String fieldName, String message);
    String getMode();
    String getSelectedListOption();
    void showWarningDialog(String message);
    boolean showOkDialog(String message);
    boolean showOkCancelDialog(String message);
    boolean showYesNoDialog(String message);
}
