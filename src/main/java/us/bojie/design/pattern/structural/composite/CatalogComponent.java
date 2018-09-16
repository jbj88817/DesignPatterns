package us.bojie.design.pattern.structural.composite;

public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("UnsupportedOperation" + " add");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("UnsupportedOperation" + " remove");
    }

    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("UnsupportedOperation" + " getPrice");
    }

    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("UnsupportedOperation" + " getName");
    }

    public void print() {
        throw new UnsupportedOperationException("UnsupportedOperation" + " print");
    }
}
