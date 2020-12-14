package com.upgrad.ublog.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * TODO: 5.1. Implement writeLog() method with the following method signature.
 *  public static void writeLog(String logMessage, String path) throws IOException
 *  This method should append the log message to the log file that is stored at the
 *  Input path.
 */

public class LogWriter {
    public static void writeLog(String logMessage,String path) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.now();
        String date = localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String timeStamp = localDateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

        String p = "./src/com/upgrad/ubank/logs/";
        String fileName = "logs " + date + ".log";
        String filePath = p + fileName;

        try {
            if (!Files.exists(Paths.get(p))) {
                Files.createDirectory(Paths.get(p));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(timeStamp + "\t" + logMessage);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
