package composite_files;

class File implements BaseClassFileInterface {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(DemoDirShow.compositeBuilder + name);
    }
}