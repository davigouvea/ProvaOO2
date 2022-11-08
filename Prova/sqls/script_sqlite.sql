
CREATE TABLE IF NOT EXISTS livros(
    id INTEGER PRIMARY KEY, 
    titulo TEXT NOT NULL, 
    editora TEXT NOT NULL,
    paginas INTEGER NOT NULL,
    anoPublicacao INTEGER NOT NULL
);
