package com.iteso.io;

import java.util.Objects;

public class File {
    private String folder;
    private String name;
    private int size;

    //constructores
    public File(String folder, String name) {
        setFolder(folder);
        setName(name);
    }

    public File(int size, String name) {
        setName(name);
        setSize(size);
    }

    public File(String name, int size, String folder){
        setFolder(folder);
        setName(name);
        setSize(size);
    }

    //getters & setters
    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        if(folder.isBlank()){
            this.folder = folder.trim();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank()){
            this.name = name.trim();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size >= 0) {
            this.size = size;
        }
    }

    public boolean isDirectory(){
        return getSize() == 0;
    }

    public boolean isInRoot(){
        return getFolder().isBlank();
    }

    @Override
    public String toString() {
        if(this.isDirectory()){
            System.out.printf("Directory: %s/%s",getFolder(),getName());
        }else{
            System.out.printf("File: %s/%s (%d bytes)", getFolder(),getName(),getSize());
        }
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(folder, file.folder) && Objects.equals(name, file.name);
    }
}
