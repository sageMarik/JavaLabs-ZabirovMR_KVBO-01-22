package task3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        // Логика создания нового текстового документа
        System.out.println("Creating a new text document.");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        // Логика открытия существующего текстового документа
        System.out.println("Opening an existing text document.");
        return new TextDocument();
    }
}

