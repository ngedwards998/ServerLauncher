package dev.badbird.serverlauncher.config.source;

import java.io.File;

public interface DownloadSource {
    void download(File file);

    default void preDownload(File file) {
        download(file);
    }
}
