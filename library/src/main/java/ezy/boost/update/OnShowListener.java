package ezy.boost.update;

public interface OnShowListener {

    enum ShowType {
        PROMPT,
    }

    void onShow(ShowType type);
}
