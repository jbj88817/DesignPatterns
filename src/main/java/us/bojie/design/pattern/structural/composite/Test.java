package us.bojie.design.pattern.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux", 11);
        CatalogComponent windowsCourse = new Course("Windows", 11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("java catalog", 2);
        CatalogComponent mmCourse1 = new Course("Java1", 55);
        CatalogComponent mmCourse2 = new Course("Java2", 66);
        CatalogComponent designPattern = new Course("Java design", 77);

        javaCourseCatalog.add(mmCourse1);
        javaCourseCatalog.add(mmCourse2);
        javaCourseCatalog.add(designPattern);


        CatalogComponent imoocMainCourseCatalog = new CourseCatalog("imooc main catalog", 1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

        imoocMainCourseCatalog.print();
    }
}
