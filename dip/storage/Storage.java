package dip.storage;

public interface Storage {
    public void saveFile(String file);
    public void recover(String file);
}
