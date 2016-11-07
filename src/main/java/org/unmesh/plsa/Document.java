package org.unmesh.plsa;

import java.util.List;
/**
 * 
 * represent a document
 * 
 * @author unmesh.pro@gmail.com
 *
 */
public class Document {

    private List<String> words;

    private String fileName;

    public Document(List<String> words, String fileName) {
        this.words = words;
        this.fileName = fileName;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

}
