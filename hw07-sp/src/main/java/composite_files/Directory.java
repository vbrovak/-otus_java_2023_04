package composite_files;

import java.util.ArrayList;

class Directory implements BaseClassFileInterface {
    private final String name;
    private final ArrayList includedFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    public void ls() {
        System.out.println(DemoDirShow.compositeBuilder + name);
        DemoDirShow.compositeBuilder.append("   ");
        for (Object includedFile : includedFiles) {
            BaseClassFileInterface obj = (BaseClassFileInterface) includedFile;
            obj.ls();
        }
        DemoDirShow.compositeBuilder.setLength(DemoDirShow.compositeBuilder.length() - 3);
    }
}
