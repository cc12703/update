package ezy.boost.update;

public interface OnFinishListener {

    enum FinishType {
        CANCEL,
        DOWNLOAD,
    }

    void onFinish(FinishType type);

}
