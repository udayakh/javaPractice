package com.uday.loop;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class L5 {

	public static void main(String[] args) {

		String[] data = { "Line 1", "Line 2 2", "Line 3 3 3", "Line 4 4 4 4", "Line 5 5 5 5 5" };

		try {
			FileSystem zipFs = openZip(Paths.get("F:\\flyway.zip"));
			writeToFileInZip1(zipFs, data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void writeToFileInZip1(FileSystem zipFs, String[] data) throws IOException {
		try (BufferedWriter writer = Files.newBufferedWriter(zipFs.getPath("/newFile1.txt"))) {
			for (String d : data) {
				writer.write(d);
				writer.newLine();
			}
		}
	}

	private static FileSystem openZip(Path zipPath) throws URISyntaxException, IOException {
		Map<String, String> providerProps = new HashMap<>();
		providerProps.put("create", "true");
		URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
		FileSystem ziFileSystem = FileSystems.newFileSystem(zipUri, providerProps);
		return ziFileSystem;
	}

}
